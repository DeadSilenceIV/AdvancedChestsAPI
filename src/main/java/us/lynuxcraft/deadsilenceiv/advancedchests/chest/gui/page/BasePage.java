package us.lynuxcraft.deadsilenceiv.advancedchests.chest.gui.page;

import us.lynuxcraft.deadsilenceiv.advancedchests.chest.AdvancedChest;
import us.lynuxcraft.deadsilenceiv.advancedchests.chest.BaseChest;

public abstract class BasePage<I> implements ChestPage<I> {
    protected int id;
    protected AdvancedChest<?,?> chest;
    protected I[] preparedContent;
    public BasePage(int id, I[] content, BaseChest<?,?> chest){}

    @Override
    public int getId() {
        return id;
    }

    public AdvancedChest<?, ?> getChest() {
        return chest;
    }

    @Override
    public void setChest(AdvancedChest<?, ?> chest) {
        this.chest = chest;
    }

    public I[] getPreparedContent() {
        return preparedContent;
    }
}
