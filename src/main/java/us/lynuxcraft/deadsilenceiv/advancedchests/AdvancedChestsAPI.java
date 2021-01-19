package us.lynuxcraft.deadsilenceiv.advancedchests;

import org.bukkit.inventory.ItemStack;
import us.lynuxcraft.deadsilenceiv.advancedchests.chest.AdvancedChest;
import us.lynuxcraft.deadsilenceiv.advancedchests.managers.ChestsManager;
import us.lynuxcraft.deadsilenceiv.advancedchests.managers.DataManager;

public class AdvancedChestsAPI {

    /**
     * Get the last found item from an advanced chest.
     *
     * @param chest advanced chest instance
     * @return The last item stack from the chest. null if there isn't any.
     */
    public static ItemStack dispenseLastItemFromChest(AdvancedChest chest){
        return null;
    }

    /**
     * Add an item to the advanced chest.
     *
     * @param chest advanced chest instance
     * @param stack item that is going to be added
     * @return True if the item was added correctly, false if the item didn't have space to be added.
     */
    public static boolean addItemToChest(AdvancedChest chest, ItemStack stack){
        return true;
    }

    /**
     * Get an specific advanced chest item.
     *
     * @param chestType type of advanced chest
     * @return The declared advanced chest item. null if the type doesn't exists
     */
    public static ItemStack getAdvancedChestItem(String chestType){
        return null;
    }

    /**
     * Get the type of an advanced chest by item.
     *
     * @param itemStack advanced chest item
     * @return the type of advanced chest. null if the item isn't an advanced chest.
     */
    public static String getAdvancedChestsTypeByItem(ItemStack itemStack){
        return null;
    }

    /**
     * Get the last item from a chest without removing it.
     * @param chest advanced chest instance
     * @return The last item found from an advanced chest.
     */
    public ItemStack getLastItemFromChest(AdvancedChest chest){
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
    public static ChestsManager getChestManager(){
        return null;
    }
}
