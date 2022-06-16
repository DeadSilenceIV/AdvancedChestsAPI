package us.lynuxcraft.deadsilenceiv.advancedchests.chest.title;

import lombok.Getter;
import lombok.Setter;
import org.bukkit.ChatColor;
import us.lynuxcraft.deadsilenceiv.advancedchests.chest.AdvancedChest;

import java.util.ArrayList;
import java.util.List;

public abstract class ChestTitle {
    @Getter @Setter public List<String> content;
    @Getter public boolean usingRefreshablePlaceholders;
    protected AdvancedChest<?,?> chest;
    private int ticks;
    public ChestTitle(AdvancedChest<?,?> chest, List<String> content) {
        this.chest = chest;
        this.ticks = 0;
        this.usingRefreshablePlaceholders = false;
        this.content = content;
    }

    public abstract void spawn();

    public abstract void delete();

    public abstract void update();

    public void tickByHopper(){
        ticks++;
        if(ticks == 32){
            ticks = 0;
            update();
        }
    }

    /**
     * Replaces the placeholders from the hologram content.
     *
     * @return a list the replaced placeholders in the content.
     */
    protected List<String> getReplacedPlaceholders(){
        List<String> replacedHolders = new ArrayList<>();
        if(content != null && !content.isEmpty()) {
            for (int i = 0; i <= content.size() - 1; i++) {
                String line = ChatColor.translateAlternateColorCodes('&', content.get(i));
                if (line.contains("%size%")) {
                    line = line.replaceAll("%size%", ""+chest.getSize());
                }
                if (line.contains("%slots_used%")) {
                    usingRefreshablePlaceholders = true;
                    line = line.replaceAll("%slots_used%", ""+chest.getSlotsUsed());
                }
                if (line.contains("%slots_left%")) {
                    usingRefreshablePlaceholders = true;
                    line = line.replaceAll("%slots_left%", ""+chest.getSlotsLeft());
                }
                replacedHolders.add(line);
            }
        }
        return replacedHolders;
    }
}
