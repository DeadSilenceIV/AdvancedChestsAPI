package us.lynuxcraft.deadsilenceiv.advancedchests.services.chest.dispenser;

import org.bukkit.inventory.ItemStack;
import us.lynuxcraft.deadsilenceiv.advancedchests.chest.AdvancedChest;
import us.lynuxcraft.deadsilenceiv.advancedchests.services.chest.dispenser.sessions.DispenseSession;

@Deprecated
public class ChestDispenser{

    /**
     * Dispenses the last item found in a specified AdvancedChest.
     *
     * @param chest the AdvancedChest instance
     * @return the ItemStack(Just a single unity).
     */
    public ItemStack dispenseLastItemFromChest(AdvancedChest<?,?> chest){
        return chest.getChestType().getDispenserService().dispenseLastItemFromChest(chest,1);
    }

    public DispenseSession<?,?> newDispenseSession(AdvancedChest<?,?> chest){
        return chest.getChestType().getDispenserService().newDispenseSession(chest);
    }

    /**
     * Dispenses a specified ItemStack into an AdvancedChest.
     *
     * @param chest the chest that is going to receive the item
     * @param item the item that will be put
     * @return true if there was space for the item, false otherwise.
     */
    public boolean dispenseItemToChest(AdvancedChest<?,?> chest, ItemStack item){
        return chest.getChestType().getDispenserService().dispenseItemToChest(chest,item);
    }

    /**
     * Checks if a specified AdvancedChest has space for an ItemStack.
     *
     * @param chest the AdvancedChest instance
     * @param item the item to check
     * @return true if there is space for the item, false otherwise.
     */
    public boolean hasSpaceForItem(AdvancedChest<?,?> chest,ItemStack item){
        return chest.getChestType().getDispenserService().hasSpaceForItem(chest,item);
    }

    /**
     * Gets the last item from a specified AdvancedChest without removing it.
     * Use {@link #dispenseLastItemFromChest(AdvancedChest)} to get the item and remove it.
     *
     * @param chest the AdvancedChest instance
     * @return the last item stack found in the chest, null any item was found.
     */
    public ItemStack getLastItemFromChest(AdvancedChest<?,?> chest){
        return chest.getChestType().getDispenserService().getLastItemFromChest(chest);
    }

}