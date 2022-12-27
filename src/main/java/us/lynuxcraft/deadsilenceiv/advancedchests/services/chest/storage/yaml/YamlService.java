package us.lynuxcraft.deadsilenceiv.advancedchests.services.chest.storage.yaml;

import org.bukkit.configuration.file.YamlConfiguration;
import us.lynuxcraft.deadsilenceiv.advancedchests.chest.AdvancedChest;
import us.lynuxcraft.deadsilenceiv.advancedchests.chest.gui.page.ChestPage;

import java.util.Map;


public interface YamlService {

    void writePages(YamlConfiguration config, AdvancedChest<?,?> chest);

    void writePages(YamlConfiguration config, ChestPage<?>[] pages);

    Map<Integer,? extends ChestPage<?>> getPages(YamlConfiguration config);

}
