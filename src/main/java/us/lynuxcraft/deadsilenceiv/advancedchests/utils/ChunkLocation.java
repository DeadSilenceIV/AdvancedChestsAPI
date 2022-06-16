package us.lynuxcraft.deadsilenceiv.advancedchests.utils;

import lombok.Getter;
import org.bukkit.Chunk;
import org.bukkit.Location;
import org.bukkit.World;

import java.util.Objects;

public class ChunkLocation{
    @Getter private World world;
    @Getter private int x;
    @Getter private int z;
    private Integer cachedHashCode;
    public ChunkLocation(Location location) {
        world = location.getWorld();
        x = location.getBlockX() >> 4;
        z = location.getBlockZ() >> 4;
    }

    public ChunkLocation(Chunk chunk){
        world = chunk.getWorld();
        x = chunk.getX();
        z = chunk.getZ();
    }

    public boolean isLoaded(){
        return world.isChunkLoaded(x,z);
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        ChunkLocation location = (ChunkLocation) o;
        return x == location.x && z == location.z && world.equals(location.world);
    }

    @Override
    public int hashCode() {
        if(cachedHashCode == null) {
            cachedHashCode = Objects.hash(world, x, z);
        }
        return cachedHashCode;
    }
}