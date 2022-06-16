package us.lynuxcraft.deadsilenceiv.advancedchests.managers.yml.config;

import org.bukkit.event.EventPriority;
import us.lynuxcraft.deadsilenceiv.advancedchests.services.chest.WorthProvider;
import us.lynuxcraft.deadsilenceiv.advancedchests.services.economy.PluginEconomy;

import java.util.*;

public interface IConfiguration {

    Map<String,Map<String,Object>> getOptions();

    /**
     * Gets the WorthProvider specified at the config.
     *
     * @return the WorthProvider instance.
     */
    WorthProvider getWorthProvider();

    /**
     * Gets the shop for the WorthProvider.
     *
     * @return the shop name.
     */
    String getWorthProviderShop();

    /**
     * Gets the Plugin Economy of a specified service path.
     *
     * @param path the config path at the enhancement section
     * @return the PluginEconomy instance.
     */
    PluginEconomy getServicePluginEconomy(String path);

    /**
     * Gets the volume of all plugin's sounds.
     *
     * @return volume of plugin's sounds.
     */
    float getSoundsVolume();

    /**
     * Gets the pitch of all plugin's sounds.
     *
     * @return pitch of plugin's sounds.
     */
    float getSoundsPitch();

    /**
     * Checks if the upgrade confirmation is available.
     *
     * @return true if is available, false otherwise.
     */
    boolean isUpgradeConfirmation();

    /**
     * Checks if the sell confirmation is available.
     *
     * @return true if is available, false otherwise.
     */
    boolean isSellConfirmation();

    /**
     * Checks if the smelt confirmation is available.
     *
     * @return true if is available, false otherwise.
     */
    boolean isSmeltConfirmation();

    /**
     * Checks if the compress confirmation is available.
     *
     * @return true if is available, false otherwise.
     */
    boolean isCompressConfirmation();

    /**
     * Gets the color of the background of the break confirmation.
     *
     * @return the color of the background.
     */
    short getBreakConfirmationColor();

    /**
     * Gets the color of the background of the upgrade confirmation.
     *
     * @return the color of the background.
     */
    short getUpgradeConfirmationColor();

    /**
     * Gets the color of the background of the sell confirmation.
     *
     * @return the color of the background.
     */
    short getSellConfirmationColor();

    /**
     * Gets the color of the background of the smelt confirmation.
     *
     * @return the color of the background.
     */
    short getSmeltConfirmationColor();

    /**
     * Gets the background color of the compress confirmation.
     *
     * @return the color of the background.
     */
    short getCompressConfirmationColor();

    /**
     * Gets the color of the background of the automatic sells menu.
     *
     * @return the color of the background.
     */
    short getAutoSellsMenuColor();

    /**
     * Gets the color of the background of the chest shop.
     *
     * @return the color of the background.
     */
    short getChestsShopColor();

    /**
     * Gets the color of the background of the sorters menu.
     *
     * @return the color of the background.
     */
    short getSortersMenuColor();

    /**
     * Checks if the automatic sells must be disabled when there is inactivity.
     *
     * @return true if the automatic sells must be disabled, false otherwise.
     */
    boolean getAutoSellsDisableWhenInactive();

    /**
     * Checks if a player's chest auto-sell sessions should be restored
     * when reconnecting to the server.
     *
     * @return true if the automatic sells must be enabled, false otherwise.
     */
    boolean getAutoSellsEnableOnReconnect();

    /**
     * Gets the maximum amount of time that a SellProcess can take.
     *
     * @return the amount of time in seconds.
     */
    int getSellTimeMaxDelay();

    /**
     * Gets the maximum amount of time that a CompressProcess can take.
     *
     * @return the amount of time in seconds.
     */
    int getCompressTimeMaxDelay();

    /**
     * Gets the maximum amount of time that a ChestLoader task can take.
     *
     * @return the amount of time in seconds.
     */
    int getChestsLoadingTimeMaxDelay();

    /**
     * Checks the breaking event of the chest must be cancelled if the chest is not empty.
     *
     * @return true if the event must be cancelled, false otherwise.
     */
    boolean getOnBreakWaitForEmptyChest();

    /**
     * Checks if is necessary to display a confirmation gui before breaking a chest.
     *
     * @return true if is necessary, false otherwise.
     */
    boolean getOnBreakConfirmation();

    /**
     * Checks if the chest must be dropped when the chest is being removed.
     *
     * @return true if the chest must be dropped.
     */
    boolean getOnBreakDropChest();

    /**
     * Checks if the chest's money must be claimed when the chest is being removed.
     *
     * @return true if the chest's money must be claimed.
     */
    boolean getOnBreakClaimChestMoney();

    /**
     * Checks if the content must be dropped when the chest being removed.
     *
     * @return true if the content must be dropped, false otherwise.
     */
    boolean getOnBreakDropContent();

    /**
     * Checks if the chest item must be dropped directly into the player's inventory
     * when breaking the block.
     *
     * @return true if the chest must be dropped to the inventory, false otherwise.
     */
    boolean getOnBreakDropChestToInventory();

    /**
     * Checks if last opened page must be re-opened on the next opening.
     *
     * @return true if the last page must re-opened, false otherwise.
     */
    boolean getReOpenLastOpenedPage();

    /**
     * Checks if the use of NBT API is allowed.
     *
     * @return true if NBT API can be use, false otherwise.
     */
    boolean getUseNBTApi();

    /**
     * Checks if the sell process should ignore those items that have meta
     *
     * @return true if the sell process should ignore the meta, false otherwise.
     */
    boolean getSellIgnoreMeta();

    /**
     * Checks if the sell process should remove those items that are worthless.
     *
     * @return true if the sell process should remove worthless items, false otherwise.
     */
    boolean getSellsRemoveWorthlessItems();

    /**
     * Checks if the {@link us.lynuxcraft.deadsilenceiv.advancedchests.events.ChestRemoveEvent} should be called.
     *
     * @return true if the event should be called, false otherwise.
     */
    boolean getCallChestRemoveEvent();

    /**
     * Gives the status of the Backups.
     *
     * @return true if the backups are enabled.
     */
    boolean areBackupsEnabled();

    /**
     * Gets the defined database name.
     *
     * @return the database name.
     */
    String getDatabaseName();

    /**
     * Gets the defined database address.
     *
     * @return the database address.
     */
    String getDatabaseAddress();

    /**
     * Gets the defined database username.
     *
     * @return the database username.
     */
    String getDatabaseUsername();

    /**
     * Gets the defined database password.
     *
     * @return the database password.
     */
    String getDatabasePassword();

    /**
     * Gets the defined database port.
     *
     * @return the database port.
     */
    int getDatabasePort();

    /**
     * Gets the priority from the config at the specified path.
     *
     * @param path the path of the priority
     * @return the priority from config.
     */
    EventPriority fetchPriorityFromOption(String path);
}

