package us.lynuxcraft.deadsilenceiv.advancedchests.chest;

import java.util.List;

public abstract class ChestTitle {

    public abstract void spawn();

    public abstract void delete();

    public abstract void update();

    public void tickByHopper(){}

    public boolean isUsingRefreshablePlaceholders(){
        return true;
    }

    public List<String> getHologramsTitle(){
        return null;
    }

    public void setHologramsTitle(List<String> title){}

}
