package us.lynuxcraft.deadsilenceiv.advancedchests.services.chest.compressor;

import us.lynuxcraft.deadsilenceiv.advancedchests.chest.AdvancedChest;
import us.lynuxcraft.deadsilenceiv.advancedchests.chest.gui.page.ChestPage;
import us.lynuxcraft.deadsilenceiv.advancedchests.services.chest.CompressionStatus;

import java.util.Set;

public interface PageBatchCompressor {

    CompressionStatus process(AdvancedChest<?,?> chest, Set<ChestPage<?>> pages);

}
