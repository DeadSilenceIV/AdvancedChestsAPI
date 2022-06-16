package us.lynuxcraft.deadsilenceiv.advancedchests.services.chest.sells.compatibility;

import org.black_ixx.bossshop.BossShop;
import org.black_ixx.bossshop.api.BossShopAPI;
import org.black_ixx.bossshop.core.BSBuy;
import org.black_ixx.bossshop.core.BSShop;
import org.black_ixx.bossshop.core.prices.BSPriceType;
import org.black_ixx.bossshop.core.prices.BSPriceTypeItem;
import org.black_ixx.bossshop.core.rewards.BSRewardType;
import org.black_ixx.bossshop.core.rewards.BSRewardTypeMoney;
import org.black_ixx.bossshop.core.rewards.BSRewardTypeShop;
import org.bukkit.Bukkit;
import org.bukkit.OfflinePlayer;
import org.bukkit.event.inventory.ClickType;
import org.bukkit.inventory.ItemStack;
import us.lynuxcraft.deadsilenceiv.advancedchests.AdvancedChests;
import us.lynuxcraft.deadsilenceiv.advancedchests.AdvancedChestsAPI;
import us.lynuxcraft.deadsilenceiv.advancedchests.services.chest.WorthProvider;
import us.lynuxcraft.deadsilenceiv.advancedchests.services.chest.sells.SellService;

import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class BossShopProWorth implements SellService{
    private BossShop plugin;
    private BossShopAPI api;
    private String shopId;
    private Set<BSShop> shops;
    public BossShopProWorth() {
        plugin = ((BossShop)Bukkit.getPluginManager().getPlugin(WorthProvider.BOSS_SHOP_PRO.getPluginName()));
        shopId = AdvancedChestsAPI.getInstance().getConfiguration().getWorthProviderShop().toLowerCase();
    }

    @Override
    public Double getSellPrice(OfflinePlayer player, ItemStack stack) {
        if(shops == null){
            shops = new HashSet<>();
            getShops();
        }
        for (BSShop shop : shops) {
            for (BSBuy item : shop.getItems()) {
                BSRewardType rewardType = item.getRewardType(ClickType.LEFT);
                if(rewardType instanceof BSRewardTypeMoney){
                    double money = (double)item.getReward(ClickType.LEFT);
                    BSPriceType priceType = item.getPriceType(ClickType.LEFT);
                    if(priceType instanceof BSPriceTypeItem){
                        List<ItemStack> requiredStacks  = (List<ItemStack>)item.getPrice(ClickType.LEFT);
                        for (ItemStack requiredStack : requiredStacks) {
                            if(requiredStack.isSimilar(stack) && requiredStack.getAmount() == 1){
                                return money;
                            }
                        }
                    }
                }
            }
        }
        return 0.0;
    }

    /**
     * Saves all the related shops with the {@link #shopId} into the {@link #shops}.
     */
    private void getShops(){
        api = plugin.getAPI();
        BSShop shop = api.getShop(shopId);
        shops.add(shop);
        for (BSBuy bsBuy : shop.getItems()) {
            if(bsBuy.getRewardType(ClickType.LEFT) instanceof BSRewardTypeShop){
                BSShop bsShop = api.getShop((String)bsBuy.getReward(ClickType.LEFT));
                shops.add(bsShop);
            }
        }
    }
}
