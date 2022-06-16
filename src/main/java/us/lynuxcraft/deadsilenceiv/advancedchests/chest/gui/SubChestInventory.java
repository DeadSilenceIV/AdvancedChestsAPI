package us.lynuxcraft.deadsilenceiv.advancedchests.chest.gui;

public interface SubChestInventory extends ChestInventory{

    /**
     * Gets the name of the sub menu.
     *
     * @return the name of the sub menu.
     */
    String getName();

    /**
     * Checks if the menu is available for the current chest type.
     *
     * @return true if is available, false otherwise.
     */
    boolean isAvailable();
}
