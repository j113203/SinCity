package j1Lib.sincity.echo.v1.library.j1Lib;

import java.net.InetAddress;
import java.net.NetworkInterface;
import java.net.SocketException;
import java.net.UnknownHostException;

import org.bukkit.Bukkit;
import org.bukkit.World;


public class ID {
	public static String get() {
		try {
			NetworkInterface network = NetworkInterface.getByInetAddress(InetAddress.getLocalHost());
			byte[] mac = network.getHardwareAddress();
			String id = "";
			for (int i = 0; i < mac.length; i++) {
				id += String.format("%02X",mac[i]);
			}
			for (World w : Bukkit.getWorlds()) {
				id += w.getName().charAt(0)+Long.toHexString(w.getSeed() * w.getSeaLevel());			
			}
			return id.toUpperCase();
		} catch (SocketException | UnknownHostException e) {
			return "";
		}
	}
}
