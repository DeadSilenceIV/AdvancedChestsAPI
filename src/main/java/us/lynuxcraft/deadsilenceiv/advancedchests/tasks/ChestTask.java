package us.lynuxcraft.deadsilenceiv.advancedchests.tasks;

import us.lynuxcraft.deadsilenceiv.advancedchests.chest.AdvancedChest;

public interface ChestTask extends Runnable{

    AdvancedChest<?,?> getChest();

}
