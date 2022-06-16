package us.lynuxcraft.deadsilenceiv.advancedchests.utils.inventory.items;

import us.lynuxcraft.deadsilenceiv.advancedchests.utils.Placeholder;

import java.util.Set;

public interface ButtonItem extends InteractiveItem{

    String getName();

    Set<Placeholder> getPlaceholders();

    void addPlaceholder(Placeholder placeholder);

}
