package us.lynuxcraft.deadsilenceiv.advancedchests.services.chest.sells.compatibility;

import me.sat7.dynamicshop.DynaShopAPI;
import org.bukkit.OfflinePlayer;
import org.bukkit.inventory.ItemStack;
import us.lynuxcraft.deadsilenceiv.advancedchests.services.chest.sells.SellService;

public class DynamicShopWorth implements SellService {

    @Override
    public Double getSellPrice(OfflinePlayer player, ItemStack stack) {
        for (String shopName : DynaShopAPI.getShops()) {
            double sellPrice = DynaShopAPI.getSellPrice(shopName,stack);
            if(sellPrice > 0.0){
                return sellPrice;
            }
        }
        return 0.0;
    }

    @Override
    public void onSell(OfflinePlayer player, ItemStack stack) {
        DynaShopAPI.QuickSell(null,stack);
    }

}
