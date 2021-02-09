package us.lynuxcraft.deadsilenceiv.advancedchests.chest;

import java.util.LinkedList;
import java.util.UUID;

public class ChestBuilder {

    public ChestBuilder(Integer size, String type, String serializedLocation) {}

    public ChestBuilder setUUID(UUID uuid){
        return this;
    }

    public ChestBuilder setPages(LinkedList<ChestPage> chestPages){
        return this;
    }

    public ChestBuilder setMoney(Double money){
        return this;
    }

    public ChestBuilder setAutomaticSellsStatus(boolean status){
        return this;
    }

    public AdvancedChest build(){
        return null;
    }
}
