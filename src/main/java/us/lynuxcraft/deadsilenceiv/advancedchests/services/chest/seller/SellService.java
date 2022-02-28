package us.lynuxcraft.deadsilenceiv.advancedchests.services.chest.seller;

import org.bukkit.OfflinePlayer;
import org.bukkit.inventory.ItemStack;

public interface SellService{

    Double getSellPrice(OfflinePlayer p, ItemStack stack);

}
