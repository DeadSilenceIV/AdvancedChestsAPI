package us.lynuxcraft.deadsilenceiv.advancedchests.utils.inventory.items;

import lombok.Getter;
import org.bukkit.ChatColor;
import org.bukkit.inventory.ItemStack;
import org.bukkit.inventory.meta.ItemMeta;
import us.lynuxcraft.deadsilenceiv.advancedchests.utils.ItemPlaceHolder;
import us.lynuxcraft.deadsilenceiv.advancedchests.utils.inventory.Button;

import java.util.*;

public class BaseButtonItem<T extends Button<? extends ButtonItem>> implements ButtonItem{
    @Getter protected final T button;
    @Getter protected final String name;
    @Getter protected final ItemStack itemStack;
    @Getter protected final Set<ItemPlaceHolder> placeholders;
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
    public void addPlaceholder(ItemPlaceHolder placeholder) {
        placeholders.add(placeholder);
    }

    protected void updateName(ItemMeta meta){
        String originalName = getOriginalMetaName();
        if(originalName == null)return;
        String name = ""+originalName;
        if(name.isEmpty())return;
        for (ItemPlaceHolder holder : placeholders) {
            String placeholder = holder.getSequence();
            String replacement = holder.getReplacement();
            if(holder.isApplicableForName() && replacement != null && name.contains(placeholder)){
                name = name.replaceAll(placeholder, ChatColor.translateAlternateColorCodes('&',replacement));
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
            for (ItemPlaceHolder holder : placeholders) {
                String placeholder = holder.getSequence();
                String replacement = holder.getReplacement();
                if (holder.isApplicableForLore() && line.contains(placeholder)) {
                    if(replacement == null){
                        lore.remove(i);
                        i--;
                        continue;
                    }
                    String[] splitReplacement = replacement.split("\n");
                    for (int j = 0; j < splitReplacement.length; j++) {
                        if(j != 0){
                            i++;
                            lore.add(i,ChatColor.translateAlternateColorCodes('&',splitReplacement[j]));
                        }else{
                            lore.set(i,ChatColor.translateAlternateColorCodes('&',line.replaceAll(placeholder,splitReplacement[j])));
                        }
                    }
                }
            }
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
