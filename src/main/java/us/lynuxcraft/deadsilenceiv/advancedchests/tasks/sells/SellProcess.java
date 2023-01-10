package us.lynuxcraft.deadsilenceiv.advancedchests.tasks.sells;

import lombok.Getter;
import net.milkbowl.vault.economy.Economy;
import org.bukkit.inventory.ItemStack;
import us.lynuxcraft.deadsilenceiv.advancedchests.chest.AdvancedChest;
import us.lynuxcraft.deadsilenceiv.advancedchests.chest.gui.page.ChestPage;
import us.lynuxcraft.deadsilenceiv.advancedchests.managers.DataManager;
import us.lynuxcraft.deadsilenceiv.advancedchests.managers.LanguagesManager;
import us.lynuxcraft.deadsilenceiv.advancedchests.managers.TaskManager;
import us.lynuxcraft.deadsilenceiv.advancedchests.managers.yml.config.IConfiguration;
import us.lynuxcraft.deadsilenceiv.advancedchests.services.chest.sells.PageBatchSeller;
import us.lynuxcraft.deadsilenceiv.advancedchests.tasks.ChestTask;
import us.lynuxcraft.deadsilenceiv.advancedchests.tasks.SplitOperation;

import java.util.HashMap;
import java.util.Map;

public abstract class SellProcess extends SplitOperation<ChestPage<?>> implements ChestTask {
    @Getter protected AdvancedChest<?,?> chest;
    protected IConfiguration config;
    protected LanguagesManager languagesManager;
    protected DataManager dataManager;
    protected TaskManager taskManager;
    protected Economy economy;
    protected int maxDelay;
    protected double totalValue;
    protected PageBatchSeller batchSeller;
    protected Map<ItemStack,Double> soldContents;
    SellProcess(AdvancedChest<?,?> chest) {
        this.chest = chest;
        config = plugin.getConfiguration();
        languagesManager = plugin.getLanguagesManager();
        dataManager = plugin.getDataManager();
        taskManager = plugin.getTaskManager();
        economy = plugin.getEcon();
        this.totalValue = 0;
        maxDelay = config.getSellTimeMaxDelay();
        if(maxDelay > 1)chest.closeForViewers();
        batchSeller = chest.getChestType().getPageBatchSeller();
        soldContents = new HashMap<>();
        start(0L,20L,maxDelay,chest.getOrderedPages());
        taskManager.register(this);
    }

}
