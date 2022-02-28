package us.lynuxcraft.deadsilenceiv.advancedchests.managers;

import org.bukkit.inventory.Inventory;
import us.lynuxcraft.deadsilenceiv.advancedchests.chest.AdvancedChest;
import us.lynuxcraft.deadsilenceiv.advancedchests.utils.inventory.InteractiveInventory;

public class InventoryManager {

    /**
     * Gets an AdvancedChest by an inventory
     * Only ChestPage inventories will be taken in count.
     *
     * @param inventory the inventory instance
     * @return the chest instance, null if the inventory doesn't belong to the chest.
     */
    public AdvancedChest getAdvancedChest(Inventory inventory){
        return null;
    }

    /**
     * Gets the interactive inventory by its bukkit inventory.
     *
     * @param inventory the Inventory instance
     * @return the InteractiveInventory instance, null if the there is any InteractiveInventory associated.
     */
    public InteractiveInventory getInteractiveByBukkit(Inventory inventory){
        return null;
    }

}
