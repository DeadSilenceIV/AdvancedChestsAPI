package us.lynuxcraft.deadsilenceiv.advancedchests.services.chest.search;

import us.lynuxcraft.deadsilenceiv.advancedchests.chest.AdvancedChest;

import java.util.Set;

public interface SearchService {

    Set<Integer> search(AdvancedChest<?,?> chest,String... keywords);

}
