package us.lynuxcraft.deadsilenceiv.advancedchests.services.chest.storage.mysql;

import us.lynuxcraft.deadsilenceiv.advancedchests.chest.gui.page.ChestPage;

import java.util.Set;

public interface MysqlService{

    /**
     * Serializes an array of chest pages.
     *
     * @param pages the array of pages.
     * @return the byte array.
     */
    byte[] serializePages(ChestPage<?>[] pages);

    /**
     * Converts a serialized array of chest pages into a normal set of pages.
     *
     * @return the set of de-serialized pages.
     */
    Set<ChestPage<?>> deserializePages(byte[] serializedPages, int totalChestSize);

}
