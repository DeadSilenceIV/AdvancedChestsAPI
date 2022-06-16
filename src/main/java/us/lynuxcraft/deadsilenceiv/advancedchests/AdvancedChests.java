package us.lynuxcraft.deadsilenceiv.advancedchests;

import net.milkbowl.vault.economy.Economy;
import org.bukkit.plugin.Plugin;
import us.lynuxcraft.deadsilenceiv.advancedchests.chest.ChestType;
import us.lynuxcraft.deadsilenceiv.advancedchests.managers.*;
import us.lynuxcraft.deadsilenceiv.advancedchests.managers.yml.config.IConfiguration;
import us.lynuxcraft.deadsilenceiv.advancedchests.services.chest.sells.ChestSeller;


public interface AdvancedChests extends Plugin {

    IConfiguration getConfiguration();

    ChestSeller getChestSeller();

    DataManager getDataManager();

    ChestsManager getChestsManager();

    ChestStorage getChestStorage();

    InventoryManager getInventoryManager();

    TaskManager getTaskManager();

    LanguagesManager getLanguagesManager();

    boolean isLoaded();

    /**
     * Reloads the plugin entirely.
     */
    void reloadPlugin();

    /**
     * Checks if the server is on a legacy version.
     *
     * @return true if is on a legacy version, false otherwise.
     */
    boolean isLegacyVersion();

    boolean isNbtApiAvailable();

    boolean isProtocolLibAvailable();

    /**
     * Gets hopper-amount option of the spigot.yml file.
     *
     * @return the value of the option.
     */
    Integer getHopperAmount();

    Economy getEcon();

    void registerType(ChestType type);

    ChestType getType(String name);

}
