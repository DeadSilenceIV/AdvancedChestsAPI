package us.lynuxcraft.deadsilenceiv.advancedchests.chest;

import lombok.Getter;
import org.bukkit.configuration.ConfigurationSection;

import java.util.ArrayList;
import java.util.List;

public enum ChestAttribute {
    SIZE("inventory.size",null,Integer.class),
    INVENTORY_NAME("inventory.name",null,String.class),
    ICON(null,null,null),
    LOCATION(null,null,null),
    PAGES(null,null,null),
    CONFIG_TYPE(null,null,null),
    WHO_PLACED(null,null,null),
    DIRECTION(null,null,null),
    CHEST_TYPE("chest-type","NORMAL",null),
    PREVIOUS_PAGE_SLOT("previous-page-slot",4,Integer.class),
    NEXT_PAGE_SLOT("next-page-slot",6,Integer.class),
    UPGRADE("upgrades.next_upgrade",null,String.class),
    UPGRADE_PRICE("upgrades.price",null,Double.class),
    UPGRADE_AVAILABILITY("upgrades.enable",null,Boolean.class),
    UPGRADE_SLOT("upgrades.slot",5,Integer.class),
    HOLOGRAM_TITLE_AVAILABILITY("hologram.enable",false,Boolean.class),
    HOLOGRAM_TITLE_CONTENT("hologram.title",new ArrayList<>(),List.class),
    SORTERS_AVAILABILITY("sorters.enable",true,Boolean.class),
    SORTERS_PRICE("sorters.price",1000.0,Double.class),
    SORTERS_SLOT("sorters.slot",9,Integer.class),
    SELLS_AVAILABILITY("sells.enable",false,Boolean.class),
    SELLS_MULTIPLIER("sells.multiplier",1.0,Double.class),
    SELLS_SLOT("sells.slot",1,Integer.class),
    AUTOSELLS_AVAILABILITY("autosells.enable",false,Boolean.class),
    AUTOSELLS_FREQUENCY("autosells.frequency",2400,Integer.class),
    AUTOSELLS_MULTIPLIER("autosells.multiplier",1.0,Double.class),
    AUTOSELLS_STATUS(null,null,null),
    AUTOSELLS_SESSION_OWNER(null,null,null),
    AUTOSELLS_TAX("autosells.tax",0.0,Double.class),
    AUTOSELLS_SLOT("autosells.slot",2,Integer.class),
    MONEY(null,null,null),
    HOPPERS_ALLOWED("allow-hoppers-use",true,Boolean.class),
    SHOP_PRICE("shop-price",-1.0,Double.class),
    CRAFTING_AVAILABILITY("crafting.enable",false,Boolean.class),
    CRAFTING_RECIPE(null,null,null),
    SMELTER_AVAILABILITY("smelter.enable",false,Boolean.class),
    SMELTER_PRICE("smelter.price",0.0,Double.class),
    SMELTER_SLOT("smelter.slot",8,Integer.class),
    COMPRESSOR_AVAILABILITY("compressor.enable",false,Boolean.class),
    COMPRESSOR_PRICE("compressor.price",0.0,Double.class),
    COMPRESSOR_SLOT("compressor.slot",7,Integer.class),
    DEPOSIT_AVAILABILITY("deposit.enable",false,Boolean.class),
    CONTAINER_TYPE("container.type","CHEST",null),
    SEARCH_AVAILABILITY("search.enable",false,Boolean.class),
    SEARCH_SLOT("search.slot",3,Integer.class);
    @Getter private String configPath;
    @Getter private Object defaultConfigValue;
    @Getter private Class configValueClass;
    ChestAttribute(String configPath,Object defaultConfigValue,Class configValueClasses){
        this.configPath = configPath;
        this.defaultConfigValue = defaultConfigValue;
        this.configValueClass = configValueClasses;
    }

    /**
     * Gets the config value in a specified ConfigurationSection.
     *
     * @param section the section where the value will be obtained
     * @return the obtained object.
     */
    public Object getConfigValue(ConfigurationSection section){
        boolean hasDefaultValue = defaultConfigValue != null;
        if(configValueClass == String.class){
            return (!hasDefaultValue) ? section.getString(configPath) : section.getString(configPath,(String)defaultConfigValue);
        }
        if(configValueClass == Boolean.class){
            return (!hasDefaultValue) ? section.getBoolean(configPath) : section.getBoolean(configPath,(boolean)defaultConfigValue);
        }
        if(configValueClass == Integer.class){
            return (!hasDefaultValue) ? section.getInt(configPath) : section.getInt(configPath,(int)defaultConfigValue);
        }
        if(configValueClass == Double.class){
            return (!hasDefaultValue) ? section.getDouble(configPath) : section.getDouble(configPath,(double)defaultConfigValue);
        }
        if(configValueClass == List.class){
            return section.getStringList(configPath);
        }
        return null;
    }
}
