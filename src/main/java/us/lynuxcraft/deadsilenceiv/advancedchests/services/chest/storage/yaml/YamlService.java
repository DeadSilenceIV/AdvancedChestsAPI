package us.lynuxcraft.deadsilenceiv.advancedchests.services.chest.storage.yaml;

import org.bukkit.configuration.file.YamlConfiguration;
import us.lynuxcraft.deadsilenceiv.advancedchests.chest.AdvancedChest;
import us.lynuxcraft.deadsilenceiv.advancedchests.chest.gui.page.ChestPage;

import java.util.Set;


public interface YamlService {

    void writePages(YamlConfiguration config, AdvancedChest<?,?> chest);

    void writePages(YamlConfiguration config, ChestPage<?>[] pages);

    Set<? extends ChestPage<?>> getPages(YamlConfiguration config);

}
