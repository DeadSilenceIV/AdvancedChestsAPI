package us.lynuxcraft.deadsilenceiv.advancedchests.managers;

import org.bukkit.Location;
import org.bukkit.block.Block;
import org.bukkit.inventory.Inventory;
import us.lynuxcraft.deadsilenceiv.advancedchests.chest.AdvancedChest;

public class ChestsManager {

    public void register(AdvancedChest chest){}

    public void unRegister(AdvancedChest chest){}

    public void save(AdvancedChest chest){}

    public AdvancedChest getNonLoadedChest(Location location){
        return null;
    }

    public AdvancedChest getAdvancedChest(Block block){
        return null;
    }

    public AdvancedChest getAdvancedChest(Inventory inventory){
        return null;
    }

}
