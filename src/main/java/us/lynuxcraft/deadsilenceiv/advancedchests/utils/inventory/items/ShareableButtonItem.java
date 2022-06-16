package us.lynuxcraft.deadsilenceiv.advancedchests.utils.inventory.items;

import us.lynuxcraft.deadsilenceiv.advancedchests.utils.inventory.InteractiveInventory;

import javax.annotation.Nullable;

public interface ShareableButtonItem extends ButtonItem,ShareableItem{

    void show(InteractiveInventory inventory);

    void refresh(@Nullable InteractiveInventory inventory);

}
