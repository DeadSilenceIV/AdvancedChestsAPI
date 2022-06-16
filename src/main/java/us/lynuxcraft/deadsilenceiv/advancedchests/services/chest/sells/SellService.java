package us.lynuxcraft.deadsilenceiv.advancedchests.services.chest.sells;

import org.bukkit.OfflinePlayer;
import org.bukkit.entity.Player;
import org.bukkit.inventory.ItemStack;

public interface SellService{

    @Deprecated
    default Double getSellPrice(Player player,ItemStack stack){
        return getSellPrice((OfflinePlayer)player,stack);
    }

    Double getSellPrice(OfflinePlayer player, ItemStack stack);

    default void onSell(OfflinePlayer player,ItemStack stack){}

}
