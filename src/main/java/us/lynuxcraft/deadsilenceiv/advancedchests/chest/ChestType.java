package us.lynuxcraft.deadsilenceiv.advancedchests.chest;

import us.lynuxcraft.deadsilenceiv.advancedchests.chest.gui.page.ChestPage;
import java.util.Set;

public enum ChestType {
    NORMAL,
    INFINITE;
    public ChestBuilder<?,?,?> getBuilder(int size, String configType, String location, Set<? extends ChestPage<?>> pages){
        return null;
    }
}
