package us.lynuxcraft.deadsilenceiv.advancedchests.events;

import us.lynuxcraft.deadsilenceiv.advancedchests.chest.AdvancedChest;

/**
 * Called when an AdvancedChest is being removed
 */
public class ChestRemoveEvent{
    /**
     * Gets the {@link AdvancedChest} instance.
     */
    public AdvancedChest getChest(){
        return null;
    }

    /**
     * Cancels the event.
     *
     * @param b if it should be cancelled or not.
     */
    public void setCancelled(boolean b) {}
}
