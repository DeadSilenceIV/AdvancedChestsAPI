package us.lynuxcraft.deadsilenceiv.advancedchests.utils.inventory;

import org.bukkit.inventory.Inventory;
import us.lynuxcraft.deadsilenceiv.advancedchests.utils.inventory.items.UniqueButtonItem;

public interface UniqueButton extends Button<UniqueButtonItem> {

    Integer getSlot();

    Inventory getBukkitInventory();

    default void show(String itemName){
        UniqueButtonItem item = getItemByName(itemName);
        if(item != null){
            item.show();
            setCurrentItem(item);
        }
    }

    default void refresh(){
        if(getCurrentItem() == null)return;
        getCurrentItem().refresh();
    }

}
