package us.lynuxcraft.deadsilenceiv.advancedchests.utils.inventory;

import org.bukkit.entity.HumanEntity;
import org.bukkit.event.inventory.ClickType;
import org.bukkit.event.inventory.InventoryClickEvent;
import org.bukkit.event.inventory.InventoryDragEvent;
import org.bukkit.inventory.Inventory;
import org.bukkit.inventory.ItemStack;
import us.lynuxcraft.deadsilenceiv.advancedchests.utils.inventory.actions.*;
import us.lynuxcraft.deadsilenceiv.advancedchests.utils.inventory.items.ButtonItem;

import java.util.Comparator;
import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;

public interface InteractiveInventory {

    Set<Button> getButtons();

    Set<InventoryAction> getActions();

    default void addButton(Button button){
        getButtons().add(button);
    }

    default void addAction(InventoryAction action){
        getActions().add(action);
    }

    default Button<?> getButtonByName(String name){
        for (Button<?> button : getButtons()) {
            if(button.getName().equals(name))return button;
        }
        return null;
    }

    default Button<?> getButton(ItemStack item){
        for (Button<?> button : getButtons()) {
            ButtonItem currentItem = button.getCurrentItem();
            if(currentItem != null) {
                if (currentItem.getItemStack().isSimilar(item))return button;
            }
        }
        return null;
    }

    default ButtonAction getButtonAction(Button<?> button, ClickType type){
        for (InventoryAction action : getActions()) {
            if(action instanceof ButtonAction){
                ButtonAction buttonAction = (ButtonAction)action;
                if(buttonAction.getButton().equals(button) && buttonAction.getClickType() == type){
                    return buttonAction;
                }
            }
        }
        return null;
    }

    default SlotAction getSlotAction(int slot, ClickType type){
        SlotAction result = null;
        for(InventoryAction action : getActions()){
            if(action instanceof SlotAction) {
             SlotAction slotAction = (SlotAction)action;
                if (slot == slotAction.getSlot() && action.getClickType() == type) {
                    if(result == null || result.getPriority() < slotAction.getPriority()){
                        result = slotAction;
                    }
                }
            }
        }
        return result;
    }

    default List<InventoryAction> getSlotActions(int slot, ClickType type){
        return getActions().stream()
                .sorted(Comparator.comparing(InventoryAction::getPriority))
                .filter(action -> {
                    if(action instanceof SlotAction){
                        SlotAction slotAction = (SlotAction) action;
                        return slotAction.getSlot() == slot && slotAction.getClickType() == type;
                    }
                    return false;
                })
                .collect(Collectors.toList());
    }

    default ItemAction getItemAction(ItemStack stack, ClickType type){
        for(InventoryAction action : getActions()){
            if(action instanceof ItemAction) {
                ItemAction itemAction = (ItemAction)action;
                if(itemAction.getStack().isSimilar(stack) && action.getClickType() == type)return itemAction;
            }
        }
        return null;
    }

    default OutSideAction getOutSideAction(ClickType clickType){
        for (InventoryAction action : getActions()) {
            if(action instanceof OutSideAction){
                OutSideAction outSideAction = (OutSideAction)action;
                if(outSideAction.getClickType().equals(clickType)){
                    return outSideAction;
                }
            }
        }
        return null;
    }

    default void closeForViewers(){
        if(getBukkitInventory() == null)return;
        List<HumanEntity> viewers = getBukkitInventory().getViewers();
        for (int i = 0; i < viewers.size(); i++){
            viewers.get(i).closeInventory();
        }
    }

    void handleInventoryInteraction(InventoryClickEvent event);

    default void handleInventoryDragging(InventoryDragEvent event){}

    Inventory getBukkitInventory();

}
