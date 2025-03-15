package us.lynuxcraft.deadsilenceiv.advancedchests.utils;

import lombok.AllArgsConstructor;
import lombok.Getter;
import org.bukkit.inventory.ItemStack;
import us.lynuxcraft.deadsilenceiv.advancedchests.chest.gui.page.ChestPage;

import java.util.Objects;

@AllArgsConstructor
public class SoldItem {
    @Getter private ItemStack item;
    @Getter private Double worth;
    @Getter private ChestPage<?> page;
    @Getter private Integer slot;

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof SoldItem)) return false;
        SoldItem soldItem = (SoldItem) o;
        return item.equals(soldItem.item) && worth.equals(soldItem.worth) && page.equals(soldItem.page) && slot.equals(soldItem.slot);
    }

    @Override
    public int hashCode() {
        return Objects.hash(item, worth, page, slot);
    }

}