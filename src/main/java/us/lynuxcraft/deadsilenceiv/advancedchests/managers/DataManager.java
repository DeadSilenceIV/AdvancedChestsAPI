package us.lynuxcraft.deadsilenceiv.advancedchests.managers;

import org.bukkit.inventory.ItemStack;
import us.lynuxcraft.deadsilenceiv.advancedchests.chest.ChestType;

import java.util.List;
import java.util.Set;

public interface DataManager {

    /**
     * Get the config chest size of a certain type of advanced chest.
     *
     * @param chest the advanced chest type
     * @return the config chest size.
     */
    Integer getChestSize(String chest);

    /**
     * Get the inventory name of a certain
     * type of advanced chest.
     *
     * @param chest the advanced chest type
     * @return the inventory name.
     */
    String getInventoryName(String chest);

    /**
     * Get the base ItemStack of a certain type of advanced chest.
     *
     * @param chest the advanced chest type
     * @return the base item.
     */
    ItemStack getIcon(String chest);

    ChestType getChestType(String chest);

    /**
     * Get the next chest upgrade type of certain advanced chest.
     *
     * @param chest the advanced chest type
     * @return the next chest upgrade type.
     */
    String getChestUpgrade(String chest);

    /**
     * Get the upgrade price of a certain type of advanced chest.
     *
     * @param chest the advanced chest type
     * @return the upgrade price.
     */
    double getChestUpgradePrice(String chest);

    /**
     * Get the chest shop price of a certain type of
     * advanced chest.
     *
     * @param chest the advanced chest type
     * @return the shop price.
     */
    double getChestShopPrice(String chest);
    /**
     * Use this method to know if a certain type of
     * advanced chest is upgradeable.
     *
     * @param chest the advanced chest type
     * @return true if the chest type is upgradeable, false if isn't.
     */
    boolean isUpgradable(String chest);

    /**
     * Use this method to know if titles are available in a
     * certain type of advanced chest.
     *
     * @param chest the advanced chest type
     * @return true if titles are available, false if isn't.
     */
     boolean isTitleAvailable(String chest);

    /**
     * Use this method to know if sorting is available
     * in a certain type of advanced chest.
     *
     * @param chest the advanced chest type
     * @return true if the sorting is available, false if isn't.
     */
    boolean areSortersAvailable(String chest);

    /**
     * Get the sorting price of a certain type of
     * advanced chest.
     *
     * @param chest the advanced chest type
     * @return the sorting price.
     */
    double getSortersPrice(String chest);

    /**
     * Use this method to know if selling is available
     * in a certain type of advanced chest.
     *
     * @param chest the advanced chest type
     * @return true if selling is available, false if isn't.
     */
    boolean areSellsAvailable(String chest);

    /**
     * Use this method to know the sells' multiplier of
     * a certain type of advanced chest.
     *
     * @param chest the advanced chest type
     * @return the sell multiplier.
     */
    double getSellsMultiplier(String chest);

    /**
     * Use this method to know if hoppers use is allowed
     * in a certain type of advanced chest.
     *
     * @param chest the advanced chest type
     * @return true if hoppers are allowed, false if isn't.
     */
    boolean areHoppersUseAllowed(String chest);

    /**
     * Get the title content of a certain type of advanced chest
     *
     * @param chest the advanced chest type
     * @return a string list containing all the title content.
     */
    List<String> getTitleContent(String chest);

    /**
     * Use this method to know if automatic sells are available
     * in a certain type of advanced chest.
     *
     * @param chest the advanced chest type
     * @return true if automatic sells are available, false if isn't.
     */
    boolean areAutoSellsAvailable(String chest);

    /**
     * Get the automatic sells frequency of
     * a certain type of advanced chest.
     *
     * @param chest the advanced chest type
     * @return the automatic sells frequency in ticks.
     */
    int getAutoSellsFrequency(String chest);

    /**
     * Get the automatic sells multiplier of
     * a certain type of advanced chest.
     *
     * @param chest the advanced chest type
     * @return the automatic sells multiplier.
     */
    double getAutoSellsMultiplier(String chest);

