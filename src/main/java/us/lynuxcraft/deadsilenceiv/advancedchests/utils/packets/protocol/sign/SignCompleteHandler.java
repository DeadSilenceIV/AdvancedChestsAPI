package us.lynuxcraft.deadsilenceiv.advancedchests.utils.packets.protocol.sign;

@FunctionalInterface
public interface SignCompleteHandler {

    void onSignClose(UpdateSignEvent event);

}