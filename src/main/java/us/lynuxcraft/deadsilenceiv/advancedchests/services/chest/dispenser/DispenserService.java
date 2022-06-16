package us.lynuxcraft.deadsilenceiv.advancedchests.services.chest.dispenser;

import org.bukkit.inventory.ItemStack;
import us.lynuxcraft.deadsilenceiv.advancedchests.chest.AdvancedChest;
import us.lynuxcraft.deadsilenceiv.advancedchests.services.chest.dispenser.sessions.DispenseSession;

public interface DispenserService {

    @Deprecated
    default ItemStack dispenseLastItemFromChest(AdvancedChest<?,?> chest){
        return dispenseLastItemFromChest(chest,1);
    }

    ItemStack dispenseLastItemFromChest(AdvancedChest<?,?> chest,int amount);

    DispenseSession<?,?> newDispenseSession(AdvancedChest<?,?> chest);

    boolean dispenseItemToChest(AdvancedChest<?,?> chest,ItemStack item);

    boolean hasSpaceForItem(AdvancedChest<?,?> chest,ItemStack item);

    ItemStack getLastItemFromChest(AdvancedChest<?,?> chest);

}
