package us.lynuxcraft.deadsilenceiv.advancedchests.managers;

import us.lynuxcraft.deadsilenceiv.advancedchests.chest.AdvancedChest;
import us.lynuxcraft.deadsilenceiv.advancedchests.tasks.AutomaticSell;
import us.lynuxcraft.deadsilenceiv.advancedchests.tasks.PluginTask;
import us.lynuxcraft.deadsilenceiv.advancedchests.tasks.compress.CompressProcess;
import us.lynuxcraft.deadsilenceiv.advancedchests.tasks.sells.SellProcess;

public interface TaskManager{

    /**
     * Registers a specified PluginTask.
     *
     * @param task the PluginTask instance.
     */
    void register(PluginTask task);

    /**
     * Un-Registers a specified PluginTask.
     *
     * @param task the PluginTask instance.
     */
    void unRegister(PluginTask task);

    /**
     * Stops all the plugin tasks.
     */
    void stopTasks();

    /**
     * Gets the SellProcess of a specified AdvancedChest.
     *
     * @param chest the AdvancedChest instance
     * @return the SellProcess instance, null if was not found.
     */
    SellProcess getSellProcessByChest(AdvancedChest<?,?> chest);

    /**
     * Gets the AutomaticSell task of a specified AdvancedChest.
     *
     * @param chest the AdvancedChest instance
     * @return the AutomaticSell instance, null if was not found.
     */
    AutomaticSell getAutomaticSellByChest(AdvancedChest<?,?> chest);

    /**
     * Gets the CompressProcess of a specified AdvancedChest.
     *
     * @param chest the AdvancedChest instance
     * @return the CompressProcess instance, null if was not found.
     */
    CompressProcess getCompressProcessByChest(AdvancedChest<?,?> chest);
}

