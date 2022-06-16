package us.lynuxcraft.deadsilenceiv.advancedchests.services.chest.sells.compatibility;

import fr.maxlego08.shop.api.ShopManager;
import fr.maxlego08.shop.api.button.buttons.ItemButton;
import org.bukkit.Bukkit;
import org.bukkit.OfflinePlayer;
import org.bukkit.inventory.ItemStack;
import org.bukkit.plugin.RegisteredServiceProvider;
import us.lynuxcraft.deadsilenceiv.advancedchests.services.chest.sells.SellService;

import java.util.Optional;

public class ZShopWorth implements SellService{
    private ShopManager shopManager;
    public ZShopWorth() {
        shopManager = getProvider(ShopManager.class);
    }

    @Override
    public Double getSellPrice(OfflinePlayer player, ItemStack stack) {
        Optional<ItemButton> button =  shopManager.getItemButton(stack);
        boolean isOnline = player != null && player.isOnline();
        return isOnline ? button.map(itemButton -> itemButton.getSellPrice(player.getPlayer())).orElse(0.0) : button.map(ItemButton::getSellPrice).orElse(0.0);
    }

    private <T> T getProvider(Class<T> classz) {
        RegisteredServiceProvider<T> provider = Bukkit.getServer().getServicesManager().getRegistration(classz);
        if (provider == null)
            return null;
        return provider.getProvider() != null ? (T) provider.getProvider() : null;
    }
}
