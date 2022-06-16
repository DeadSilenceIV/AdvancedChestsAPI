package us.lynuxcraft.deadsilenceiv.advancedchests.services.chest.sells.compatibility;

import lee.code.onestopshop.OneStopShop;
import org.bukkit.OfflinePlayer;
import org.bukkit.inventory.ItemStack;
import us.lynuxcraft.deadsilenceiv.advancedchests.services.chest.sells.SellService;

public class OneStopShopWorth implements SellService{

    @Override
    public Double getSellPrice(OfflinePlayer player, ItemStack stack) {
        ItemStack singleItem = stack.clone();
        singleItem.setAmount(1);
        return OneStopShop.getPlugin().getApi().getItemSellValue(singleItem);
    }
}
