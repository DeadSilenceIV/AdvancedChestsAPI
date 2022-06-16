package us.lynuxcraft.deadsilenceiv.advancedchests.utils.inventory;

import com.cryptomorin.xseries.XMaterial;
import lombok.Getter;
import lombok.Setter;
import org.bukkit.Material;
import org.bukkit.inventory.ItemStack;
import us.lynuxcraft.deadsilenceiv.advancedchests.utils.builders.ItemBuilder;
import us.lynuxcraft.deadsilenceiv.advancedchests.utils.builders.SkullBuilder;
import us.lynuxcraft.deadsilenceiv.advancedchests.utils.inventory.items.ButtonItem;

import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class BaseButton<T extends ButtonItem> implements Button<T> {
    @Getter protected final String name;
    @Getter protected final Set<T> items;
    @Getter @Setter protected T currentItem;
    public BaseButton(String name) {
        this.name = name;
        this.items = new HashSet<>();
    }

    protected ItemStack getItemStack(Material material, String name, String headName , List<String> lore, Integer customModelData){
        ItemStack item;
        if(material == XMaterial.PLAYER_HEAD.parseMaterial()){
            item = new SkullBuilder()
                    .setOwner(headName)
                    .setName(name)
                    .setLore(lore)
                    .setCustomModelData(customModelData)
                    .build();
        }else {
            item = new ItemBuilder(material)
                    .setName(name)
                    .setLore(lore)
                    .setCustomModelData(customModelData)
                    .build();
        }
        return item;
    }
}