    /**
     * Get the automatic sells tax of
     * a certain type of advanced chest.
     *
     * @param chest the advanced chest type
     * @return the automatic sells tax.
     */
    double getAutoSellsTax(String chest);

    /**
     * Get the smelting price of a certain type of
     * advanced chest.
     *
     * @param chest the advanced chest type
     * @return the smelting price.
     */
    double getSmelterPrice(String chest);

    /**
     * Use this method to know if smelting is available in a
     * certain type of advanced chest.
     *
     * @param chest the advanced chest type
     * @return true if smelting is available, false if isn't.
     */
    boolean isSmelterAvailable(String chest);

    /**
     * Use this method to know if compressing is available in a
     * certain type of advanced chest.
     *
     * @param chest the advanced chest type
     * @return true if compressing is available, false if isn't.
     */
    boolean isCompressorAvailable(String chest);
    /**
     * Get the compressing price of a certain type of advanced chest
     *
     * @param chest the advanced chest type
     * @return the compressing price.
     */
    double getCompressorPrice(String chest);

    /**
     * Use this method to know if the deposit action is available for
     * a certain type of advanced chest.
     *
     * @param chest the advanced chest type
     * @return true if the deposit action is available, false otherwise.
     */
    boolean isDepositAvailable(String chest);

    /**
     * Use this method to know the slot of Previous Page button for
     * a specified type of advanced chest.
     *
     * @param chest the advanced chest type
     * @return the slot of the button.
     */
    int getPreviousPageSlot(String chest);

    /**
     * Use this method to know the slot of Next Page button for
     * a specified type of advanced chest.
     *
     * @param chest the advanced chest type
     * @return the slot of the button.
     */
    int getNextPageSlot(String chest);

    /**
     * Use this method to know the slot of Upgrade button for
     * a specified type of advanced chest.
     *
     * @param chest the advanced chest type
     * @return the slot of the button.
     */
    int getUpgradeSlot(String chest);

    /**
     * Use this method to know the slot of Sorter button for
     * a specified type of advanced chest.
     *
     * @param chest the advanced chest type
     * @return the slot of the button.
     */
    int getSortersSlot(String chest);

    /**
     * Use this method to know the slot of Sells button for
     * a specified type of advanced chest.
     *
     * @param chest the advanced chest type
     * @return the slot of the button.
     */
    int getSellsSlot(String chest);

    /**
     * Use this method to know the slot of Automatic sells button for
     * a specified type of advanced chest.
     *
     * @param chest the advanced chest type
     * @return the slot of the button.
     */
    int getAutoSellsSlot(String chest);

    /**
     * Use this method to know the slot of Smelter button for
     * a specified type of advanced chest.
     *
     * @param chest the advanced chest type
     * @return the slot of the button.
     */
    int getSmelterSlot(String chest);

    /**
     * Use this method to know the slot of Compressor button for
     * a specified type of advanced chest.
     *
     * @param chest the advanced chest type
     * @return the slot of the button.
     */
    int getCompressorSlot(String chest);

    /**
     * Use this method to know if chest crafting is available in a
     * certain type of advanced chest
     *
     * @param chest the advanced chest type
     * @return true if chest crafting is available, false if isn't.
     */
    boolean isCraftingAvailable(String chest);

    /**
     * Use this method to know if a specified type of advanced chest
     * is loaded.
     *
     * @param chest the advanced chest type
     * @return true if is loaded, false if isn't.
     */
    boolean isAdvancedChest(String chest);

    /**
     * Use this method to know if a specified type of advanced chest
     * is non-loadable.
     *
     * @param chest the advanced chest type
     * @return true if is non loaded, false if isn't.
     */
    boolean isNonLoadableAdvancedChest(String chest);

    /**
     * Get all the loaded advanced chests types
     *
     * @return a string set of all the loaded advanced chests types.
     */
    List<String> getAdvancedChestNames();

    /**
     * Get all the non-loadable advanced chests types
     *
     * @return a string list of all the non loaded advanced chests types.
     */
    Set<String> getUnLoadableChestsNames();

    /**
     * Use this method to know if advanced chests recipes are
     * available.
     *
     * @return true if are available, false if isn't.
     */
    boolean areRecipesAvailable();

}
