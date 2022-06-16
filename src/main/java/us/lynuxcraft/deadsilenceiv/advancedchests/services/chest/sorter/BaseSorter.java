package us.lynuxcraft.deadsilenceiv.advancedchests.services.chest.sorter;

import org.bukkit.Material;

import java.util.*;
import java.util.stream.Collectors;

public abstract class BaseSorter<T> implements SorterService{
    protected static List<Material> materials = Arrays.asList(Material.values());
    protected Map<SortType,Comparator<T>> cache;
    public BaseSorter() {
        cache = new HashMap<>();
    }
    public List<T> sort(List<T> items, SortType sortType) {
        return items.stream().sorted(Comparator.nullsLast(getComparator(sortType))).collect(Collectors.toList());
    }

    protected abstract Comparator<T> getComparator(SortType sortType);

}
