package us.lynuxcraft.deadsilenceiv.advancedchests.services.chest.sells;

public interface ChestSeller {

    SellService getService();

    /**
     * Sets a custom SellService.
     *
     * @param service the SellService instance.
     */
    void setService(SellService service);

}
