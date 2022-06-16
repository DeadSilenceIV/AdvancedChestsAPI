package us.lynuxcraft.deadsilenceiv.advancedchests.services.chest.sells.compatibility;

import com.Zrips.CMI.CMI;
import com.Zrips.CMI.Modules.Worth.WorthItem;
import org.bukkit.OfflinePlayer;
import org.bukkit.inventory.ItemStack;
import us.lynuxcraft.deadsilenceiv.advancedchests.services.chest.sells.SellService;

public class CMIWorth implements SellService{

    @Override
    public Double getSellPrice(OfflinePlayer player, ItemStack stack) {
        ItemStack singleItem = stack.clone();
        singleItem.setAmount(1);
        WorthItem worthItem = CMI.getInstance().getWorthManager().getWorth(singleItem);
        if(worthItem != null){
            Double sellPrice = worthItem.getSellPrice();
            return (sellPrice != null) ? sellPrice : 0.0;
        }
        return 0.0;
    }
}
