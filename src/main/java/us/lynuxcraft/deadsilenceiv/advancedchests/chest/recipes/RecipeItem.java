package us.lynuxcraft.deadsilenceiv.advancedchests.chest.recipes;

import org.bukkit.inventory.ItemStack;

public interface RecipeItem {

    /**
     * Gets the character that represents the item in the recipe.
     *
     * @return the key character of the item.
     */
    char getKey();

    /**
     * Gets the ItemStack instance for the RecipeItem.
     *
     * @return the ItemStack instance.
     */
    ItemStack getStack();

}
