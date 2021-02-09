package us.lynuxcraft.deadsilenceiv.advancedchests.services.chest;

import org.bukkit.entity.Player;
import org.bukkit.inventory.ItemStack;

public interface SellService{

    Double getSellPrice(Player p, ItemStack stack);

}
