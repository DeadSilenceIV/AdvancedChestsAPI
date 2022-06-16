package us.lynuxcraft.deadsilenceiv.advancedchests.managers;

import com.google.common.cache.LoadingCache;
import org.bukkit.entity.Player;
import org.bukkit.inventory.Inventory;
import us.lynuxcraft.deadsilenceiv.advancedchests.chest.AdvancedChest;
import us.lynuxcraft.deadsilenceiv.advancedchests.chest.gui.ChestInventory;
import us.lynuxcraft.deadsilenceiv.advancedchests.shop.IShop;
import us.lynuxcraft.deadsilenceiv.advancedchests.utils.inventory.InteractiveInventory;

import java.util.*;

public interface InventoryManager{

    Map<Inventory,InteractiveInventory> getInventories();


    LoadingCache<Inventory, Optional<AdvancedChest<?,?>>> getCachedChestsVanillaContainers();

    /**
     * Registers an InteractiveInventory.
     *
     * @param inventory the InteractiveInventory instance.
     */
    void register(InteractiveInventory inventory);

    /**
     * Un-Registers an InteractiveInventory
     *
     * @param inventory the InteractiveInventory instance.
     */
    void unRegister(InteractiveInventory inventory);

    /**
     * Gets the {@link AdvancedChest} instance if the respective
     * {@link InteractiveInventory} from the inventory is an
     * instance of {@link ChestInventory}.
     *
     * @param inventory the bukkit inventory instance
     * @return the AdvancedChest instance if is possible to get.
     */
    AdvancedChest<?,?> getAdvancedChest(Inventory inventory);

    /**
     * Gets the interactive inventory by its bukkit inventory.
     *
     * @param inventory the Inventory instance
     * @return the InteractiveInventory instance, null if the there is any InteractiveInventory associated.
     */
    InteractiveInventory getInteractiveByBukkit(Inventory inventory);

    /**
     * Gets the shop of a specified player.
     *
     * @param player the player instance
     * @return the Shop instance, null if was not found.
     */
    IShop getChestsShopByPlayer(Player player);

    /**
     * Un-Registers all the InteractiveInventories that an AdvancedChest can contain.
     *
     * @param chest the AdvancedChest instance.
     */
    void unRegister(AdvancedChest<?, ?> chest);
}
