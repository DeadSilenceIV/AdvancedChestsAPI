package us.lynuxcraft.deadsilenceiv.advancedchests.services.chest.sorter;

import us.lynuxcraft.deadsilenceiv.advancedchests.chest.AdvancedChest;
import us.lynuxcraft.deadsilenceiv.advancedchests.services.chest.SortStatus;

public interface SorterService {

    SortStatus sort(AdvancedChest<?,?> chest, SortType type);

}
