package us.lynuxcraft.deadsilenceiv.advancedchests.utils.inventory;

import lombok.Getter;
import us.lynuxcraft.deadsilenceiv.advancedchests.utils.inventory.actions.InventoryAction;

import java.util.HashSet;
import java.util.Set;

public abstract class BaseInteractiveInventory implements InteractiveInventory {
    @Getter protected final Set<Button> buttons;
    @Getter protected final Set<InventoryAction> actions;
    public BaseInteractiveInventory(){
        buttons = new HashSet<>();
        actions = new HashSet<>();
    }
}
