package us.lynuxcraft.deadsilenceiv.advancedchests.chest;

import org.bukkit.Location;
import org.bukkit.block.Block;
import org.bukkit.block.BlockFace;
import org.bukkit.entity.Entity;
import org.bukkit.entity.HumanEntity;
import org.bukkit.entity.Player;
import org.bukkit.event.block.BlockBreakEvent;
import org.jetbrains.annotations.Nullable;
import us.lynuxcraft.deadsilenceiv.advancedchests.chest.containers.Container;
import us.lynuxcraft.deadsilenceiv.advancedchests.chest.gui.page.ChestPage;
import us.lynuxcraft.deadsilenceiv.advancedchests.chest.title.ChestTitle;
import us.lynuxcraft.deadsilenceiv.advancedchests.services.chest.SellType;
import us.lynuxcraft.deadsilenceiv.advancedchests.services.chest.SortStatus;
import us.lynuxcraft.deadsilenceiv.advancedchests.services.chest.sorter.SortType;
import us.lynuxcraft.deadsilenceiv.advancedchests.utils.ChunkLocation;
import us.lynuxcraft.deadsilenceiv.advancedchests.utils.inventory.InteractiveInventory;

import java.util.*;

public interface AdvancedChest<I,T extends ChestPage<I>> {

    UUID getUniqueId();

    Map<Integer,T> getPages();

    String getConfigType();

    ChestType getChestType();

    Container getContainer();

    Integer getSize();

    ChestTitle getChestTitle();

    UUID getWhoPlaced();

    void setWhoPlaced(UUID uuid);

    boolean isAutomaticSellsStatus();

    void setAutomaticSellsStatus(boolean status);

    UUID getAutomaticSellsSessionOwner();

    void setAutomaticSellsSessionOwner(UUID owner);

    double getMoney();

    void setMoney(double money);

    Set<InteractiveInventory> getSubInventories();

    ChunkLocation getChunkLocation();

    boolean isEntityLoaded();

    /**
     * Loads the all the necessary for the chest to be visible and functional
     * Note that this method will work just when the chunk of the chest is already loaded.
     */
    void loadEntity();

    /**
     * Unloads all the chest complements to be functional and visible
     * Note that this method will just work when the entity is already loaded.
     */
    void unLoadEntity();

    /**
     * Open a specified page to a player.
     *
     * @param entity the human entity instance
     * @param id the page id.
     */
    void openPage(HumanEntity entity,int id);

    /**
     * Expands the amount of slots the chest.
     *
     * @param amount the amount of slots to expand.
     */
    void expandSlots(int amount);

    /**
     * Upgrades the chest to an existing chest type.
     *
     * @param upgrade the new chest type
     * @param player player that upgraded the chest.
     */
    void upgrade(String upgrade,@Nullable Player player);

    @Deprecated
    default void upgrade(String upgrade){
        upgrade(upgrade,null);
    }

    /**
     * Updates all the pages.
     */
    void updatePages();

    /**
     * Removes the chest.
     *
     * @param event the {@link BlockBreakEvent}, it can be null
     * @param player the player that triggered the removing action, it can be null
     * @param dropItems drop items or not.
     */
    void remove(@Nullable BlockBreakEvent event,@Nullable Player player,boolean dropItems);

    /**
     * Handles an explosion.
     *
     * @param blocks the list of exploded blocks
     * @param entity the entity that caused the explosion, it can be null.
     */
    void handleExplosion(List<Block> blocks, @Nullable Entity entity);

    /**
     * Sorts all the pages of the chest.
     *
     * @param sortType the type of sort
     * @return the sort status.
     */
    SortStatus sort(SortType sortType);

    /**
     * Creates a {@link SellProcess} to sell all the chest pages.
     *
     * @param player the player that will sell the chest, it can be null
     * @param sellType the type sell.
     */
    void sell(@Nullable Player player,SellType sellType);

    /**
     * Smelts all the chest pages.
     *
     * @return true if the content was melted, false if there was not any item to melt.
     */
    boolean smelt();

    /**
     * Compresses all the chest pages.
     *
     * @param player the player that is going to compress the chest, it can be null.
     */
    void compress(@Nullable Player player);

    /**
     * Closes the chest's inventories for all the current viewers.
     */
    default void closeForViewers(){
        for(T page : getPages().values()){
            page.closeForViewers();
        }
        for (InteractiveInventory subInventory : getSubInventories()) {
            subInventory.closeForViewers();
        }
    }

    /**
     * Saves the chest into the storage folder.
     */
    void save();

    /**
     * Gets the ChestPage that the player is currently looking on.
     *
     * @param player the player instance
     * @return the ChestPage instance, null if the player is not looking any page of the chest.
     */
    default T getPlayerPage(Player player){
        for(T page : getPages().values()){
            for (HumanEntity humanEntity : page.getBukkitInventory().getViewers()){
                Player viewer = (Player) humanEntity;
                if(player.equals(viewer)) return page;
            }
        }
        return null;
    }

    /**
     * Gets the ChestPage by the specified id.
     *
     * @param id the id of the page
     * @return the ChestPage, null if the id is not valid.
     */
    default T getPageById(int id){
        return getPages().get(id);
    }

    /**
     * Gets an array of the chest pages in order by the {@link ChestPage#getId()}.
     *
     * @return an array of chest pages.
     */
    T[] getOrderedPages();

    default List<I> getAllContent(){
        List<I> content = new ArrayList<>();
        for (T page : getPages().values()) {
            content.addAll(Arrays.asList(page.getItems()));
        }
        return content;
    }

    /**
     * Gets the location of the chest.
     *
     * @return the location instance, null if is an invalid location.
     */
     Location getLocation();

    /**
     * Gets the direction of the chest.
     *
     * @return the block face instance.
     */
    BlockFace getDirection();

    /**
     * Gets the amount of slots that are occupied.
     *
     * @return the amount of occupied slots.
     */
    int getSlotsUsed();

    /**
     * Gets the amount of slots that are empty.
     *
     * @return the amount of empty slots.
     */
    default int getSlotsLeft(){
        return getSize()-getSlotsUsed();
    }

    /**
     * Checks if a specified player is changing between pages
     *
     * @param player the player instance
     * @return true if the player is changing the page at that moment, false otherwise.
     */
    boolean isPlayerChangingPage(Player player);

    /**
     * Gets the sub inventory by name.
     *
     * @return the instance of the specified sub inventory, null if not exists.
     */
    InteractiveInventory getSubInventoryByName(String name);

    /**
     * Checks if the chest is being sold.
     *
     * @return true if there is a {@link SellProcess} going on, false otherwise.
     */
    boolean isBeingSold();

    /**
     * Checks if the chest is being compressed.
     *
     * @return true if there is a {@link CompressProcess} going on, false otherwise.
     */
    boolean isBeingCompressed();

    /**
     * Checks if the chest can be loaded.
     *
     * @return true if the chest can be loaded, false otherwise.
     */
    boolean canBeLoaded();

}
