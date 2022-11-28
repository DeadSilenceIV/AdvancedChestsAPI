package us.lynuxcraft.deadsilenceiv.advancedchests.managers;

import us.lynuxcraft.deadsilenceiv.advancedchests.chest.AdvancedChest;
import us.lynuxcraft.deadsilenceiv.advancedchests.chest.ChestAttribute;
import us.lynuxcraft.deadsilenceiv.advancedchests.chest.gui.page.ChestPage;

import java.util.Map;
import java.util.Set;
import java.util.UUID;
import java.util.concurrent.CompletableFuture;

public interface ChestStorage{

    /**
     * Saves the chest into the storage.
     *
     * @param chest the chest instance.
     */
    void save(AdvancedChest<?,?> chest);


    /**
     * Deletes a specified chest from storage.
     *
     * @param uuid the uuid of the chest
     */
    void delete(UUID uuid);

    /**
     * Gets the completable future of the chest data map.
     *
     * @param uuid the uuid of the chest
     * @return a completable future of ChestAttribute data map.
     */
    CompletableFuture<Map<ChestAttribute,Object>> getChestData(UUID uuid);


    /**
     * Gets the completable future of the data map of a set of chests ids.
     *
     * @param chests the uuid of the chest to request
     * @return a completable future of the requested chests' data.
     */
    CompletableFuture<Map<UUID,Map<ChestAttribute,Object>>> getChestsData(Set<UUID> chests);

    /**
     * Gets the completable future of the registered chests in the storage.
     *
     * @return a completable future of the registered chests.
     */
    CompletableFuture<Set<UUID>> getRegisteredChests();

    /**
     * Imports a specified data map into the storage.
     *
     * @param data the data map
     * @return a completable future of the imported chest.
     */
    CompletableFuture<Set<UUID>> importData(Map<UUID,Map<ChestAttribute,Object>> data);

    /**
     * Stops all the services used by the storage.
     */
    void stopServices();

    /**
     * Order a set of {@link ChestPage} by its id.
     *
     * @param pages the set of chest pages
     * @return the ordered array of pages.
     */
    default ChestPage<?>[] orderPages(Set<ChestPage<?>> pages){
        ChestPage<?>[] orderedPages = new ChestPage[pages.size()];
        for (int i = 0; i < pages.size(); i++) {
            for (ChestPage<?> page : pages) {
                if(page.getId() == i)orderedPages[i] = page;
            }
        }
        return orderedPages;
    }
}
