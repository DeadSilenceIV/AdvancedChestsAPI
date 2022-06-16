package us.lynuxcraft.deadsilenceiv.advancedchests.services.chest.sells.compatibility;

import me.sedattr.bazaar.api.BazaarAPI;
import me.sedattr.bazaar.other.Variables;
import org.bukkit.OfflinePlayer;
import org.bukkit.inventory.ItemStack;
import us.lynuxcraft.deadsilenceiv.advancedchests.services.chest.sells.SellService;

public class DeluxeBazaarWorth implements SellService{
    private BazaarAPI api;
    public DeluxeBazaarWorth() {
        api = new BazaarAPI();
    }

    @Override
    public Double getSellPrice(OfflinePlayer player, ItemStack stack) {
        return api.getSellPrice(Variables.itemHandler.getItemName(stack));
    }

}
