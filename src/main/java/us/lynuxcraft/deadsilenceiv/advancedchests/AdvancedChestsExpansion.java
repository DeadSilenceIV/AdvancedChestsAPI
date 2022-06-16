package us.lynuxcraft.deadsilenceiv.advancedchests;

import org.bukkit.plugin.java.JavaPlugin;
import us.lynuxcraft.deadsilenceiv.advancedchests.chest.ChestType;

public class AdvancedChestsExpansion extends JavaPlugin{
    private ChestType type;
    public AdvancedChestsExpansion(ChestType type) {
        this.type = type;
    }

    @Override
    public void onEnable() {
        AdvancedChestsAPI.getInstance().registerType(type);
    }

    @Override
    public void onDisable() {
        AdvancedChestsAPI.getInstance().getType(type.getName());
    }

}
