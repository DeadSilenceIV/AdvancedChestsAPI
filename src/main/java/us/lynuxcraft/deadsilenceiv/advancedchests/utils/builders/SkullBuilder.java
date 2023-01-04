package us.lynuxcraft.deadsilenceiv.advancedchests.utils.builders;

import com.cryptomorin.xseries.XMaterial;
import com.mojang.authlib.GameProfile;
import com.mojang.authlib.properties.Property;
import org.bukkit.inventory.ItemStack;
import org.bukkit.inventory.meta.SkullMeta;
import org.jetbrains.annotations.NotNull;

import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.util.Base64;
import java.util.HashMap;
import java.util.Map;
import java.util.UUID;

@SuppressWarnings("all")
public class SkullBuilder extends ItemBuilder{
    private final static Map<String, SkullMeta> CACHED_META = new HashMap<>();
    private static ItemStack cachedSkull;
    private static Method setProfileMethod;
    private static Field profileField;
    public SkullBuilder(@NotNull String address) {
        stack = getSkull().clone();
        if(!CACHED_META.containsKey(address)){
            SkullMeta skullMeta = (SkullMeta)stack.getItemMeta();
            if(!skullMeta.setOwner(address) && address.length() > 16){
                setOwnerByUrl(stack, address);
            }else{
                stack.setItemMeta(skullMeta);
            }
            CACHED_META.put(address,skullMeta);
        }else{
            stack.setItemMeta(CACHED_META.get(address).clone());
        }
    }

    private ItemStack setOwnerByUrl(ItemStack item,String url){
        SkullMeta headMeta = (SkullMeta) item.getItemMeta();
        GameProfile profile = new GameProfile(UUID.randomUUID(), null);
        byte[] data;
        if(url.length() <= 64) {
            data = Base64.getEncoder().encode(String.format("{textures:{SKIN:{url:\"http://textures.minecraft.net/texture/%s\"}}}", url).getBytes());
        }else data = url.getBytes();
        profile.getProperties().put("textures", new Property("textures", new String(data)));
        if(XMaterial.supports(14)) {
            try {
                if(setProfileMethod == null) {
                    setProfileMethod = headMeta.getClass().getDeclaredMethod("setProfile", GameProfile.class);
                    setProfileMethod.setAccessible(true);
                }
                setProfileMethod.invoke(headMeta,profile);
            } catch (Exception e) {
                e.printStackTrace();
            }
        }else{
            try {
                if(profileField == null) {
                    profileField = headMeta.getClass().getDeclaredField("profile");
                    profileField.setAccessible(true);
                }
                profileField.set(headMeta, profile);
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
        item.setItemMeta(headMeta);
        return item;
    }

    private static ItemStack getSkull(){
        if(cachedSkull == null){
            cachedSkull = XMaterial.SKELETON_SKULL.parseItem();
        }
        return cachedSkull;
    }

}
