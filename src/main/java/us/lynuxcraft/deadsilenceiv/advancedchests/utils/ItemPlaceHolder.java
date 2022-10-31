package us.lynuxcraft.deadsilenceiv.advancedchests.utils;

import lombok.Getter;

public abstract class ItemPlaceHolder extends BasePlaceholder{
    @Getter protected boolean applicableForName;
    @Getter protected boolean applicableForLore;
    public ItemPlaceHolder(String sequence,boolean applicableForName,boolean applicableForLore) {
        super(sequence);
        this.applicableForName = applicableForName;
        this.applicableForLore = applicableForLore;
    }

    public ItemPlaceHolder(String sequence) {
        super(sequence);
        this.applicableForName = true;
        this.applicableForLore = true;
    }
}
