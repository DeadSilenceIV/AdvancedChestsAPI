package us.lynuxcraft.deadsilenceiv.advancedchests.chest;

import org.bukkit.Location;
import org.bukkit.block.Block;
import org.bukkit.entity.Entity;
import org.bukkit.entity.Player;
import org.bukkit.event.block.BlockBreakEvent;
import org.bukkit.inventory.ItemStack;
import us.lynuxcraft.deadsilenceiv.advancedchests.chest.gui.page.ChestPage;
import us.lynuxcraft.deadsilenceiv.advancedchests.chest.title.ChestTitle;
import us.lynuxcraft.deadsilenceiv.advancedchests.services.chest.*;
import us.lynuxcraft.deadsilenceiv.advancedchests.utils.ChunkLocation;

import java.util.*;

public class AdvancedChest {

    /**
     * Loads the all the necessary for the chest to be visible and functional
     * Note that this method will work just when the chunk of the chest is already loaded.
     */
    public void loadEntity(){}

    /**
     * Unloads all the chest complements to be functional and visible
     * Note that this method will just work when the entity is already loaded.
     */
    public void unLoadEntity(){}

    /**
     * Open a specified page to a player.
     *
     * @param player the player instance
     * @param id the page id.
     */
    public void openPage(Player player,int id){}

    /**
     * Expands the amount of slots the chest.
     *
     * @param amount the amount of slots to expand.
     */
    public void expandSlots(int amount){}

    /**
     * Upgrades the chest to an existing chest type.
     *
     * @param upgrade the new chest type.
     */
    public void upgrade(String upgrade){}

    /**
     * Removes the chest.
     *
     * @param event the {@link BlockBreakEvent}, it can be null
     * @param dropItems drop items or not.
     */
    public void remove(BlockBreakEvent event,boolean dropItems){}

    /**
     * Handles an explosion.
     *
     * @param blocks the list of exploded blocks
     * @param entity the entity that caused the explosion, it can be null.
     */
    public void handleExplosion(List<Block> blocks,Entity entity){}

    /**
     * Sorts all the pages of the chest.
     *
     * @param sortType the type of sort
     * @return the sort status.
     */
    public SortStatus sort(SortType sortType){return null;}

    /**
     * Creates a SellProcess to sell all the chest pages.
     *
     * @param player the player that will sell the chest, it can be null.
     */
    public void sell(Player player){}

    /**
     * Smelts all the chest pages.
     *
     * @return true if the content was melted, false if there was not any item to melt.
     */
    public boolean smelt(){
        return false;
    }

    /**
     * Compresses all the chest pages.
     *
     * @return the compression status.
     */
    public CompressionStatus compress(){
        return null;
    }

    /**
     * Closes the chest's inventories for all the current viewers.
     */
    public void closeForViewers(){}

    /**
     * Saves the chest into the storage folder.
     */
    public void save(){}

    /**
     * Sets a list of items equal to the chest size
     * into the chest.
     *
     * @param items the new content of all the chest.
     */
    public void setContent(List<ItemStack> items){}

    /**
     * Gets the ChestPage that the player is currently looking on.
     *
     * @param player the player instance
     * @return the ChestPage instance, null if the player is not looking any page of the chest.
     */
    public ChestPage getPlayerPage(Player player){
        return null;
    }

    /**
     * Gets the ChestPage by the specified id.
     *
     * @param id the id of the page
     * @return the ChestPage, null if the id is not valid.
     */
    public ChestPage getPageById(int id){
        return null;
    }

    public List<ItemStack> getAllItems(){
        return null;
    }

    /**
     * Gets the location of the chest.
     *
     * @return the location instance, null if is an invalid location.
     */
    public Location getLocation() {
        return null;
    }

    /**
     * Gets the chunk location of the chest.
     *
     * @return the {@link ChunkLocation} of the chest.
     */
    public ChunkLocation getChunkLocation(){
        return null;
    }
    /**
     * Gets the type of the chest (Name in config).
     *
     * @return the name in config of the chest.
     */
    public String getType(){
        return "";
    }

    /**
     * Gets the {@link UUID} of the chest.
     *
     * @return the unique id of the chest.
     */
    public UUID getUniqueId(){return null;}

    /**
     * Gets the size of the chest.
     *
     * @return the size of the chest.
     */
    public Integer getSize(){return null;}

    /**
     * Gets the chest title.
     *
     * @return the chest title, null if the chest has no title.
     */
    public ChestTitle getChestTitle(){return null;}

    /**
     * Gets all the chest pages.
     *
     * @return a set that contains all the chest pages.
     */
    public Set<ChestPage> getPages(){return null;}


    /**
     * Gets an array of the chest pages in order by the {@link ChestPage#getId()}.
     *
     * @return an array of chest pages.
     */
    public ChestPage[] getOrderedPages(){return null;}

    /**
     * Gets the amount of slots that are occupied.
     *
     * @return the amount of occupied slots.
     */
    public int getSlotsUsed(){
        return 0;
    }

    /**
     * Gets the amount of slots that are empty.
     *
     * @return the amount of empty slots.
     */
    public int getSlotsLeft(){
        return 0;
    }

    /**
     * Gets the total money saved a the automatic sells menu.
     *
     * @return the money of the automatic sells.
     */
    public double getMoney(){return 0;}

    /**
     * Sets the money of the automatic sells menu.
     */
    public void setMoney(double money){}

    /**
     * Checks if a specified player is changing between pages
     *
     * @param player the player instance
     * @return true if the player is changing the page at that moment, false otherwise.
     */
    public boolean isPlayerChangingPage(Player player){
        return false;
    }

    /**
     * Checks if the chest is being sold.
     *
     * @return true if there is a SellProcess going on, false otherwise.
     */
    public boolean isBeingSold(){
        return false;
    }

    /**
     * Checks if the automatic sells are enabled.
     *
     * @return true if automatic sells are enabled, false otherwise.
     */
    public boolean isAutomaticSellsStatus(){return false;}

    /**
     * Checks if the chest can be loaded.
     *
     * @return true if the chest can be loaded, false otherwise.
     */
    public boolean canBeLoaded(){
        return false;
    }

}
