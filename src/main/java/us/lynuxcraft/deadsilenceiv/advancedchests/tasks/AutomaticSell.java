package us.lynuxcraft.deadsilenceiv.advancedchests.tasks;

import lombok.Getter;
import lombok.Setter;
import us.lynuxcraft.deadsilenceiv.advancedchests.chest.AdvancedChest;
import us.lynuxcraft.deadsilenceiv.advancedchests.managers.DataManager;
import us.lynuxcraft.deadsilenceiv.advancedchests.services.chest.SellType;
import us.lynuxcraft.deadsilenceiv.advancedchests.utils.inventory.InteractiveInventory;
import us.lynuxcraft.deadsilenceiv.advancedchests.utils.inventory.UniqueButton;

public class AutomaticSell extends PluginTask implements ChestTask{
    @Getter private AdvancedChest<?,?> chest;
    private DataManager dataManager;
    private int counter;
    private int frequency;
    @Getter @Setter private int inactivityCounter;
    public AutomaticSell(AdvancedChest<?,?> chest) {
        this.chest = chest;
        dataManager = plugin.getDataManager();
        inactivityCounter = 0;
        counter = 0;
        frequency = dataManager.getAutoSellsFrequency(getChest().getConfigType());
        runTask(1L,1L);
    }

    @Override
    public void run() {
        counter++;
        if(inactivityCounter >= 25){
            stopTask();
            plugin.getTaskManager().unRegister(this);
            chest.setAutomaticSellsStatus(false);
            InteractiveInventory menu = chest.getSubInventoryByName("automatic-sells");
            if(menu != null){
                UniqueButton button = (UniqueButton)menu.getButtonByName("status-changer");
                button.show("off-status");
            }
        }
        if (counter >= frequency) {
            chest.sell(null, SellType.AUTOMATED);
            counter = 0;
        }
    }
}
