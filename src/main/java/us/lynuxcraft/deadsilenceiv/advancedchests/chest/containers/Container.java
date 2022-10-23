package us.lynuxcraft.deadsilenceiv.advancedchests.chest.containers;

import org.bukkit.Location;
import org.bukkit.block.Block;
import org.bukkit.block.BlockFace;
import org.bukkit.block.BlockState;
import org.bukkit.entity.Player;
import org.bukkit.inventory.ItemStack;
import org.jetbrains.annotations.Nullable;
import us.lynuxcraft.deadsilenceiv.advancedchests.chest.AdvancedChest;

public interface Container{

    void place(Location location);

    void place(Location location,@Nullable BlockFace blockFace);

    boolean checkBlock(Location location,@Nullable BlockFace blockFace);

    void playOpenAnimation(AdvancedChest<?,?> chest, Player player);

    void playCloseAnimation(AdvancedChest<?,?> chest, Player player);

    void playOpenAnimation(BlockState state, Player player);

    void playCloseAnimation(BlockState state, Player player);

    void playOpenSound(Player player, float volume, float pitch);

    void playCloseSound(Player player, float volume, float pitch);

    default boolean canBePlacedAt(Block block){
        return true;
    }

    default boolean canBeTransferred(ItemStack itemStack){
        return true;
    }

}
