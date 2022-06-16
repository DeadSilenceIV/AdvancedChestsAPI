package us.lynuxcraft.deadsilenceiv.advancedchests.services.chest.sells.compatibility;

import net.aboodyy.islandshop.IslandShopAPI;
import org.bukkit.OfflinePlayer;
import org.bukkit.inventory.ItemStack;
import us.lynuxcraft.deadsilenceiv.advancedchests.services.chest.sells.SellService;

public class IslandShopWorth implements SellService {

    @Override
    public Double getSellPrice(OfflinePlayer player, ItemStack stack) {
        if(player != null){
            return IslandShopAPI.getSellPrice(player,stack)/stack.getAmount();
        }else return IslandShopAPI.getSellPrice(stack)/stack.getAmount();
    }

    @Override
    public void onSell(OfflinePlayer player, ItemStack stack) {
        IslandShopAPI.increaseSoldAmount(player,stack,stack.getAmount());
    }

}
