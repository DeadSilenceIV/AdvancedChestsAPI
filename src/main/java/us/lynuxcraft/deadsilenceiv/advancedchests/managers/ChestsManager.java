package us.lynuxcraft.deadsilenceiv.advancedchests.managers;

import org.bukkit.Location;
import org.bukkit.World;
import org.bukkit.block.Block;
import us.lynuxcraft.deadsilenceiv.advancedchests.chest.*;

import us.lynuxcraft.deadsilenceiv.advancedchests.utils.ChunkLocation;

import java.util.*;

public interface ChestsManager{

    Set<AdvancedChest<?,?>> getChests();

    Set<AdvancedChest<?,?>> getNonLoadableChests();

    ChestStorage getStorage();

    /**
     * Registers an advanced chest.
     *
     * @param chest the chest instance.
     */
     void register(AdvancedChest<?,?> chest);

    /**
     * Remove a specified chest.
     *
     * @param chest the chest instance.
     */
    void unRegister(AdvancedChest<?,?> chest);

    /**
     * Setups all the chests from the storage.
     */
    void load();


    /**
     * Setups an AdvancedChest by the specified uuid and its status.
     *
     * @param uuid the uuid of the chest.
     */
    void setupChest(UUID uuid);

    /**
     * Gets a non-loadable chest from a specified location.
     * (Chests that couldn't be loaded by external factors such as bad configuration).
     *
     * @param location the location of the chest
     * @return the chest instance, null if there is not a chest at the location.
     */
    AdvancedChest<?,?> getNonLoadableChest(Location location);

    @Deprecated
    AdvancedChest<?,?> getAdvancedChest(Block block);

    /**
     * Gets a LOADED AdvancedChest at a specified location.
     *
     * @param location the location instance
     * @return the chest instance, null if there is not a chest at the location.
     */
    AdvancedChest<?,?> getAdvancedChest(Location location);

    /**
     * Gets all the LOADED AdvancedChests at the specified chunk.
     *
     * @param chunk the chunk location instance
     * @return the set of AdvancedChests, null if there isn't AdvancedChests at the chunk.
     */
    Set<AdvancedChest<?,?>> getAdvancedChests(ChunkLocation chunk);

    /**
     * Gets all the AdvancedChest in a specified world.
     *
     * @param world the world instance
     * @return a set of AdvancedChests.
     */
    Set<AdvancedChest<?,?>> getAdvancedChests(World world);

    /**
     * Gets the total of registered chests.
     *
     * @return the amount of chests registered.
     */
    int getTotalChests();

}
