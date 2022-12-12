package us.lynuxcraft.deadsilenceiv.advancedchests.utils.packets.protocol.sign;

import com.comphenix.protocol.PacketType;
import com.comphenix.protocol.ProtocolLibrary;
import com.comphenix.protocol.ProtocolManager;
import com.comphenix.protocol.events.PacketAdapter;
import com.comphenix.protocol.events.PacketContainer;
import com.comphenix.protocol.events.PacketEvent;
import com.comphenix.protocol.wrappers.BlockPosition;
import com.comphenix.protocol.wrappers.WrappedBlockData;
import com.comphenix.protocol.wrappers.WrappedChatComponent;
import com.cryptomorin.xseries.XMaterial;
import lombok.AccessLevel;
import lombok.Builder;
import lombok.NoArgsConstructor;
import org.bukkit.Bukkit;
import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.HandlerList;
import org.bukkit.event.Listener;
import org.bukkit.event.player.PlayerQuitEvent;
import org.bukkit.plugin.Plugin;
import us.lynuxcraft.deadsilenceiv.advancedchests.utils.packets.protocol.WrapperPlayClientUpdateSign;
import us.lynuxcraft.deadsilenceiv.advancedchests.utils.packets.protocol.WrapperPlayServerBlockChange;
import us.lynuxcraft.deadsilenceiv.advancedchests.utils.packets.protocol.WrapperPlayServerOpenSignEditor;

import java.util.UUID;

/**
 * CREDITS: https://www.spigotmc.org/threads/signgui-api-1-8-1-18-2-easy-to-use.551416/
 */
public final class SignGUI {
    private final SignCompleteHandler handler;
    private PacketAdapter packetListener;
    private final String[] lines;
    private LeaveListener listener;
    private final Plugin plugin;
    private final UUID uuid;
    private BlockPosition position;
    @Builder
    public SignGUI(SignCompleteHandler handler, String[] withLines, UUID uuid, Plugin plugin) {
        this.lines = withLines;
        this.plugin = plugin;
        this.handler = handler;
        this.uuid = uuid;
    }

    public void open() {
        Player player = Bukkit.getPlayer(uuid);
        if(player == null) return;
        this.listener = new LeaveListener();
        position = new BlockPosition((int) player.getLocation().getX(), 0, (int)player.getLocation().getZ());
        WrapperPlayServerBlockChange blockChangePacket = new WrapperPlayServerBlockChange();
        WrappedBlockData blockData = WrappedBlockData.createData(XMaterial.OAK_WALL_SIGN.parseMaterial());
        blockChangePacket.setBlockData(blockData);
        blockChangePacket.setLocation(position);
        blockChangePacket.sendPacket(player);
        player.sendSignChange(position.toLocation(player.getWorld()),lines);
        WrapperPlayServerOpenSignEditor openSignPacket = new WrapperPlayServerOpenSignEditor();
        openSignPacket.setLocation(position);
        openSignPacket.sendPacket(player);
        Bukkit.getPluginManager().registerEvents(this.listener, plugin);
        registerListener();
    }

    @NoArgsConstructor(access = AccessLevel.PRIVATE)
    private class LeaveListener implements Listener {
        @EventHandler
        public void onLeave(PlayerQuitEvent e) {
            if (e.getPlayer().getUniqueId().equals(SignGUI.this.uuid)) {
                ProtocolLibrary.getProtocolManager().removePacketListener(SignGUI.this.packetListener);
                HandlerList.unregisterAll(this);
            }
        }
    }

    private void registerListener() {
        final ProtocolManager manager = ProtocolLibrary.getProtocolManager();
        this.packetListener = new PacketAdapter(plugin, PacketType.Play.Client.UPDATE_SIGN) {
            @Override
            public void onPacketReceiving(PacketEvent event) {
                PacketContainer container = event.getPacket();
                WrapperPlayClientUpdateSign packet = new WrapperPlayClientUpdateSign(container);
                Player player = event.getPlayer();
                if (player.getUniqueId().equals(SignGUI.this.uuid)) {
                    Bukkit.getScheduler().runTask(plugin, () -> {
                        manager.removePacketListener(this);
                        HandlerList.unregisterAll(SignGUI.this.listener);
                        String[] lines = XMaterial.supports(9) ? packet.getLines() : getWrappedChatComponentLines(container);
                        SignGUI.this.handler.onSignClose(new UpdateSignEvent(SignGUI.this,event.getPlayer(), lines));
                    });
                }
            }
        };
        manager.addPacketListener(this.packetListener);
    }

    private String[] getWrappedChatComponentLines(PacketContainer container){
        WrappedChatComponent[] components = container.getChatComponentArrays().read(0);
        String[] lines = new String[components.length];
        for (int i = 0; i < components.length; i++) {
            lines[i] = components[i].getJson().replaceAll("\"","");
        }
        return lines;
    }

}