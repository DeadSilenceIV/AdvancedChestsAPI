package us.lynuxcraft.deadsilenceiv.advancedchests.services.chest;

import org.bukkit.Bukkit;
import us.lynuxcraft.deadsilenceiv.advancedchests.chest.AdvancedChest;
import us.lynuxcraft.deadsilenceiv.advancedchests.chest.title.ChestTitle;
import us.lynuxcraft.deadsilenceiv.advancedchests.chest.title.compatibility.CMITitle;
import us.lynuxcraft.deadsilenceiv.advancedchests.chest.title.compatibility.DCTitle;
import us.lynuxcraft.deadsilenceiv.advancedchests.chest.title.compatibility.HDTitle;

import java.util.ArrayList;
import java.util.List;

public enum HologramProvider{
    HOLOGRAPHIC_DISPLAYS("HolographicDisplays"),
    DECENT_HOLOGRAMS("DecentHolograms"),
    CMI("CMI");

    /**
     * A list that contains all the cached providers during the execution of the method
     * {@link #getAvailableProviders()}
     */
    private static List<HologramProvider> providers;

    private String pluginName;
    HologramProvider(String pluginName){
        this.pluginName = pluginName;
    }

    /**
     * Get a chest title.
     *
     * @param chest the chest instance
     * @param content the content of the hologram
     * @return the ChestTitle instance.
     */
    public ChestTitle getTitle(AdvancedChest chest,List<String> content) {
        if (this == HologramProvider.HOLOGRAPHIC_DISPLAYS) {
            return new HDTitle(chest, content);
        } else if (this == HologramProvider.DECENT_HOLOGRAMS) {
            return new DCTitle(chest,content);
        } if (this == HologramProvider.CMI) {
            return new CMITitle(chest, content);
        } else return null;
    }

    /**
     * Gets the availability of the plugin.
     *
     * @return true if the plugin is available, false otherwise.
     */
    public boolean isAvailable(){
        return Bukkit.getPluginManager().getPlugin(pluginName) != null;
    }

    /**
     * Gets all the available providers in the order of declared enum.
     *
     * @return a list that contains all the available providers.
     */
    public static List<HologramProvider> getAvailableProviders(){
        if(providers == null) {
            providers = new ArrayList<>();
            for (HologramProvider provider : HologramProvider.values()) {
                if(provider.isAvailable())providers.add(provider);
            }
        }
        return providers;
    }
}
