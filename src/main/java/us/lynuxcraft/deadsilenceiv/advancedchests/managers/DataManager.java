package us.lynuxcraft.deadsilenceiv.advancedchests.managers;

import org.bukkit.inventory.ItemStack;

import java.util.List;
import java.util.Set;

public class DataManager {
    /**
     * Get the config chest size of a certain type of advanced chest.
     *
     * @param chest the advanced chest type
     * @return the config chest size.
     */
    public Integer getChestSize(String chest){
        return null;
    }

    /**
     * Get the inventory name of a certain
     * type of advanced chest.
     *
     * @param chest the advanced chest type
     * @return the inventory name.
     */
    public String getInventoryName(String chest){
        return null;
    }

    /**
     * Get the base ItemStack of a certain type of advanced chest.
     *
     * @param chest the advanced chest type
     * @return the base item.
     */
    public ItemStack getIcon(String chest){
        return null;
    }

    /**
     * Get the next chest upgrade type of a certain
     * type of advanced chest.
     *
     * @param chest the advanced chest type
     * @return the next chest upgrade type.
     */
    public String getChestUpgrade(String chest){
        return null;
    }

    /**
     * Get the upgrade price of a certain type of advanced chest.
     *
     * @param chest the advanced chest type
     * @return the upgrade price.
     */
    public double getChestUpgradePrice(String chest){
        return 0.0;
    }

    /**
     * Get the chest shop price of a certain type of
     * advanced chest.
     *
     * @param chest the advanced chest type
     * @return the shop price.
     */
    public double getChestShopPrice(String chest){
        return 0.0;
    }

    /**
     * Use this method to know if a certain type of
     * advanced chest is upgradeable.
     *
     * @param chest the advanced chest type
     * @return true if the chest type is upgradeable, false if isn't.
     */
    public boolean isUpgradable(String chest){
        return false;
    }

    /**
     * Use this method to know if titles are available in a
     * certain type of advanced chest.
     *
     * @param chest the advanced chest type
     * @return true if titles are available, false if isn't.
     */
    public boolean isTitleAvailable(String chest){
        return false;
    }

    /**
     * Use this method to know if sorting is available
     * in a certain type of advanced chest.
     *
     * @param chest the advanced chest type
     * @return true if the sorting is available, false if isn't.
     */
    public boolean areSortersAvailable(String chest){
        return false;
    }

    /**
     * Get the sorting price of a certain type of
     * advanced chest.
     *
     * @param chest the advanced chest type
     * @return the sorting price.
     */
    public double getSortersPrice(String chest){
        return 0.0;
    }

    /**
     * Use this method to know if selling is available
     * in a certain type of advanced chest.
     *
     * @param chest the advanced chest type
     * @return true if selling is available, false if isn't.
     */
    public boolean areSellsAvailable(String chest){
        return false;
    }

    /**
     * Use this method to know the sells multiplier of
     * a certain type of advanced chest.
     *
     * @param chest the advanced chest type
     * @return the sell multiplier.
     */
    public double getSellsMultiplier(String chest){
        return 0.0;
    }

    /**
     * Use this method to know if hoppers use is allowed
     * in a certain type of advanced chest.
     *
     * @param chest the advanced chest type
     * @return true if hoppers are allowed, false if isn't.
     */
    public boolean areHoppersUseAllowed(String chest){
        return false;
    }

    /**
     * Get the title content of a certain type of advanced chest
     *
     * @param chest the advanced chest type
     * @return a string list containing all the title content.
     */
    public List<String> getTitleContent(String chest){
        return null;
    }

    /**
     * Use this method to know if automatic sells are available
     * in a certain type of advanced chest.
     *
     * @param chest the advanced chest type
     * @return true if automatic sells are available, false if isn't.
     */
    public boolean areAutoSellsAvailable(String chest){
        return false;
    }

    /**
     * Get the automatic sells frequency of
     * a certain type of advanced chest.
     *
     * @param chest the advanced chest type
     * @return the automatic sells frequency in ticks.
     */
    public int getAutoSellsFrequency(String chest){
        return 0;
    }

    /**
     * Get the automatic sells tax of
     * a certain type of advanced chest.
     *
     * @param chest the advanced chest type
     * @return the automatic sells tax.
     */
    public double getAutoSellsTax(String chest){
        return 0.0;
    }

