package us.lynuxcraft.deadsilenceiv.advancedchests.services.chest;

import lombok.Getter;
import org.bukkit.Bukkit;
import us.lynuxcraft.deadsilenceiv.advancedchests.services.chest.sells.SellService;
import us.lynuxcraft.deadsilenceiv.advancedchests.services.chest.sells.compatibility.*;

import java.util.HashSet;
import java.util.Set;

public enum WorthProvider {
    ESSENTIALS("Essentials"),
    SHOPGUIPLUS("ShopGUIPlus"),
    ZSHOP("zShop"),
    ROYALE_ECONOMY("RoyaleEconomy"),
    CMI("CMI"),
    BOSS_SHOP_PRO("BossShopPro"),
    ISLAND_SHOP("IslandShop"),
    ONE_STOP_SHOP("OneStopShop"),
    ECONOMY_SHOP_GUI("EconomyShopGUI"),
    ECONOMY_SHOP_GUI_PREMIUM("EconomyShopGUI-Premium"),
    DELUXE_BAZAAR("DeluxeBazaar"),
    DYNAMIC_SHOP("DynamicShop");

    /**
     * A list that contains all the cached providers during the execution of the method
     * {@link #getAvailableProviders()}
     */
    private static Set<WorthProvider> providers;

    @Getter private String pluginName;
    WorthProvider(String pluginName){
        this.pluginName = pluginName;
    }

    /**
     * Get the {@link SellService} for the provider.
     *
     * @return The specific SellService for the provider.
     */
    public SellService getService(){
        switch (this){
            case ESSENTIALS:
                return new EssentialsXWorth();
            case SHOPGUIPLUS:
                return new ShopGuiPlusWorth();
            case ZSHOP:
                return new ZShopWorth();
            case ROYALE_ECONOMY:
                return new RoyaleEconomyWorth();
            case CMI:
                return new CMIWorth();
            case BOSS_SHOP_PRO:
                return new BossShopProWorth();
            case ISLAND_SHOP:
                return new IslandShopWorth();
            case ONE_STOP_SHOP:
                return new OneStopShopWorth();
            case ECONOMY_SHOP_GUI:
            case ECONOMY_SHOP_GUI_PREMIUM:
                return new EconomyShopGUIWorth();
            case DELUXE_BAZAAR:
                return new DeluxeBazaarWorth();
            case DYNAMIC_SHOP:
                return new DynamicShopWorth();
            default:
                return null;
        }
    }

    /**
     * Gets the availability of the plugin.
     *
     * @return true if the plugin is available, false otherwise.
     */
    public boolean isAvailable(){
        return Bukkit.getPluginManager().getPlugin(pluginName) != null;
    }

    /**
     * Gets all the available providers in the order of declared enum.
     *
     * @return a list that contains all the available providers.
     */
    public static Set<WorthProvider> getAvailableProviders(){
        if(providers == null) {
            providers = new HashSet<>();
            for (WorthProvider provider : WorthProvider.values()) {
                if(provider.isAvailable())providers.add(provider);
            }
        }
        return providers;
    }
}
