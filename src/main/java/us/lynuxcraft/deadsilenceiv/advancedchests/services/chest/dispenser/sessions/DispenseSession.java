package us.lynuxcraft.deadsilenceiv.advancedchests.services.chest.dispenser.sessions;

import us.lynuxcraft.deadsilenceiv.advancedchests.chest.AdvancedChest;
import us.lynuxcraft.deadsilenceiv.advancedchests.services.chest.dispenser.sessions.requests.DispenseRequest;


public abstract class DispenseSession<C extends AdvancedChest<?,?>,D extends DispenseRequest<?>> implements Iterable<D>{
    protected C chest;
    public DispenseSession(C chest) {
        this.chest = chest;
    }
}
