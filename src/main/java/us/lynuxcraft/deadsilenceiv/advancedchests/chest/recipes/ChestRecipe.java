package us.lynuxcraft.deadsilenceiv.advancedchests.chest.recipes;

import lombok.Getter;
import org.bukkit.inventory.ItemStack;
import us.lynuxcraft.deadsilenceiv.advancedchests.AdvancedChests;
import us.lynuxcraft.deadsilenceiv.advancedchests.AdvancedChestsAPI;

import java.util.List;
import java.util.Set;

public abstract class ChestRecipe{
    protected AdvancedChests plugin;
    @Getter protected String chestType;
    @Getter protected Set<RecipeItem> items;
    @Getter protected List<String> recipeLines;
    @Getter protected ItemStack result;
    public ChestRecipe(String chestType,Set<RecipeItem> recipeItems,List<String> recipeLines,ItemStack result) {
        plugin = AdvancedChestsAPI.getInstance();
        this.chestType = chestType;
        this.items = recipeItems;
        this.recipeLines = recipeLines;
        this.result = result;
    }

    /**
     * Tries to load the chest recipe.
     *
     * @throws IllegalArgumentException if the recipe is not valid.
     */
    public abstract void load() throws IllegalArgumentException;
}
