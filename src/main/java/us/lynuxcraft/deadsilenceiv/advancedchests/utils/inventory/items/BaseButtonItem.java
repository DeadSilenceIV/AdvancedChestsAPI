package us.lynuxcraft.deadsilenceiv.advancedchests.utils.inventory.items;

import lombok.Getter;
import org.bukkit.ChatColor;
import org.bukkit.inventory.ItemStack;
import org.bukkit.inventory.meta.ItemMeta;
import us.lynuxcraft.deadsilenceiv.advancedchests.utils.Placeholder;
import us.lynuxcraft.deadsilenceiv.advancedchests.utils.inventory.Button;

import java.util.*;

public class BaseButtonItem<T extends Button<? extends ButtonItem>> implements ButtonItem{
    @Getter protected final T button;
    @Getter protected final String name;
    @Getter protected final ItemStack itemStack;
    @Getter protected final Set<Placeholder> placeholders;
    protected final ItemMeta originalMeta;
    private Optional<String> cachedOriginalName;
    private List<String> cachedOriginalLore;
    protected boolean initiallyRefreshed;
    public BaseButtonItem(T button, String name, ItemStack itemStack){
        this.button = button;
        this.name = name;
        this.itemStack = itemStack;
        this.placeholders = new HashSet<>();
        this.originalMeta = itemStack.getItemMeta().clone();
        this.initiallyRefreshed = false;
    }

    @Override
    public void addPlaceholder(Placeholder placeholder) {
        placeholders.add(placeholder);
    }

    protected void updateName(ItemMeta meta){
        String originalName = getOriginalMetaName();
        if(originalName == null)return;
        String name = ""+originalName;
        if(name.isEmpty())return;
        for (Placeholder holder : placeholders) {
            String placeholder = holder.getSequence();
            if(name.contains(placeholder)){
                name = name.replaceAll(placeholder, ChatColor.translateAlternateColorCodes('&',holder.getReplacement()));
            }
        }
        meta.setDisplayName(name);
    }

    protected void updateLore(ItemMeta meta){
        List<String> originalLore = getOriginalMetaLore();
        if(originalLore == null)return;
        List<String> lore = new ArrayList<>(originalLore);
        if(lore.isEmpty())return;
        for (int i = 0; i < lore.size(); i++) {
            String line = lore.get(i);
            for (Placeholder holder : placeholders) {
                String placeholder = holder.getSequence();
                if (line.contains(placeholder)) {
                    line = line.replaceAll(placeholder, ChatColor.translateAlternateColorCodes('&',holder.getReplacement()));
                }
            }
            lore.set(i, line);
        }
        meta.setLore(lore);
    }

    protected String getOriginalMetaName(){
        if(cachedOriginalName == null){
            cachedOriginalName = Optional.ofNullable(originalMeta.getDisplayName());
        }
        return cachedOriginalName.orElse(null);
    }

    protected List<String> getOriginalMetaLore(){
        if(cachedOriginalLore == null){
            cachedOriginalLore = originalMeta.getLore();
        }
        return cachedOriginalLore;
    }
}
