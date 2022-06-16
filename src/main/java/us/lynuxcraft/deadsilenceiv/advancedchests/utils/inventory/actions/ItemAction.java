package us.lynuxcraft.deadsilenceiv.advancedchests.utils.inventory.actions;

import lombok.Getter;
import org.bukkit.event.inventory.ClickType;
import org.bukkit.inventory.ItemStack;

public abstract class ItemAction extends InventoryAction{
    @Getter private ItemStack stack;
    public ItemAction(ClickType type, ItemStack stack) {
        super(type);
        this.stack = stack.clone();
    }
}
