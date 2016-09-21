package j1Lib.sincity.echo.v1.library.j1Lib;

import java.lang.reflect.InvocationTargetException;

import org.bukkit.ChatColor;
import org.bukkit.entity.Player;

public class ActionBar {
	
	public static void sendActionBar(Player player, String message) {

		Object icbc;
		try {
			icbc = Lib.getNmsClass("ChatComponentText").getConstructor(new Class[] { String.class })
					.newInstance(new Object[] { ChatColor.translateAlternateColorCodes('&', message) });
			Object ppoc = Lib.getNmsClass("PacketPlayOutChat")
					.getConstructor(new Class[] { Lib.getNmsClass("IChatBaseComponent"), Byte.TYPE })
					.newInstance(new Object[] { icbc, (byte) 2 });
			Object nmsp = player.getClass().getMethod("getHandle", new Class[0]).invoke(player, new Object[0]);

			Object pcon = nmsp.getClass().getField("playerConnection").get(nmsp);

			pcon.getClass().getMethod("sendPacket", new Class[] { Lib.getNmsClass("Packet") }).invoke(pcon,
					new Object[] { ppoc });

		} catch (IllegalAccessException | IllegalArgumentException | InvocationTargetException | NoSuchMethodException
				| SecurityException | ClassNotFoundException | InstantiationException | NoSuchFieldException e) {
		}

	}
}
