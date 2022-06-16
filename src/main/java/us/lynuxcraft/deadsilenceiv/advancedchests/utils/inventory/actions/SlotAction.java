package us.lynuxcraft.deadsilenceiv.advancedchests.utils.inventory.actions;

import lombok.Getter;
import org.bukkit.event.inventory.ClickType;

public abstract class SlotAction extends InventoryAction{
    @Getter private int slot;
    public SlotAction(ClickType type, int slot) {
        super(type);
        this.slot = slot;
    }
}
