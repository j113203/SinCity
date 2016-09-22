package j1Lib.sincity.echo.v1.library.j1Lib;

import org.bukkit.entity.Player;

import com.comphenix.protocol.PacketType;
import com.comphenix.protocol.events.PacketContainer;
import com.comphenix.protocol.wrappers.WrappedChatComponent;

import j1Lib.sincity.echo.v1.launcher;

public class Tab {
	public static void set(Player p, String header, String footer) {
		PacketContainer $ = new PacketContainer(PacketType.Play.Server.PLAYER_LIST_HEADER_FOOTER);
		$.getChatComponents().write(0, WrappedChatComponent.fromText(header));
		$.getChatComponents().write(1, WrappedChatComponent.fromText(footer));
		try {
			launcher.protocolManager.sendServerPacket(p, $, true);
		} catch (Exception ex) {
		}
	}
}
