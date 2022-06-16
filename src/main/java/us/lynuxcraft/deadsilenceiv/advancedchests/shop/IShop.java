package us.lynuxcraft.deadsilenceiv.advancedchests.shop;

import org.bukkit.entity.Player;
import org.bukkit.event.inventory.ClickType;
import org.bukkit.event.inventory.InventoryClickEvent;
import org.bukkit.inventory.Inventory;
import org.bukkit.inventory.ItemStack;
import us.lynuxcraft.deadsilenceiv.advancedchests.utils.inventory.Button;
import us.lynuxcraft.deadsilenceiv.advancedchests.utils.inventory.InteractiveInventory;
import us.lynuxcraft.deadsilenceiv.advancedchests.utils.inventory.actions.ButtonAction;
import us.lynuxcraft.deadsilenceiv.advancedchests.utils.inventory.actions.SlotAction;

public interface IShop extends InteractiveInventory {
    
    boolean isChangingIndex();
    
    /**
     * Opens the inventory at a specified index for the player.
     *
     * @param index the index of the view.
     */
    void open(int index);

    @Override
    default void handleInventoryInteraction(InventoryClickEvent event) {
        Player player = (Player)event.getWhoClicked();
        Inventory clickedInventory = event.getClickedInventory();
        int slot = event.getSlot();
        ClickType clickType = event.getClick();
        ItemStack currentItem = event.getCurrentItem();
        event.setCancelled(true);
        if(clickedInventory != null && clickedInventory.equals(getBukkitInventory()) && currentItem != null) {
            Button<?> button = getButton(currentItem);
            if(button != null){
                ButtonAction action = getButtonAction(button,clickType);
                if(action != null)action.execute(player);
            }
            SlotAction slotAction = getSlotAction(slot,clickType);
            if(slotAction != null)slotAction.execute(player);
        }
    }
    
}
