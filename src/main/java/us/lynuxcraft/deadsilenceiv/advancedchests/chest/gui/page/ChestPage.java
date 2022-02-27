package us.lynuxcraft.deadsilenceiv.advancedchests.chest.gui.page;

import org.bukkit.entity.Player;
import org.bukkit.inventory.Inventory;
import org.bukkit.inventory.ItemStack;
import us.lynuxcraft.deadsilenceiv.advancedchests.chest.AdvancedChest;

import java.util.List;

public class ChestPage{

    /**
     * Opens the inventory to a specified player.
     *
     * @param player the player instance.
     */
    public void open(Player player){}

    /**
     * Clears the inventory, removes the actions and re-setup the inventory.
     */
    public void reloadPage(){}

    /**
     * Set the specified list of items into the page.
     * The size of the list should be equal to the {@link #getInputSlots()} length.
     *
     * @param items the items that will be set into the page.
     */
    public void setContent(List<ItemStack> items){}

    /**
     * Gets the {@link AdvancedChest} where the page belongs to.
     *
     * @return the owner of the page.
     */
    public AdvancedChest getChest(){return null;}

    /**
     * Get all the page content excluding the bottom row.
     *
     * @return an array with all the content of the page.
     */
    public ItemStack[] getItems(){
        return null;
    }
    /**
     * Get all the slots excluding the bottom row slots.
     *
     * @return an array with all the content slots.
     */
    public int[] getInputSlots(){
        return null;
    }

    /**
     * Gets the bukkit inventory.
     *
     * @return the {@link Inventory} instance.
     */
    public Inventory getBukkitInventory() {
        return null;
    }

    /**
     * Gets the id of the page.
     *
     * @return the identifier of the page.
     */
    public int getId(){return 0;}
}

