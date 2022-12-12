package us.lynuxcraft.deadsilenceiv.advancedchests.utils.packets.protocol.sign;

import lombok.AllArgsConstructor;
import lombok.Getter;
import org.bukkit.entity.Player;


@Getter
@AllArgsConstructor
public final class UpdateSignEvent{
    private final SignGUI gui;
    private final Player player;
    private final String[] lines;
}