    /**
     * Get the smelting price of a certain type of
     * advanced chest.
     *
     * @param chest the advanced chest type
     * @return the smelting price.
     */
    public double getSmelterPrice(String chest){
        return 0.0;
    }

    /**
     * Use this method to know if smelting is available in a
     * certain type of advanced chest.
     *
     * @param chest the advanced chest type
     * @return true if smelting is available, false if isn't.
     */
    public boolean isSmelterAvailable(String chest){
        return false;
    }

    /**
     * Use this method to know if compressing is available in a
     * certain type of advanced chest.
     *
     * @param chest the advanced chest type
     * @return true if compressing is available, false if isn't.
     */
    public boolean isCompressorAvailable(String chest){
        return false;
    }

    /**
     * Get the compressing price of a certain type of advanced chest
     *
     * @param chest the advanced chest type
     * @return the compressing price.
     */
    public double getCompressorPrice(String chest){
        return 0.0;
    }

    /**
     * Use this method to know if the deposit action is available for
     * a certain type of advanced chest.
     *
     * @param chest the advanced chest type
     * @return true if the deposit action is available, false otherwise.
     */
    public boolean isDepositAvailable(String chest) {
        return false;
    }

    /**
     * Use this method to know the slot of Previous Page button for
     * a specified type of advanced chest.
     *
     * @param chest the advanced chest type
     * @return the slot of the button.
     */
    public int getPreviousPageSlot(String chest){
        return 0;
    }

    /**
     * Use this method to know the slot of Next Page button for
     * a specified type of advanced chest.
     *
     * @param chest the advanced chest type
     * @return the slot of the button.
     */
    public int getNextPageSlot(String chest){
        return 0;
    }

    /**
     * Use this method to know the slot of Upgrade button for
     * a specified type of advanced chest.
     *
     * @param chest the advanced chest type
     * @return the slot of the button.
     */
    public int getUpgradeSlot(String chest){
        return 0;
    }

    /**
     * Use this method to know the slot of Sorter button for
     * a specified type of advanced chest.
     *
     * @param chest the advanced chest type
     * @return the slot of the button.
     */
    public int getSortersSlot(String chest){
        return 0;
    }

    /**
     * Use this method to know the slot of Sells button for
     * a specified type of advanced chest.
     *
     * @param chest the advanced chest type
     * @return the slot of the button.
     */
    public int getSellsSlot(String chest){
        return 0;
    }

    /**
     * Use this method to know the slot of Automatic sells button for
     * a specified type of advanced chest.
     *
     * @param chest the advanced chest type
     * @return the slot of the button.
     */
    public int getAutoSellsSlot(String chest){
        return 0;
    }

    /**
     * Use this method to know the slot of Smelter button for
     * a specified type of advanced chest.
     *
     * @param chest the advanced chest type
     * @return the slot of the button.
     */
    public int getSmelterSlot(String chest){
        return 0;
    }

    /**
     * Use this method to know the slot of Compressor button for
     * a specified type of advanced chest.
     *
     * @param chest the advanced chest type
     * @return the slot of the button.
     */
    public int getCompressorSlot(String chest){
        return 0;
    }

    /**
     * Use this method to know if chest crafting is available in a
     * certain type of advanced chest
     *
     * @param chest the advanced chest type
     * @return true if chest crafting is available, false if isn't.
     */
    public boolean isCraftingAvailable(String chest){
        return false;
    }

    /**
     * Use this method to know if a specified type of advanced chest
     * is loaded.
     *
     * @param chest the advanced chest type
     * @return true if is loaded, false if isn't.
     */
    public boolean isAdvancedChest(String chest){
        return false;
    }

    /**
     * Use this method to know if a specified type of advanced chest
     * is non loadable.
     *
     * @param chest the advanced chest type
     * @return true if is non loaded, false if isn't.
     */
    public boolean isNonLoadableAdvancedChest(String chest){
        return false;
    }

    /**
     * Get all the loaded advanced chests types
     *
     * @return a string set of all the loaded advanced chests types.
     */
    public List<String> getAdvancedChestNames(){
        return null;
    }

    /**
     * Get all the non loadable advanced chests types
     *
     * @return a string list of all the non loaded advanced chests types.
     */
    public Set<String> getUnLoadableChestsNames(){
        return null;
    }

    /**
     * Use this method to know if advanced chests recipes are
     * available.
     *
     * @return true if are available, false if isn't.
     */
    public boolean areRecipesAvailable(){
        return false;
    }
}
