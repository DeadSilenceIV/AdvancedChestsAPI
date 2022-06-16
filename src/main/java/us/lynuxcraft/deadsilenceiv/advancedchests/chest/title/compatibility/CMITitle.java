package us.lynuxcraft.deadsilenceiv.advancedchests.chest.title.compatibility;

import com.Zrips.CMI.CMI;
import com.Zrips.CMI.Modules.Holograms.CMIHologram;
import org.bukkit.Bukkit;
import us.lynuxcraft.deadsilenceiv.advancedchests.AdvancedChests;
import us.lynuxcraft.deadsilenceiv.advancedchests.AdvancedChestsAPI;
import us.lynuxcraft.deadsilenceiv.advancedchests.chest.AdvancedChest;
import us.lynuxcraft.deadsilenceiv.advancedchests.chest.title.ChestTitle;

import java.util.List;

public class CMITitle extends ChestTitle {
    private CMIHologram hologram;
    public CMITitle(AdvancedChest<?,?> chest, List<String> content) {
        super(chest, content);
    }

    @Override
    public void spawn() {
        if(content != null && !content.isEmpty()){
            hologram = new CMIHologram("", chest.getLocation().clone().add(0.5, 0.25*(content.size()+4), 0.5));
            hologram.setLines(getReplacedPlaceholders());
            if(CMI.getInstance() != null && CMI.getInstance().getHologramManager() != null) {
                addHologram();
            }else Bukkit.getServer().getScheduler().runTaskLater(AdvancedChestsAPI.getInstance(), this::addHologram,1L);
        }
    }

    /**
     * Registers the hologram in CMI.
     */
    private void addHologram(){
        CMI.getInstance().getHologramManager().addHologram(hologram);
        hologram.update();
    }

    @Override
    public void update() {
        if(hologram != null){
            hologram.setLines(getReplacedPlaceholders());
            hologram.update();
            hologram.refresh();
        }
    }

    @Override
    public void delete() {
        if (hologram != null)CMI.getInstance().getHologramManager().removeHolo(hologram);
    }
}
