package us.lynuxcraft.deadsilenceiv.advancedchests.services.chest.sells;

import org.bukkit.OfflinePlayer;
import org.bukkit.inventory.ItemStack;
import us.lynuxcraft.deadsilenceiv.advancedchests.chest.gui.page.ChestPage;
import us.lynuxcraft.deadsilenceiv.advancedchests.utils.Pair;

import java.util.Map;
import java.util.Set;

public interface PageBatchSeller {

    Pair<Map<ItemStack,Double>,Double> process(Set<ChestPage<?>> pages, OfflinePlayer player);

}
