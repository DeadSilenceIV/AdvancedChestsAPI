package us.lynuxcraft.deadsilenceiv.advancedchests.chest.gui;

import us.lynuxcraft.deadsilenceiv.advancedchests.utils.inventory.ShareableButton;
import us.lynuxcraft.deadsilenceiv.advancedchests.utils.inventory.items.ShareableButtonItem;

public abstract class ShareableChestButton extends ChestButton<ShareableButtonItem> implements ShareableButton {
    protected String chestType;
    public ShareableChestButton(String chestType,String name) {
        super(name);
        this.chestType = chestType;
    }

    protected abstract void build();

    public abstract void loadActions(ChestInventory inventory);
}
