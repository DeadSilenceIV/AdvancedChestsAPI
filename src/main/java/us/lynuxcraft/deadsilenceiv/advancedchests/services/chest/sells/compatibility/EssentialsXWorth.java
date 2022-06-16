package us.lynuxcraft.deadsilenceiv.advancedchests.services.chest.sells.compatibility;

import com.earth2me.essentials.Essentials;
import com.earth2me.essentials.Worth;
import org.bukkit.OfflinePlayer;
import org.bukkit.inventory.ItemStack;
import us.lynuxcraft.deadsilenceiv.advancedchests.services.chest.sells.SellService;

import java.math.BigDecimal;

public class EssentialsXWorth implements SellService{
    private Essentials essentials;
    private Worth worth;
    public EssentialsXWorth() {
        essentials = Essentials.getPlugin(Essentials.class);
        worth = essentials.getWorth();
    }

    @Override
    public Double getSellPrice(OfflinePlayer player, ItemStack stack) {
        BigDecimal value = worth.getPrice(essentials, stack);
        if(value != null){
            return value.doubleValue();
        }else{
            return 0.0;
        }
    }
}
