package us.lynuxcraft.deadsilenceiv.advancedchests.utils.inventory.items;

import org.bukkit.inventory.ItemStack;
import org.bukkit.inventory.meta.ItemMeta;
import us.lynuxcraft.deadsilenceiv.advancedchests.utils.inventory.InteractiveInventory;
import us.lynuxcraft.deadsilenceiv.advancedchests.utils.inventory.ShareableButton;

public class BaseShareableButtonItem extends BaseButtonItem<ShareableButton> implements ShareableButtonItem {
    public BaseShareableButtonItem(ShareableButton button, String name, ItemStack itemStack) {
        super(button, name, itemStack);
    }

    @Override
    public void show(InteractiveInventory inventory) {
        if(!initiallyRefreshed && !placeholders.isEmpty()){
            refresh(inventory);
        }else setItem(inventory);
    }

    @Override
    public void refresh(InteractiveInventory inventory) {
        ItemMeta updatedMeta = originalMeta.clone();
        updateName(updatedMeta);
        updateLore(updatedMeta);
        itemStack.setItemMeta(updatedMeta);
        if(inventory != null)setItem(inventory);
        initiallyRefreshed = true;
    }

    private void setItem(InteractiveInventory inventory){
        inventory.getBukkitInventory().setItem(button.getSlot(inventory), itemStack);
    }

}
