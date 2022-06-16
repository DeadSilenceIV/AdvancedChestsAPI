package us.lynuxcraft.deadsilenceiv.advancedchests.chest.gui;

import lombok.Getter;
import org.bukkit.inventory.Inventory;
import us.lynuxcraft.deadsilenceiv.advancedchests.chest.AdvancedChest;
import us.lynuxcraft.deadsilenceiv.advancedchests.utils.inventory.UniqueButton;
import us.lynuxcraft.deadsilenceiv.advancedchests.utils.inventory.items.UniqueButtonItem;

public abstract class UniqueChestButton extends ChestButton<UniqueButtonItem> implements UniqueButton {
    @Getter protected ChestInventory inventory;
    protected AdvancedChest<?,?> chest;
    public UniqueChestButton(ChestInventory inventory,String name) {
        super(name);
        if(inventory != null) {
            this.setInventory(inventory);
        }
    }

    public abstract void build();

    public abstract void loadActions();

    @Override
    public Inventory getBukkitInventory() {
        return inventory.getBukkitInventory();
    }

    public void setInventory(ChestInventory inventory){
        this.inventory = inventory;
        this.chest = inventory.getChest();
    }

}
