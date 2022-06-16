package us.lynuxcraft.deadsilenceiv.advancedchests.utils.inventory.items;

import org.bukkit.inventory.ItemStack;

public class WrappedItemStack extends ItemStack implements UniqueItem{

    public WrappedItemStack(ItemStack itemStack){
        super(itemStack);
    }

    @Override
    public ItemStack getItemStack() {
        return this;
    }

}
