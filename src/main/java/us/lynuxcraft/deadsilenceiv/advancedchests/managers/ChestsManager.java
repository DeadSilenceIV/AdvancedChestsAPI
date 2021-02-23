package us.lynuxcraft.deadsilenceiv.advancedchests.managers;

import org.bukkit.Location;
import org.bukkit.World;
import org.bukkit.block.Block;
import org.bukkit.inventory.Inventory;
import us.lynuxcraft.deadsilenceiv.advancedchests.chest.AdvancedChest;

import java.util.ArrayList;
import java.util.List;

public class ChestsManager {

    /**
     * Register an advanced chest.
     *
     * @param chest advanced chest instance.
     */
    public void register(AdvancedChest chest){}

    /**
     * Unregister an advanced chest.
     *
     * @param chest advanced chest instance.
     */
    public void unRegister(AdvancedChest chest){}

    /**
     * Save an advanced chest data.
     *
     * @param chest advanced chest instance.
     */
    public void save(AdvancedChest chest){}

    /**
     * Get an non loaded advanced chest (Chests that couldn't be loaded by external factors).
     *
     * @param location the non loaded advanced chest location
     * @return the non loaded advanced chest. null if there isn't a non loaded advanced chest.
     */
    public AdvancedChest getNonLoadedChest(Location location){
        return null;
    }

    /**
     * Get an advanced chest at a specific block
     *
     * @param block the block where the advanced chest is
     * @return the advanced chest. null if there isn't an advanced chest.
     */
    @Deprecated
    public AdvancedChest getAdvancedChest(Block block){
        return null;
    }

    /**
     * Get an advanced chest at a specific location
     *
     * @param location the advanced chest location
     * @return the advanced chest. null if there isn't an advanced chest.
     */
    public AdvancedChest getAdvancedChest(Location location){return null;}

    /**
     * Get an advanced chest by the inventory.
     *
     * @param inventory the inventory of the advanced chest
     * @return the advanced chest. null if there isn't an advanced chest.
     */
    public AdvancedChest getAdvancedChest(Inventory inventory){
        return null;
    }

    /**
     * Get a list of advanced chests in a world.
     *
     * @param world the world of the advanced chests
     * @return the list of all the advanced chests in the specified world.
     */
    public List<AdvancedChest> getAdvancedChests(World world){ return null;}

}
