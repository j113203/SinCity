package j1Lib.sincity.echo.v1.library.j1Lib;

import org.bukkit.Bukkit;

public class Lib {
	public static Class<?> getNmsClass(String nmsClassName) throws ClassNotFoundException {
		return Class.forName("net.minecraft.server."
				+ Bukkit.getServer().getClass().getPackage().getName().replace(".", ",").split(",")[3] + "."
				+ nmsClassName);
	}
}
