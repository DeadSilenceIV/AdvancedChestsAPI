package us.lynuxcraft.deadsilenceiv.advancedchests.utils.inventory.actions;

import lombok.Getter;
import lombok.Setter;
import org.bukkit.entity.Player;
import org.bukkit.event.inventory.ClickType;

public abstract class InventoryAction {
    @Getter private ClickType clickType;
    @Getter @Setter private int priority;
    InventoryAction(ClickType type){
        this.clickType = type;
        this.priority = 0;
    }

    /**
     * Executes the developed action.
     *
     * @param player the player instance.
     */
    public abstract boolean execute(Player player);
}
