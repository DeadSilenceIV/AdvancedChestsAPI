package us.lynuxcraft.deadsilenceiv.advancedchests.utils.inventory;

import org.bukkit.event.inventory.InventoryType;
import org.bukkit.inventory.Inventory;
import org.bukkit.inventory.ItemStack;
import us.lynuxcraft.deadsilenceiv.advancedchests.chest.gui.page.ChestPage;

public class InventoryUtils {

    public static int getSpacesForItem(Inventory inventory,ItemStack itemStack){
        int spaces = 0;
        int size = (inventory.getType() == InventoryType.PLAYER) ? inventory.getSize()-5 : inventory.getSize();
        boolean canBeStacked = itemStack.getMaxStackSize() > 1;
        for(int i = 0; i<= size-1;i++){
            ItemStack item = inventory.getItem(i);
            if(item == null){
                spaces += (canBeStacked) ? itemStack.getMaxStackSize() : 1;
            }else if(canBeStacked && item.isSimilar(itemStack)){
                spaces += (itemStack.getMaxStackSize()-item.getAmount());
            }
        }
        return spaces;
    }

    public static boolean hasSpaceForItem(Inventory inventory,ItemStack itemStack){
        int size = (inventory.getType() == InventoryType.PLAYER) ? inventory.getSize()-5 : inventory.getSize();
        int maxStackSize = itemStack.getMaxStackSize();
        for(int i = 0; i<= size-1;i++){
            ItemStack item = inventory.getItem(i);
            if(item == null){
                return true;
            }else if((item.getAmount()+itemStack.getAmount()) <= maxStackSize && item.isSimilar(itemStack)){
                return true;
            }
        }
        return false;
    }

    public static boolean hasSpaceForItem(ChestPage<?> page, ItemStack itemStack){
        Inventory inventory = page.getBukkitInventory();
        int size = inventory.getSize()-9;
        int maxStackSize = itemStack.getMaxStackSize();
        for(int i = size-1; i >= 0;i--){
            ItemStack item = inventory.getItem(i);
            if(item == null){
                return true;
            }else if((item.getAmount()+itemStack.getAmount()) <= maxStackSize && item.isSimilar(itemStack)){
                return true;
            }
        }
        return false;
    }

    public static Integer getFirstEmptySlot(Inventory inventory){
        for (int i = 0; i < inventory.getSize(); i++) {
            if(inventory.getItem(i) == null)return i;
        }
        return null;
    }

}
