package us.lynuxcraft.deadsilenceiv.advancedchests.events;

import lombok.AllArgsConstructor;
import lombok.Getter;
import org.bukkit.entity.Player;
import org.bukkit.event.Event;
import org.bukkit.event.HandlerList;
import org.bukkit.inventory.ItemStack;
import org.jetbrains.annotations.Nullable;
import us.lynuxcraft.deadsilenceiv.advancedchests.services.chest.SellType;
import us.lynuxcraft.deadsilenceiv.advancedchests.utils.SoldItem;

import java.util.Set;

/**
 * Called when the chest is being sold by a player and the automatic selling.
 */
@AllArgsConstructor
public class PostChestSellEvent extends Event {
    private static final HandlerList HANDLERS = new HandlerList();
    @Getter private Set<SoldItem> soldItems;
    @Getter private double totalAmount;
    @Getter private @Nullable Player player;
    @Getter private SellType sellType;

    @Override
    public HandlerList getHandlers() {
        return HANDLERS;
    }

    public static HandlerList getHandlerList() {
        return HANDLERS;
    }
}
