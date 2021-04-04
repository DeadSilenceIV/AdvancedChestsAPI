package us.lynuxcraft.deadsilenceiv.advancedchests.chest.title;

import java.util.List;

public abstract class ChestTitle {

    /**
     * Spawns the entity.
     */
    public abstract void spawn();

    /**
     * Deletes the entity.
     */
    public abstract void delete();

    /**
     * Updates the content.
     */
    public abstract void update();

    /**
     * Increases an internal counter to refresh the title
     * This method can be used mainly for hopper movement.
     */
    public void tickByHopper(){}

    /**
     * Checks if the content of the holograms has placeholders.
     *
     * @return true if has placeholders, false otherwise.
     */
    public boolean isUsingRefreshablePlaceholders(){
        return true;
    }

    /**
     * Gets the content of the hologram.
     *
     * @return the content.
     */
    public List<String> getContent(){
        return null;
    }

    /**
     * Sets the content of the hologram.
     *
     * @param title the new content.
     */
    public void setContent(List<String> title){}

}
