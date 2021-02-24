package us.lynuxcraft.deadsilenceiv.advancedchests.chest;

import java.util.List;
import java.util.UUID;

public class ChestBuilder {

    public ChestBuilder(Integer size, String type, String serializedLocation) {}

    public ChestBuilder setUUID(UUID uuid){
        return this;
    }

    public ChestBuilder setPages(List<ChestPage> chestPages){
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
