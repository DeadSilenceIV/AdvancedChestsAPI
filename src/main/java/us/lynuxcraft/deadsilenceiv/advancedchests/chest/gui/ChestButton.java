package us.lynuxcraft.deadsilenceiv.advancedchests.chest.gui;

import net.milkbowl.vault.economy.Economy;

import us.lynuxcraft.deadsilenceiv.advancedchests.AdvancedChests;
import us.lynuxcraft.deadsilenceiv.advancedchests.AdvancedChestsAPI;
import us.lynuxcraft.deadsilenceiv.advancedchests.managers.DataManager;
import us.lynuxcraft.deadsilenceiv.advancedchests.managers.InventoryManager;
import us.lynuxcraft.deadsilenceiv.advancedchests.managers.LanguagesManager;
import us.lynuxcraft.deadsilenceiv.advancedchests.managers.TaskManager;
import us.lynuxcraft.deadsilenceiv.advancedchests.managers.yml.config.IConfiguration;
import us.lynuxcraft.deadsilenceiv.advancedchests.utils.inventory.BaseButton;
import us.lynuxcraft.deadsilenceiv.advancedchests.utils.inventory.items.ButtonItem;

public class ChestButton<T extends ButtonItem> extends BaseButton<T>{
    protected AdvancedChests plugin;
    protected DataManager dataManager;
    protected LanguagesManager languages;
    protected InventoryManager inventoryManager;
    protected TaskManager taskManager;
    protected IConfiguration config;
    protected Economy economy;
    public ChestButton(String name) {
        super(name);
        plugin = AdvancedChestsAPI.getInstance();
        dataManager = plugin.getDataManager();
        languages = plugin.getLanguagesManager();
        inventoryManager = plugin.getInventoryManager();
        taskManager = plugin.getTaskManager();
        config = plugin.getConfiguration();
        economy = plugin.getEcon();
    }

    protected void loadPlaceholders(){}
}
