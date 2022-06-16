package us.lynuxcraft.deadsilenceiv.advancedchests.services.chest.sells.compatibility;

import me.qKing12.RoyaleEconomy.API.APIHandler;
import me.qKing12.RoyaleEconomy.RoyaleEconomy;
import me.qKing12.RoyaleEconomy.Shops.Shop;
import org.bukkit.OfflinePlayer;
import org.bukkit.entity.Player;
import org.bukkit.inventory.ItemStack;
import us.lynuxcraft.deadsilenceiv.advancedchests.AdvancedChests;
import us.lynuxcraft.deadsilenceiv.advancedchests.AdvancedChestsAPI;
import us.lynuxcraft.deadsilenceiv.advancedchests.services.chest.sells.SellService;

public class RoyaleEconomyWorth implements SellService {
    private APIHandler apiHandler;
    private String shopId;
    public RoyaleEconomyWorth() {
        apiHandler = RoyaleEconomy.apiHandler;
        shopId = AdvancedChestsAPI.getInstance().getConfiguration().getWorthProviderShop();
    }

    @Override
    public Double getSellPrice(OfflinePlayer player, ItemStack stack) {
        if(!apiHandler.shops.getShopsList().isEmpty()){
            boolean isOnline = (player != null && player.isOnline());
            Player onlinePlayer = (isOnline) ? player.getPlayer() : null;
            if(!shopId.isEmpty()){
                Shop shop = apiHandler.shops.getShopByName(shopId);
                if(shop != null){
                    return (isOnline) ? apiHandler.shops.getPriceOfItemWithBoosters(onlinePlayer,stack,shop)/stack.getAmount()
                            : apiHandler.shops.getPriceOfItem(stack,shop)/stack.getAmount();
                }
            }else return (isOnline) ? apiHandler.shops.getPriceOfItemWithBoosters(onlinePlayer,stack)/stack.getAmount()
                    : apiHandler.shops.getPriceOfItem(stack)/stack.getAmount();
        }
        return 0.0;
    }
}
