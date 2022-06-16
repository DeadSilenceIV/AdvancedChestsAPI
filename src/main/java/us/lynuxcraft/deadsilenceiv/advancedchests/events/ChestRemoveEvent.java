package us.lynuxcraft.deadsilenceiv.advancedchests.events;

import lombok.Getter;
import lombok.Setter;
import org.bukkit.event.Cancellable;
import org.bukkit.event.Event;
import org.bukkit.event.HandlerList;
import org.bukkit.event.block.BlockBreakEvent;
import us.lynuxcraft.deadsilenceiv.advancedchests.chest.AdvancedChest;

/**
 * Called when a chest is being removed
 * {@link AdvancedChest#remove(BlockBreakEvent,org.bukkit.entity.Player, boolean)}.
 */
public class ChestRemoveEvent extends Event implements Cancellable{
    private static final HandlerList HANDLERS = new HandlerList();
    @Getter private AdvancedChest chest;
    @Getter @Setter private boolean cancelled;
    public ChestRemoveEvent(AdvancedChest chest) {
        this.chest = chest;
    }

    @Override
    public HandlerList getHandlers() {
        return HANDLERS;
    }

    public static HandlerList getHandlerList() {
        return HANDLERS;
    }
}
