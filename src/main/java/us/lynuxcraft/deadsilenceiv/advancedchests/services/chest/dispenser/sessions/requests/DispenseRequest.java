package us.lynuxcraft.deadsilenceiv.advancedchests.services.chest.dispenser.sessions.requests;

import org.bukkit.inventory.ItemStack;
import us.lynuxcraft.deadsilenceiv.advancedchests.chest.gui.page.ChestPage;

public abstract class DispenseRequest<P extends ChestPage<?>> implements InventoryRequest {
    protected P page;
    protected long amountToDispense;
    public DispenseRequest(P page) {
        this.page = page;
        this.amountToDispense = 1;
    }

    public abstract long getItemAmount();

    public void setAmountToDispense(long amount){
        amountToDispense = Math.min(amount, getItemAmount());
    }

    public ItemStack getItemStack(){
        return null;
    }
}
