package us.lynuxcraft.deadsilenceiv.advancedchests.utils.inventory;

import org.jetbrains.annotations.NotNull;
import us.lynuxcraft.deadsilenceiv.advancedchests.utils.inventory.items.ShareableButtonItem;

import javax.annotation.Nullable;

public interface ShareableButton extends Button<ShareableButtonItem> {

    Integer getSlot(@NotNull InteractiveInventory inventory);

    default void show(String itemName, @NotNull InteractiveInventory inventory){
        ShareableButtonItem item = getItemByName(itemName);
        if(item != null){
            item.show(inventory);
            setCurrentItem(item);
        }
    }

    default void refresh(@Nullable InteractiveInventory inventory){
        if(getCurrentItem() == null)return;
        getCurrentItem().refresh(inventory);
    }
}
