package us.lynuxcraft.deadsilenceiv.advancedchests.events;

import lombok.AllArgsConstructor;
import org.bukkit.entity.Player;
import org.bukkit.event.Event;
import org.bukkit.event.HandlerList;
import org.bukkit.inventory.ItemStack;
import org.jetbrains.annotations.Nullable;
import us.lynuxcraft.deadsilenceiv.advancedchests.services.chest.SellType;

import java.util.Map;

/**
 * Called when the chest is being sold by a player and the automatic selling.
 */
@AllArgsConstructor
public class PostChestSellEvent extends Event {
    private static final HandlerList HANDLERS = new HandlerList();
    private Map<ItemStack,Double> getSoldItems;
    private double totalAmount;
    private @Nullable Player player;
    private SellType sellType;

    @Override
    public HandlerList getHandlers() {
        return HANDLERS;
    }

    public static HandlerList getHandlerList() {
        return HANDLERS;
    }
}
