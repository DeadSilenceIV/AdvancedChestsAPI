package us.lynuxcraft.deadsilenceiv.advancedchests.utils.inventory;

import us.lynuxcraft.deadsilenceiv.advancedchests.utils.inventory.items.ButtonItem;

import java.util.Set;

public interface Button<T extends ButtonItem> {

    String getName();

    Set<T> getItems();

    default T getItemByName(String itemName){
        for (T item : getItems()) {
            if(item.getName().equals(itemName))return item;
        }
        return null;
    }

    default void addItem(T item){
        getItems().add(item);
    }

    void setCurrentItem(T item);

    T getCurrentItem();

}
