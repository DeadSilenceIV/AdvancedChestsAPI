package us.lynuxcraft.deadsilenceiv.advancedchests;


import org.bukkit.inventory.ItemStack;
import us.lynuxcraft.deadsilenceiv.advancedchests.chest.AdvancedChest;
import us.lynuxcraft.deadsilenceiv.advancedchests.managers.ChestsManager;
import us.lynuxcraft.deadsilenceiv.advancedchests.managers.DataManager;

public class AdvancedChestsAPI {

    public static ItemStack dispenseLastItemFromChest(AdvancedChest chest){
        return null;
    }

    public static boolean addItemToChest(AdvancedChest chest, ItemStack stack){
        return true;
    }

    public static ItemStack getAdvancedChestItem(String chestType){
        return null;
    }

    public static String getAdvancedChestsTypeByItem(ItemStack itemStack){
        return null;
    }

    public ItemStack getLastItemFromChest(AdvancedChest chest){
        return null;
    }

    public static DataManager getDataManager(){
        return null;
    }

    public static ChestsManager getChestManager(){
        return null;
    }
}
