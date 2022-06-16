package us.lynuxcraft.deadsilenceiv.advancedchests.tasks.compress;

import lombok.Getter;
import net.milkbowl.vault.economy.Economy;
import us.lynuxcraft.deadsilenceiv.advancedchests.chest.AdvancedChest;
import us.lynuxcraft.deadsilenceiv.advancedchests.chest.gui.page.ChestPage;
import us.lynuxcraft.deadsilenceiv.advancedchests.managers.DataManager;
import us.lynuxcraft.deadsilenceiv.advancedchests.managers.LanguagesManager;
import us.lynuxcraft.deadsilenceiv.advancedchests.managers.TaskManager;
import us.lynuxcraft.deadsilenceiv.advancedchests.managers.yml.config.IConfiguration;
import us.lynuxcraft.deadsilenceiv.advancedchests.services.chest.compressor.PageBatchCompressor;
import us.lynuxcraft.deadsilenceiv.advancedchests.tasks.ChestTask;
import us.lynuxcraft.deadsilenceiv.advancedchests.tasks.SplitOperation;

public abstract class CompressProcess extends SplitOperation<ChestPage<?>> implements ChestTask{
    protected IConfiguration config;
    protected LanguagesManager languagesManager;
    protected DataManager dataManager;
    protected TaskManager taskManager;
    protected Economy economy;
    protected double price;
    protected int maxDelay;
    protected PageBatchCompressor batchCompressor;
    @Getter protected AdvancedChest<?,?> chest;
    CompressProcess(AdvancedChest<?,?> chest) {
        this.chest = chest;
        config = plugin.getConfiguration();
        languagesManager = plugin.getLanguagesManager();
        dataManager = plugin.getDataManager();
        taskManager = plugin.getTaskManager();
        economy = plugin.getEcon();
        price = dataManager.getCompressorPrice(chest.getConfigType());
        maxDelay = config.getCompressTimeMaxDelay();
        if(maxDelay > 1)chest.closeForViewers();
        batchCompressor = chest.getChestType().getPageBatchCompressor();
    }
}
