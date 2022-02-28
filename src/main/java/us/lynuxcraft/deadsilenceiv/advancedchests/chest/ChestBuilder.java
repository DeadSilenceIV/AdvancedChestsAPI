package us.lynuxcraft.deadsilenceiv.advancedchests.chest;

import us.lynuxcraft.deadsilenceiv.advancedchests.chest.gui.page.BasePage;

import java.util.Set;
import java.util.UUID;

public class ChestBuilder<I,P extends BasePage<I>,T extends BaseChest<I,P>> {
    protected T chest;

    /**
     * Sets the uuid of the chest.
     *
     * @param uuid the uuid instance
     * @return the ChestBuilder.
     */
    public ChestBuilder<I,P,T> setUUID(UUID uuid){
        return this;
    }

    /**
     * Sets the pages of the chest.
     *
     * @param pages the uuid instance
     * @return the ChestBuilder.
     */
    public ChestBuilder<I,P,T> setPages(Set<P> pages){
        return this;
    }

    /**
     * Sets the amount of money of the chest.
     *
     * @param money amount of money
     * @return the ChestBuilder instance.
     */
    public ChestBuilder<I,P,T> setMoney(Double money){
        return this;
    }

    /**
     * Sets the status of the automatic sells.
     *
     * @param status the status of the sells
     * @return the ChestBuilder instance.
     */
    public ChestBuilder<I,P,T> setAutomaticSellsStatus(boolean status){
        return this;
    }

    /**
     * Sets the owner of the automatic sells last session.
     *
     * @param owner the owner of the last session
     * @return the ChestBuilder instance.
     */
    public ChestBuilder<I,P,T> setAutomaticSellsSessionOwner(UUID owner){
        return this;
    }

    /**
     * Builds the AdvancedChest.
     *
     * @return the AdvancedChest instance.
     */
    public T build(){
        return null;
    }

}
