package us.lynuxcraft.deadsilenceiv.advancedchests.services.chest.sells.compatibility;

import me.gypopo.economyshopgui.api.EconomyShopGUIHook;
import org.bukkit.OfflinePlayer;
import org.bukkit.inventory.ItemStack;
import us.lynuxcraft.deadsilenceiv.advancedchests.services.chest.sells.SellService;

public class EconomyShopGUIWorth implements SellService{

    @Override
    public Double getSellPrice(OfflinePlayer player, ItemStack stack) {
        Double itemPrice = EconomyShopGUIHook.getItemSellPrice(stack);
        if(itemPrice == null)return 0.0;
        return itemPrice/stack.getAmount();
    }

}
