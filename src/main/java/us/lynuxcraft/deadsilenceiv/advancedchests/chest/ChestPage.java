package us.lynuxcraft.deadsilenceiv.advancedchests.chest;

import org.bukkit.entity.Player;
import org.bukkit.inventory.Inventory;
import org.bukkit.inventory.ItemStack;

import java.util.List;

public class ChestPage {

    public void open(Player player){}

    public void reloadPage(){}

    public List<ItemStack> getItems(){
        return null;
    }

    public int[] getAvailableSlots(){
        return new int[0];
    }

    public Inventory getInventory(){
        return null;
    }

    public int getId(){
        return 0;
    }

}
