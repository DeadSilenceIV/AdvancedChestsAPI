package us.lynuxcraft.deadsilenceiv.advancedchests.services.chest.dispenser;

import org.bukkit.inventory.ItemStack;
import us.lynuxcraft.deadsilenceiv.advancedchests.chest.AdvancedChest;

public interface DispenserService {

    ItemStack dispenseLastItemFromChest(AdvancedChest<?,?> chest);

    boolean dispenseItemToChest(AdvancedChest<?,?> chest,ItemStack item);

    boolean hasSpaceForItem(AdvancedChest<?,?> chest,ItemStack item);

    ItemStack getLastItemFromChest(AdvancedChest<?,?> chest);

}
