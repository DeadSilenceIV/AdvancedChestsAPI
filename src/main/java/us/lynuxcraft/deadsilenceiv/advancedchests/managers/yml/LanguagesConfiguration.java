package us.lynuxcraft.deadsilenceiv.advancedchests.managers.yml;

import lombok.Getter;
import org.bukkit.configuration.ConfigurationSection;
import org.bukkit.configuration.file.YamlConfiguration;
import us.lynuxcraft.deadsilenceiv.advancedchests.AdvancedChests;
import us.lynuxcraft.deadsilenceiv.advancedchests.AdvancedChestsAPI;
import us.lynuxcraft.deadsilenceiv.advancedchests.utils.FileUtils;

import java.io.*;

public class LanguagesConfiguration {
    private AdvancedChests plugin;
    private File languagesFile;
    private YamlConfiguration config;
    @Getter private ConfigurationSection section;
    public LanguagesConfiguration(){
        plugin = AdvancedChestsAPI.getInstance();
        load();
        checkSectionUpdates(getMainResource(),"languages");
    }


    /**
     * Checks for new updates at a specified configuration section.
     *
     * @param resource the original resource of the plugin
     * @param configSection the configuration section instance.
     */
    private void checkSectionUpdates(YamlConfiguration resource,String configSection){
        ConfigurationSection section = resource.getConfigurationSection(configSection);
        checkCorrections();
        for(String key : section.getKeys(true)){
            if(!config.isSet(configSection+"."+key)){
                config.createSection(configSection+"."+key);
                config.set(configSection+"."+key,section.get(key));
            }
        }
        save();
    }

    /**
     * Checks for some section corrections.
     */
    private void checkCorrections(){
        if(!config.isConfigurationSection("languages.gui.previouspage")){
            String currentName = config.getString("languages.gui.previouspage","&6&lPrevious page");
            config.set("languages.gui.previouspage.name",currentName);
            config.set("languages.gui.previouspage.head","MHF_ArrowLeft");
        }
        if(!config.isConfigurationSection("languages.gui.nextpage")){
            String currentName = config.getString("languages.gui.nextpage","&6&lNext page");
            config.set("languages.gui.nextpage.name",currentName);
            config.set("languages.gui.nextpage.head","MHF_ArrowRight");
        }
        if(!config.isConfigurationSection("languages.shop.next")){
            String currentNextName = config.getString("languages.shop.nextpage.name");
            String currentNextHead = config.getString("languages.shop.nextpage.head");
            config.set("languages.shop.nextpage",null);
            config.set("languages.shop.next.name",currentNextName);
            config.set("languages.shop.next.head",currentNextHead);
        }
        if(!config.isConfigurationSection("languages.gui.break-confirmation")){
            ConfigurationSection section = config.getConfigurationSection("languages.gui.confirmation");
            for(String key : section.getKeys(true))config.set("languages.gui.break-confirmation"+"."+key,section.get(key));
            config.set("languages.gui.confirmation",null);
        }
    }

    /**
     * Loads the the languages.yml file and the main section.
     */
    private void load(){
        InputStream languages = plugin.getResource("languages.yml");
        if(!plugin.getDataFolder().exists())plugin.getDataFolder().mkdirs();
        languagesFile = new File(plugin.getDataFolder().getPath() + File.separator + "languages.yml");
        if(!languagesFile.exists()) {
            try {
                languagesFile.createNewFile();
                FileOutputStream outputStream = new FileOutputStream(languagesFile);
                FileUtils.copyInputStreamToOutputStream(languages, outputStream);
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
        config = YamlConfiguration.loadConfiguration(languagesFile);
        section = config.getConfigurationSection("languages");
    }

    /**
     * Saves the languages.yml file.
     */
    private void save(){
        try {
            config.save(languagesFile);
        }catch (IOException e){
            e.printStackTrace();
        }
    }

    /**
     * Gets the main resource of the languages.yml.
     *
     * @return the YamlConfiguration of the main resource.
     */
    private YamlConfiguration getMainResource(){
        YamlConfiguration config = null;
        try {
            Reader defConfigStream = new InputStreamReader(plugin.getResource("languages.yml"), "UTF8");
            config = YamlConfiguration.loadConfiguration(defConfigStream);
        }catch (Exception e){
            e.printStackTrace();
        }
        return config;
    }
}
