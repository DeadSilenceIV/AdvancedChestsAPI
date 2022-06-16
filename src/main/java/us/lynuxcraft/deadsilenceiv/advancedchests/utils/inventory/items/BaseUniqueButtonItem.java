package us.lynuxcraft.deadsilenceiv.advancedchests.utils.inventory.items;

import org.bukkit.inventory.ItemStack;
import org.bukkit.inventory.meta.ItemMeta;
import us.lynuxcraft.deadsilenceiv.advancedchests.utils.inventory.UniqueButton;

public class BaseUniqueButtonItem extends BaseButtonItem<UniqueButton> implements UniqueButtonItem {
    public BaseUniqueButtonItem(UniqueButton button, String name, ItemStack itemStack) {
        super(button, name, itemStack);
    }

    @Override
    public void show() {
        if(!initiallyRefreshed && !placeholders.isEmpty()){
            refresh();
        }else button.getBukkitInventory().setItem(button.getSlot(), itemStack);
    }

    @Override
    public void refresh() {
        ItemMeta updatedMeta = originalMeta.clone();
        updateName(updatedMeta);
        updateLore(updatedMeta);
        itemStack.setItemMeta(updatedMeta);
        button.getBukkitInventory().setItem(button.getSlot(), itemStack);
        initiallyRefreshed = true;
    }

}
