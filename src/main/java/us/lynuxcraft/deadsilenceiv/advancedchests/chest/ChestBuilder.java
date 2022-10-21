package us.lynuxcraft.deadsilenceiv.advancedchests.chest;

import us.lynuxcraft.deadsilenceiv.advancedchests.chest.gui.page.ChestPage;

import java.util.Set;
import java.util.UUID;

public interface ChestBuilder<I,P extends ChestPage<I>,T extends AdvancedChest<I,P>> {

    /**
     * Sets the uuid of the chest.
     *
     * @param uuid the uuid instance
     * @return the ChestBuilder.
     */
    ChestBuilder<I,P,T> setUUID(UUID uuid);

    /**
     * Sets the pages of the chest.
     *
     * @param pages the uuid instance
     * @return the ChestBuilder.
     */
    ChestBuilder<I,P,T> setPages(Set<P> pages);

    /**
     * Sets the amount of money of the chest.
     *
     * @param money amount of money
     * @return the ChestBuilder instance.
     */
    ChestBuilder<I,P,T> setMoney(Double money);

    /**
     * Sets the status of the automatic sells.
     *
     * @param status the status of the sells
     * @return the ChestBuilder instance.
     */
    ChestBuilder<I,P,T> setAutomaticSellsStatus(boolean status);

    /**
     * Sets the owner of the automatic sells last session.
     *
     * @param owner the owner of the last session
     * @return the ChestBuilder instance.
     */
    ChestBuilder<I,P,T> setAutomaticSellsSessionOwner(UUID owner);

    /**
     * Sets the uuid of the player who placed the chest.
     *
     * @param uuid the player who placed the chest.
     * @return the ChestBuilder instance.
     */
    ChestBuilder<I,P,T> setWhoPlaced(UUID uuid);

    /**
     * Builds the AdvancedChest.
     *
     * @return the AdvancedChest instance.
     */
    T build();

}
