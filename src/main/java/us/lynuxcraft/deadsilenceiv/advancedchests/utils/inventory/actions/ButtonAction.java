package us.lynuxcraft.deadsilenceiv.advancedchests.utils.inventory.actions;

import lombok.Getter;
import org.bukkit.event.inventory.ClickType;
import us.lynuxcraft.deadsilenceiv.advancedchests.utils.inventory.Button;

public abstract class ButtonAction extends InventoryAction{
    @Getter private Button button;
    public ButtonAction(ClickType type,Button button) {
        super(type);
        this.button = button;
    }
}
