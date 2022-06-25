package us.lynuxcraft.deadsilenceiv.advancedchests;


import org.bukkit.inventory.ItemStack;
import us.lynuxcraft.deadsilenceiv.advancedchests.managers.ChestsManager;
import us.lynuxcraft.deadsilenceiv.advancedchests.managers.DataManager;
import us.lynuxcraft.deadsilenceiv.advancedchests.managers.InventoryManager;
import us.lynuxcraft.deadsilenceiv.advancedchests.services.chest.ChestsProvider;
import us.lynuxcraft.deadsilenceiv.advancedchests.services.chest.dispenser.ChestDispenser;
import us.lynuxcraft.deadsilenceiv.advancedchests.services.chest.sells.ChestSeller;

public class AdvancedChestsAPI {

    private static AdvancedChests instance;

    private static ChestDispenser dispenser;

    /**
     * Gets a specific advanced chest item.
     *
     * @param chestType type of advanced chest
     * @return the declared advanced chest item. null if the type doesn't exist.
     */
    public static ItemStack getAdvancedChestItem(String chestType){
        return ChestsProvider.getAdvancedChest(chestType);
    }

    /**
     * Gets the type of advanced chest by item.
     *
     * @param itemStack advanced chest item
     * @return the type of advanced chest. null if the item isn't an advanced chest.
     */
    public static String getAdvancedChestsTypeByItem(ItemStack itemStack){
        return ChestsProvider.getAdvancedChestTypeByItem(itemStack);
    }
    /**
     * Gets the data manager.
     */
    public static DataManager getDataManager(){
        return instance.getDataManager();
    }

    /**
     * Gets the chest manager.
     */
    public static ChestsManager getChestManager(){
        return instance.getChestsManager();
    }

    /**
     * Gets the inventory manager.
     */
    public static InventoryManager getInventoryManager(){return instance.getInventoryManager();}

    /**
     * Gets the chests' seller.
     */
    public static ChestSeller getChestSeller(){
        return instance.getChestSeller();
    }

    @Deprecated
    public static ChestDispenser getChestDispenser(){
        if(dispenser == null){
            dispenser = new ChestDispenser();
        }
        return dispenser;
    }

    public static void setInstance(AdvancedChests inst){
        if(instance == null){
            instance = inst;
        }
    }

    public static AdvancedChests getInstance() {
        return instance;
    }
}
