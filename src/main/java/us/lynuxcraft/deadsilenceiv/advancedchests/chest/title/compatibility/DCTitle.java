package us.lynuxcraft.deadsilenceiv.advancedchests.chest.title.compatibility;

import eu.decentsoftware.holograms.api.DHAPI;
import eu.decentsoftware.holograms.api.holograms.Hologram;
import eu.decentsoftware.holograms.api.holograms.HologramPage;
import us.lynuxcraft.deadsilenceiv.advancedchests.chest.AdvancedChest;
import us.lynuxcraft.deadsilenceiv.advancedchests.chest.title.ChestTitle;

import java.util.List;

public class DCTitle extends ChestTitle {
    private Hologram hologram;
    public DCTitle(AdvancedChest<?,?> chest, List<String> content) {
        super(chest, content);
    }

    @Override
    public void spawn() {
        if(content != null && !content.isEmpty()){
            hologram = DHAPI.createHologram("AdvancedChest#"+chest.getUniqueId().toString(),chest.getLocation().clone().add(0.5, 0.25*(content.size()+4), 0.5),getReplacedPlaceholders());
        }
    }


    @Override
    public void update() {
        if(hologram != null){
            HologramPage page = hologram.getPage(0);
            List<String> lines = getReplacedPlaceholders();
            int size = lines.size()-1;
            for(int i = 0 ;i <= size; i++) {
                page.setLine(i,lines.get(i));
            }
            hologram.updateAll();
        }
    }

    @Override
    public void delete() {
        if (hologram != null)hologram.delete();
    }
}
