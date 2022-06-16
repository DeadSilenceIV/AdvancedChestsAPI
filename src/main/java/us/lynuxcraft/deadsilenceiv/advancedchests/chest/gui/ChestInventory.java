package us.lynuxcraft.deadsilenceiv.advancedchests.chest.gui;

import us.lynuxcraft.deadsilenceiv.advancedchests.chest.AdvancedChest;
import us.lynuxcraft.deadsilenceiv.advancedchests.utils.inventory.InteractiveInventory;

public interface ChestInventory extends InteractiveInventory{

    /**
     * Gets the chest owner of the inventory.
     *
     * @return the chest, null if the inventory has no chest yet.
     */
    AdvancedChest<?,?> getChest();
}
