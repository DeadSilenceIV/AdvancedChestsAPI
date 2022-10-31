package us.lynuxcraft.deadsilenceiv.advancedchests.utils.inventory.items;

import us.lynuxcraft.deadsilenceiv.advancedchests.utils.ItemPlaceHolder;

import java.util.Set;

public interface ButtonItem extends InteractiveItem{

    String getName();

    Set<ItemPlaceHolder> getPlaceholders();

    void addPlaceholder(ItemPlaceHolder placeholder);

}
