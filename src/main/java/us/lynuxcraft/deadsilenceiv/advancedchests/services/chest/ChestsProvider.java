package us.lynuxcraft.deadsilenceiv.advancedchests.services.chest;

import de.tr7zw.nbtapi.NBTItem;
import org.bukkit.Material;
import org.bukkit.inventory.ItemStack;
import us.lynuxcraft.deadsilenceiv.advancedchests.AdvancedChests;
import us.lynuxcraft.deadsilenceiv.advancedchests.AdvancedChestsAPI;

public class ChestsProvider{

    /**
     * Gets the AdvancedChest item, if NBT is available will be applied.
     *
     * @param chest the chest type
     * @return the ItemStack of the chest.
     */
    public static ItemStack getAdvancedChest(String chest){
        AdvancedChests plugin = AdvancedChestsAPI.getInstance();
        ItemStack icon =  plugin.getDataManager().getIcon(chest);
        if(plugin.isNbtApiAvailable() && plugin.getConfiguration().getUseNBTApi()){
            NBTItem item = new NBTItem(icon);
            item.setString("AdvancedChest",chest);
            return item.getItem();
        }
        return icon;
    }

    /**
     * Gets the AdvancedChest type by the specified ItemStack.
     *
     * @param is the ItemStack instance
     * @return the AdvancedChest type, null if the given item is not an AdvancedChest.
     */
    public static String getAdvancedChestTypeByItem(ItemStack is){
        if(is == null || is.getType() == Material.AIR)return null;
        AdvancedChests plugin = AdvancedChestsAPI.getInstance();
        if(plugin.isNbtApiAvailable() && plugin.getConfiguration().getUseNBTApi()){
            NBTItem item = new NBTItem(is);
            String type = item.getString("AdvancedChest");
            return (type != null && !type.isEmpty()) ? item.getString("AdvancedChest") : null;
        }else{
            for (String type : plugin.getDataManager().getAdvancedChestNames()) {
                ItemStack itemStack = ChestsProvider.getAdvancedChest(type);
                if (itemStack.isSimilar(is)) {
                    return type;
                }
            }
        }
        return null;
    }
}
