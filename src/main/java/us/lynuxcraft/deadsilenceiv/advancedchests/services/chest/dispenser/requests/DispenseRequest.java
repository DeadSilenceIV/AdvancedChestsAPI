package us.lynuxcraft.deadsilenceiv.advancedchests.services.chest.dispenser.requests;

import org.bukkit.inventory.ItemStack;
import us.lynuxcraft.deadsilenceiv.advancedchests.chest.gui.page.ChestPage;

public abstract class DispenseRequest<P extends ChestPage<?>> implements InventoryRequest {

    public abstract long getItemAmount();

    public void setAmountToDispense(long amount){}

    public ItemStack getItemStack(){
        return null;
    }

}
