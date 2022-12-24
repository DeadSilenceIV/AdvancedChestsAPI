package us.lynuxcraft.deadsilenceiv.advancedchests.chest;

import us.lynuxcraft.deadsilenceiv.advancedchests.chest.gui.page.ChestPage;
import us.lynuxcraft.deadsilenceiv.advancedchests.services.chest.compressor.PageBatchCompressor;
import us.lynuxcraft.deadsilenceiv.advancedchests.services.chest.dispenser.DispenserService;
import us.lynuxcraft.deadsilenceiv.advancedchests.services.chest.search.SearchService;
import us.lynuxcraft.deadsilenceiv.advancedchests.services.chest.sells.PageBatchSeller;
import us.lynuxcraft.deadsilenceiv.advancedchests.services.chest.smelter.SmelterService;
import us.lynuxcraft.deadsilenceiv.advancedchests.services.chest.sorter.SorterService;
import us.lynuxcraft.deadsilenceiv.advancedchests.services.chest.storage.mysql.MysqlService;
import us.lynuxcraft.deadsilenceiv.advancedchests.services.chest.storage.yaml.YamlService;

import java.util.Set;

public interface ChestType {

    String getName();

    ChestBuilder<?,?,?> newBuilder(int size, String configType, String location, Set<? extends ChestPage<?>> pages);

    MysqlService getMysqlService();

    YamlService getYamlService();

    SorterService getSorterService();

    SmelterService getSmelterService();

    PageBatchSeller getPageBatchSeller();

    DispenserService getDispenserService();

    PageBatchCompressor getPageBatchCompressor();

    SearchService getSearchService();

}
