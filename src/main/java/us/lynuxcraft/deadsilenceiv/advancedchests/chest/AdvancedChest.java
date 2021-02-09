package us.lynuxcraft.deadsilenceiv.advancedchests.chest;

import org.bukkit.Location;
import org.bukkit.block.DoubleChest;
import org.bukkit.entity.Player;
import org.bukkit.event.block.BlockBreakEvent;
import us.lynuxcraft.deadsilenceiv.advancedchests.services.chest.*;

import java.util.*;

public class AdvancedChest{

    public List<UUID> changingPagePlayers;

    public Map<UUID,Integer> lastOpenedPages;

    public void openPage(Player p,int page){}

    public void upgrade(String upgrade){}

    public void expandSlots(int amount){}

    public void save(){}

    public void remove(BlockBreakEvent event,boolean dropItems){}

    public SortStatus sort(SortType sortType){return null;}

    public void sell(Player player){}

    public boolean smelt(){
        return true;
    }

    public CompressionStatus compress(){
        return null;
    }

    public void reloadTitle(){}

    public ChestPage getPlayerPage(Player p){
        return null;
    }

    public ChestPage getPageById(int id){
        return null;
    }

    public void closeForViewers(){}

    public boolean isPlayerChangingPage(Player p){
        return true;
    }

    public boolean isBeingSold(){
        return true;
    }

    public DoubleChest getDoubleChest(){
        return null;
    }

    public UUID getUniqueId() {
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

    public boolean isLoaded(){
        return true;
    }

    public List<ChestPage> getPages(){
        return null;
    }

    public String getType(){
        return "";
    }

    public Integer getSize(){
        return 0;
    }

    public ChestTitle getChestTitle(){
        return null;
    }

    public void setAutomaticSellsStatus(boolean status){}

    public boolean getAutomaticSellsStatus(){
        return true;
    }

    public void setMoney(double money){}

    public double getMoney(){
        return 0.0;
    }

}
