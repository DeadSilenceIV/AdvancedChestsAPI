package us.lynuxcraft.deadsilenceiv.advancedchests.utils;

import org.bukkit.Chunk;
import org.bukkit.Location;
import org.bukkit.World;

public class ChunkLocation {

    public ChunkLocation(Location location) {}

    public ChunkLocation(Chunk chunk){}

    public World getWorld() {
        return null;
    }

    public int getX() {
        return 0;
    }

    public int getZ() {
        return 0;
    }

    public boolean isLoaded(){
        return false;
    }

}
