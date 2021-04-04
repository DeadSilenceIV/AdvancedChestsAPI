package us.lynuxcraft.deadsilenceiv.advancedchests.chest;

import us.lynuxcraft.deadsilenceiv.advancedchests.chest.gui.page.ChestPage;

import java.util.Set;
import java.util.UUID;

public class ChestBuilder {

    public ChestBuilder(Integer size,String type,String location){}

    /**
     * Sets the uuid of the chest.
     *
     * @param uuid the uuid instance
     * @return the ChestBuilder.
     */
    public ChestBuilder setUUID(UUID uuid){
        return this;
    }

    /**
     * Sets the pages of the chest.
     *
     * @param pages the uuid instance
     * @return the ChestBuilder.
     */
    public ChestBuilder setPages(Set<ChestPage> pages){
        return this;
    }

    /**
     * Sets the amount of money of the chest.
     *
     * @param money amount of money
     * @return the ChestBuilder instance.
     */
    public ChestBuilder setMoney(Double money){
        return this;
    }

    /**
     * Sets the status of the automatic sells.
     *
     * @param status the status of the sells
     * @return the ChestBuilder instance.
     */
    public ChestBuilder setAutomaticSellsStatus(boolean status){
        return this;
    }

    /**
     * Builds the AdvancedChest.
     *
     * @return the AdvancedChest instance.
     */
    public AdvancedChest build(){
        return null;
    }
}
