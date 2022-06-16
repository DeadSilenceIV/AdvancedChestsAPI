package us.lynuxcraft.deadsilenceiv.advancedchests.services.chest.sells.compatibility;

import net.brcdev.shopgui.ShopGuiPlusApi;
import net.brcdev.shopgui.exception.player.PlayerDataNotLoadedException;
import net.brcdev.shopgui.player.PlayerData;
import net.brcdev.shopgui.shop.Shop;
import net.brcdev.shopgui.shop.ShopItem;
import org.bukkit.OfflinePlayer;
import org.bukkit.entity.Player;
import org.bukkit.inventory.ItemStack;
import us.lynuxcraft.deadsilenceiv.advancedchests.AdvancedChests;
import us.lynuxcraft.deadsilenceiv.advancedchests.AdvancedChestsAPI;
import us.lynuxcraft.deadsilenceiv.advancedchests.services.chest.sells.SellService;

public class ShopGuiPlusWorth implements SellService {
    private String shopId;
    public ShopGuiPlusWorth() {
        shopId = AdvancedChestsAPI.getInstance().getConfiguration().getWorthProviderShop();
    }

    @Override
    public Double getSellPrice(OfflinePlayer player, ItemStack stack) {
        ShopItem shopItem;
        Shop shop = ShopGuiPlusApi.getShop(shopId);
        boolean isOnline = (player != null && player.isOnline());
        Player onlinePlayer = (isOnline) ? player.getPlayer() : null;
        if(shop != null){
            if(isOnline) {
                try {
                    PlayerData data = ShopGuiPlusApi.getPlugin().getPlayerManager().getPlayerData(player);
                    shopItem = shop.findShopItem(onlinePlayer, data, stack, true);
                } catch (PlayerDataNotLoadedException e) {
                    shopItem = shop.findShopItem(stack, true);
                }
            }else shopItem = shop.findShopItem(stack, true);
        }else{
            shopItem = (isOnline) ?  ShopGuiPlusApi.getItemStackShopItem(onlinePlayer, stack) : ShopGuiPlusApi.getItemStackShopItem(stack);
        }
        if(shopItem != null) {
            return (isOnline) ? shopItem.getSellPriceForAmount(onlinePlayer,1) : shopItem.getSellPriceForAmount(1);
        }
        return 0.0;
    }
}
