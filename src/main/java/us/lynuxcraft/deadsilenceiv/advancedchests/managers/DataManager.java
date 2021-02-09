package us.lynuxcraft.deadsilenceiv.advancedchests.managers;

import org.bukkit.inventory.ItemStack;

import java.util.List;
import java.util.Set;

public class DataManager {

    public ItemStack getIcon(String chest){
        return null;
    }

    public int getChestSize(String chest){
        return 0;
    }

    public int getChestUpgradePrice(String chest){
        return 0;
    }

    public int getAutoSellsFrequency(String chest){
        return 0;
    }

    public double getAutoSellsTax(String chest){ return 0;}

    public String getInventoryName(String chest){
        return "";
    }

    public String getChestUpgrade(String chest){
        return "";
    }

    public double getChestShopPrice(String chest){
        return 0.0;
    }

    public double getSortersPrice(String chest){
        return 0.0;
    }

    public double getSmelterPrice(String chest){
        return 0.0;
    }

    public boolean isUpgradable(String chest){
        return true;
    }

    public boolean isTitleAvailable(String chest){
        return true;
    }

    public boolean areSortersAvailable(String chest){
        return true;
    }

    public boolean areSellsAvailable(String chest){
        return true;
    }

    public boolean areHoppersUseAllowed(String chest){
        return true;
    }

    public boolean areAutoSellsAvailable(String chest){
        return true;
    }

    public boolean isSmelterAvailable(String chest){
        return true;
    }

    public boolean isCompressorAvailable(String chest){return true;}

    public double getCompressorPrice(String chest){return 0.0;}

    public boolean isCraftingAvailable(String chest){
        return true;
    }

    public boolean isAdvancedChest(String chest){
        return true;
    }

    public boolean isNonLoadedAdvancedChest(String chest){
        return true;
    }

    public boolean areRecipesAvailable(){
        return true;
    }

    public List<String> getTitleContent(String chest){
        return null;
    }

    public List<String> getUnloadedChestsNames(){
        return null;
    }

    public Set<String> getAdvancedChestNames(){
        return null;
    }

}
