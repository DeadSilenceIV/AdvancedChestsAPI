package us.lynuxcraft.deadsilenceiv.advancedchests.utils.builders;

import com.cryptomorin.xseries.XMaterial;
import com.google.common.cache.CacheBuilder;
import com.google.common.cache.CacheLoader;
import com.google.common.cache.LoadingCache;
import com.mojang.authlib.GameProfile;
import com.mojang.authlib.properties.Property;
import lombok.Getter;
import org.bukkit.inventory.ItemStack;
import org.bukkit.inventory.meta.SkullMeta;

import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.util.Base64;
import java.util.Objects;
import java.util.UUID;
import java.util.concurrent.TimeUnit;

public class SkullBuilder extends ItemBuilder{
    private final static LoadingCache<KeyAndData<String,ItemStack>, ItemStack> CACHED_SKULLS = CacheBuilder.newBuilder().expireAfterAccess(1, TimeUnit.MINUTES).build(new CacheLoader<KeyAndData<String,ItemStack>, ItemStack>() {
        @Override
        public ItemStack load(KeyAndData<String,ItemStack> object){
            String owner = object.getKey();
            ItemStack item = object.getData();
            SkullMeta skullMeta = (SkullMeta)item.getItemMeta();
            if(!skullMeta.setOwner(owner) && owner.length() > 16){
                return setOwnerByUrl(item,owner);
            }
            item.setItemMeta(skullMeta);
            return item;
        }
    });
    public SkullBuilder() {
        super(XMaterial.PLAYER_HEAD.parseMaterial());
        setDamage((short)3);
    }

    public SkullBuilder setOwner(String owner){
        stack = CACHED_SKULLS.getUnchecked(new KeyAndData<>(owner,stack)).clone();
        return this;
    }

    private static ItemStack setOwnerByUrl(ItemStack item,String url){
        SkullMeta headMeta = (SkullMeta) item.getItemMeta();
        GameProfile profile = new GameProfile(UUID.randomUUID(), null);
        byte[] data;
        if(url.length() <= 64) {
            data = Base64.getEncoder().encode(String.format("{textures:{SKIN:{url:\"http://textures.minecraft.net/texture/%s\"}}}", url).getBytes());
        }else data = url.getBytes();
        profile.getProperties().put("textures", new Property("textures", new String(data)));
        if(XMaterial.supports(14)) {
            Method setProfile;
            try {
                setProfile = headMeta.getClass().getDeclaredMethod("setProfile", GameProfile.class);
                setProfile.setAccessible(true);
                setProfile.invoke(headMeta, profile);
            } catch (Exception e) {
                e.printStackTrace();
            }
        }else{
            Field profileField;
            try {
                profileField = headMeta.getClass().getDeclaredField("profile");
                profileField.setAccessible(true);
                profileField.set(headMeta, profile);
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
        item.setItemMeta(headMeta);
        return item;
    }


    private class KeyAndData<K,D>{
        @Getter private K key;
        @Getter private D data;
        public KeyAndData(K key,D data){
            this.key = key;
            this.data = data;
        }

        @Override
        public boolean equals(Object o) {
            if (this == o) return true;
            if (o == null || getClass() != o.getClass()) return false;
            KeyAndData<?, ?> that = (KeyAndData<?, ?>) o;
            return key.equals(that.key);
        }

        @Override
        public int hashCode() {
            return Objects.hash(key);
        }

    }
}
