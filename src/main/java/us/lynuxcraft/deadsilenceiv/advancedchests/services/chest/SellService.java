package us.lynuxcraft.deadsilenceiv.advancedchests.services.chest;

import org.bukkit.entity.Player;
import org.bukkit.inventory.ItemStack;

public interface SellService{

    /**
     * Used to get the worth of a single item.
     *
     * @param p the player instance
     * @param stack the item stack instance.
     * @return
     */
    Double getSellPrice(Player p, ItemStack stack);

}
