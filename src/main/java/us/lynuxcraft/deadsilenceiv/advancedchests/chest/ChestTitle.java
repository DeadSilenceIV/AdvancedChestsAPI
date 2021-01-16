package us.lynuxcraft.deadsilenceiv.advancedchests.chest;

public abstract class ChestTitle {

    public abstract void spawn();

    public abstract void delete();

    public abstract void update();

    public void tickByHopper(){}

    public boolean isUsingRefreshablePlaceholders(){
        return true;
    }
}
