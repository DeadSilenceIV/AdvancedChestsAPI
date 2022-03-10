package us.lynuxcraft.deadsilenceiv.advancedchests;

import org.bukkit.inventory.ItemStack;
import us.lynuxcraft.deadsilenceiv.advancedchests.chest.AdvancedChest;
import us.lynuxcraft.deadsilenceiv.advancedchests.managers.ChestsManager;
import us.lynuxcraft.deadsilenceiv.advancedchests.managers.DataManager;
import us.lynuxcraft.deadsilenceiv.advancedchests.managers.InventoryManager;
import us.lynuxcraft.deadsilenceiv.advancedchests.services.chest.dispenser.ChestDispenser;
import us.lynuxcraft.deadsilenceiv.advancedchests.services.chest.seller.ChestSeller;

public class AdvancedChestsAPI {

    /**
     * Get the last found item from an advanced chest.
     *
     * @param chest advanced chest instance
     * @return The last item stack from the chest. null if there isn't any.
     */
    @Deprecated
    public static ItemStack dispenseLastItemFromChest(AdvancedChest<?,?> chest){
        return null;
    }

    /**
     * Add an item to the advanced chest.
     *
     * @param chest advanced chest instance
     * @param stack item that is going to be added
     * @return True if the item was added correctly, false if the item didn't have space to be added.
     */
    @Deprecated
    public static boolean addItemToChest(AdvancedChest<?,?> chest, ItemStack stack){
        return false;
    }

    /**
     * Checks if there is space for the item inside the advanced chest.
     *
     * @param chest the advanced chest instance
     * @param stack item that is going to be checked
     * @return true if the chest has space for the item, false otherwise.
     */
    @Deprecated
    public static boolean hasSpaceForItem(AdvancedChest<?,?> chest,ItemStack stack){return false;}

    /**
     * Get a specific advanced chest item.
     *
     * @param chestType type of advanced chest
     * @return The declared advanced chest item. null if the type doesn't exist.
     */
    public static ItemStack getAdvancedChestItem(String chestType){
        return null;
    }

    /**
     * Get the type of advanced chest by item.
     *
     * @param itemStack advanced chest item
     * @return the type of advanced chest. null if the item isn't an advanced chest.
     */
    public static String getAdvancedChestsTypeByItem(ItemStack itemStack){
        return null;
    }

    /**
     * Get the last item from a chest without removing it.
     *
     * @param chest advanced chest instance
     * @return The last item found from an advanced chest.
     */
    @Deprecated
    public ItemStack getLastItemFromChest(AdvancedChest<?,?> chest){
        return null;
    }

    /**
     * Get the data manager.
     */
    public static DataManager getDataManager(){
        return null;
    }

    /**
     * Get the chest manager.
     */
    public static ChestsManager getChestManager() {
        return null;
    }

    /**
     * Gets the inventory manager.
     */
    public static InventoryManager getInventoryManager(){return null;}

    /**
     * Get the chest seller.
     */
    public static ChestSeller getChestSeller(){ return null;}

    public static ChestDispenser getChestDispenser(){return null;}
}
