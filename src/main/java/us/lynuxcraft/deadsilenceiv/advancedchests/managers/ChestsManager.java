package us.lynuxcraft.deadsilenceiv.advancedchests.managers;

import org.bukkit.Location;
import org.bukkit.World;
import org.bukkit.block.Block;
import us.lynuxcraft.deadsilenceiv.advancedchests.chest.*;
import us.lynuxcraft.deadsilenceiv.advancedchests.utils.ChunkLocation;

import java.util.*;

public class ChestsManager{
    /**
     * Registers an advanced chest.
     *
     * @param chest the chest instance.
     */
    public void register(AdvancedChest<?,?> chest){}

    /**
     * UnRegisters a specified chest.
     *
     * @param chest the chest instance.
     */
    public void unRegister(AdvancedChest<?,?> chest){}

    /**
     * Gets a non-loadable chest from a specified location.
     * (Chests that couldn't be loaded by external factors such as bad configuration).
     *
     * @param location the location of the chest
     * @return the chest instance, null if there is not a chest at the location.
     */
    public AdvancedChest<?,?> getNonLoadableChest(Location location){
        return null;
    }

    @Deprecated
    public AdvancedChest<?,?> getAdvancedChest(Block block){
        return null;
    }

    /**
     * Gets a LOADED AdvancedChest at a specified location.
     *
     * @param location the location instance
     * @return the chest instance, null if there is not a chest at the location.
     */
    public AdvancedChest<?,?> getAdvancedChest(Location location){
        return null;
    }

    /**
     * Gets all the AdvancedChest in a specified world.
     *
     * @param world the world instance
     * @return a set of AdvancedChests.
     */
    public Set<AdvancedChest<?,?>> getAdvancedChests(World world){
        return null;
    }

    /**
     * Gets all the LOADED AdvancedChests at the specified chunk.
     *
     * @param chunk the chunk location instance
     * @return the set of AdvancedChests, null if there isn't AdvancedChests at the chunk.
     */
    public Set<AdvancedChest<?,?>> getAdvancedChests(ChunkLocation chunk){
        return null;
    }

    /**
     * Gets the total of registered chests.
     *
     * @return the amount of chests registered.
     */
    public int getTotalChests(){
        return 0;
    }
}
