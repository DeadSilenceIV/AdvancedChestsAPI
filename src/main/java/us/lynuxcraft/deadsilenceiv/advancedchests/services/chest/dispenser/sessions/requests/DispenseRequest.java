package us.lynuxcraft.deadsilenceiv.advancedchests.services.chest.dispenser.sessions.requests;

import lombok.Getter;
import lombok.Setter;
import org.bukkit.inventory.ItemStack;
import us.lynuxcraft.deadsilenceiv.advancedchests.chest.gui.page.ChestPage;

public abstract class DispenseRequest<P extends ChestPage<?>> implements InventoryRequest {
    @Getter @Setter private ItemStack itemStack;
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
}
