package us.lynuxcraft.deadsilenceiv.advancedchests.services.chest.sells;

import org.bukkit.OfflinePlayer;
import us.lynuxcraft.deadsilenceiv.advancedchests.chest.gui.page.ChestPage;

import java.util.Set;

public interface PageBatchSeller {
    
    Double process(Set<ChestPage<?>> pages, OfflinePlayer player);
        
}
