package us.lynuxcraft.deadsilenceiv.advancedchests.chest.gui.page;

import org.bukkit.entity.HumanEntity;
import us.lynuxcraft.deadsilenceiv.advancedchests.chest.AdvancedChest;
import us.lynuxcraft.deadsilenceiv.advancedchests.chest.gui.ChestInventory;

import java.util.List;

public interface ChestPage<I> extends ChestInventory{

    int getId();

    void setChest(AdvancedChest<?,?> chest);

    void setPreparedContent(I[] preparedContent);

    /**
     * Opens the inventory to a specified player.
     *
     * @param entity the human entity instance.
     */
    void open(HumanEntity entity);

    /**
     * Loads the inventory and the actions.
     */
    void setupPage();

    /**
     * Clears the inventory, removes the actions and re-setup the inventory.
     */
    void reloadPage();

    /**
     * Set the specified list of items into the page.
     * The size of the list should be equal to the {@link #getInputSlots()} length.
     *
     * @param items the items that will be set into the page.
     */
    void setContent(List<I> items);

    /**
     * Get all the page content excluding the bottom row.
     *
     * @return an array with all the content of the page.
     */
    I[] getItems();

    /**
     * Get all the slots excluding the bottom row slots.
     *
     * @return an array with all the content slots.
     */
    default int[] getInputSlots(){
        int totalSize = getBukkitInventory().getSize()-9;
        int[] slots = new int[totalSize];
        for(int i = 0; i <= slots.length-1;i++)slots[i] = i;
        return slots;
    }

}

