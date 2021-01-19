package us.lynuxcraft.deadsilenceiv.advancedchests.chest;

import org.bukkit.Location;
import org.bukkit.entity.Player;
import org.bukkit.event.block.BlockBreakEvent;
import us.lynuxcraft.deadsilenceiv.advancedchests.services.chest.CompressionStatus;
import us.lynuxcraft.deadsilenceiv.advancedchests.services.chest.SortStatus;
import us.lynuxcraft.deadsilenceiv.advancedchests.services.chest.SortType;

import java.util.LinkedList;
import java.util.UUID;

public class AdvancedChest {

    public void openPage(Player player, int page){}

    public void upgrade(String upgrade){}

    public void save(){}

    public void remove(BlockBreakEvent blockBreakEvent){}

    public void sell(Player player){}

    public void closeForViewers(){}

    public SortStatus sort(SortType sortType){
        return null;
    }

    public boolean smelt(){
        return true;
    }

    public CompressionStatus compress(){
        return null;
    }

    public boolean isPlayerChangingPage(Player player){
        return true;
    }

    public boolean isBeingSold(){
        return true;
    }

    public boolean isLoaded(){
        return true;
    }

    public boolean isAutomaticSellsStatus(){
        return true;
    }

    public void setAutomaticSellsStatus(boolean status){ }

    public void setMoney(double money){ }

    public String getType(){
        return "";
    }

    public LinkedList<ChestPage> getPages(){
        return null;
    }

    public ChestPage getPlayerPage(Player player){
        return null;
    }

    public ChestPage getPageById(int id){
        return null;
    }

    public ChestTitle getChestTitle(){
        return null;
    }

    public UUID getUniqueId(){
        return null;
    }

    public Location getLocation(){
        return null;
    }

    public int getSlotsUsed(){
        return 0;
    }

    public int getSlotsLeft(){
        return 0;
    }

    public int getSize(){
        return 0;
    }

    public double getMoney(){
        return 0.0;
    }

}
