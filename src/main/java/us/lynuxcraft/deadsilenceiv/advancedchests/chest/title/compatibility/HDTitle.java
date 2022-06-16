package us.lynuxcraft.deadsilenceiv.advancedchests.chest.title.compatibility;

import com.gmail.filoghost.holographicdisplays.api.Hologram;
import com.gmail.filoghost.holographicdisplays.api.HologramsAPI;
import us.lynuxcraft.deadsilenceiv.advancedchests.AdvancedChests;
import us.lynuxcraft.deadsilenceiv.advancedchests.AdvancedChestsAPI;
import us.lynuxcraft.deadsilenceiv.advancedchests.chest.AdvancedChest;
import us.lynuxcraft.deadsilenceiv.advancedchests.chest.title.ChestTitle;

import java.util.List;

public class HDTitle extends ChestTitle{
    private Hologram hologram;
    public HDTitle(AdvancedChest<?,?> chest,List<String> content) {
        super(chest,content);
    }
    @Override
    public void spawn(){
        if(content != null && !content.isEmpty()){
            hologram = HologramsAPI.createHologram(AdvancedChestsAPI.getInstance(),chest.getLocation().clone().add(0.5, (content.size()+4)*0.25,0.5));
            hologram.setAllowPlaceholders(true);
            List<String> lines = getReplacedPlaceholders();
            for(int i = 0 ;i <= lines.size()-1; i++)hologram.insertTextLine(i,lines.get(i));
        }
    }

    @Override
    public void update() {
        if(hologram != null && !hologram.isDeleted()){
            List<String> lines = getReplacedPlaceholders();
            int size = lines.size()-1;
            for(int i = 0 ;i <= size; i++) {
                hologram.removeLine(i);
                hologram.insertTextLine(i,lines.get(i));
            }
        }
    }

    @Override
    public void delete(){
        if(hologram != null)hologram.delete();
    }
}
