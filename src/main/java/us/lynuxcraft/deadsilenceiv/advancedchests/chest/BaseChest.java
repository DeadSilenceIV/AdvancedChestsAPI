package us.lynuxcraft.deadsilenceiv.advancedchests.chest;

import org.bukkit.inventory.ItemStack;
import us.lynuxcraft.deadsilenceiv.advancedchests.chest.gui.page.BasePage;
import us.lynuxcraft.deadsilenceiv.advancedchests.chest.title.ChestTitle;
import us.lynuxcraft.deadsilenceiv.advancedchests.utils.ChunkLocation;

import java.util.Map;
import java.util.Set;
import java.util.UUID;

public abstract class BaseChest<I,T extends BasePage<I>> implements AdvancedChest<I,T> {
    protected UUID uniqueId;
    protected Set<T> pages;
    protected String configType;
    protected ChestType chestType;
    protected Integer size;
    protected ChestTitle chestTitle;
    protected boolean automaticSellsStatus;
    protected UUID automaticSellsSessionOwner;
    protected double money;
    public Map<UUID,ItemStack> changingPagePlayers;
    public Map<UUID, Integer> lastOpenedPages;
    protected String location;
    protected ChunkLocation chunkLocation;
    protected boolean entityLoaded;
    BaseChest(int size, String configType, ChestType chestType, String location) {}

    @Override
    public UUID getUniqueId() {
        return uniqueId;
    }

    public void setUniqueId(UUID uniqueId) {
        this.uniqueId = uniqueId;
    }

    @Override
    public Set<T> getPages() {
        return pages;
    }

    public void setPages(Set<T> pages) {
        this.pages = pages;
    }

    @Override
    public String getConfigType() {
        return configType;
    }

    public void setConfigType(String configType) {
        this.configType = configType;
    }

    @Override
    public ChestType getChestType() {
        return chestType;
    }

    public void setChestType(ChestType chestType) {
        this.chestType = chestType;
    }

    @Override
    public Integer getSize() {
        return size;
    }

    public void setSize(Integer size) {
        this.size = size;
    }

    @Override
    public ChestTitle getChestTitle() {
        return chestTitle;
    }

    public void setChestTitle(ChestTitle chestTitle) {
        this.chestTitle = chestTitle;
    }

    @Override
    public boolean isAutomaticSellsStatus() {
        return automaticSellsStatus;
    }

    @Override
    public void setAutomaticSellsStatus(boolean automaticSellsStatus) {
        this.automaticSellsStatus = automaticSellsStatus;
    }

    @Override
    public UUID getAutomaticSellsSessionOwner() {
        return automaticSellsSessionOwner;
    }

    @Override
    public void setAutomaticSellsSessionOwner(UUID automaticSellsSessionOwner) {
        this.automaticSellsSessionOwner = automaticSellsSessionOwner;
    }

    @Override
    public double getMoney() {
        return money;
    }

    @Override
    public void setMoney(double money) {
        this.money = money;
    }

    @Override
    public ChunkLocation getChunkLocation() {
        return chunkLocation;
    }

    @Override
    public boolean isEntityLoaded() {
        return entityLoaded;
    }

}
