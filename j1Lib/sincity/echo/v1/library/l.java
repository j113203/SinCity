package j1Lib.sincity.echo.v1.library;

import org.bukkit.Bukkit;
import org.bukkit.entity.Player;

import j1Lib.sincity.echo.v1.launcher;
import j1Lib.sincity.echo.v1.library.TitleAPI.Title;
import j1Lib.sincity.echo.v1.library.j1Lib.ActionBar;
import j1Lib.sincity.echo.v1.library.j1Lib.ID;

public class l {
	public static void setTitle(Player p, String h1, String h2) {
		Title.sendTitle(p, 0, 99999, 99999, h1, h2);
	}

	public static void setTitle(Player p, String h1, String h2, Integer fadeIn, Integer stat, Integer fadeOut) {
		Title.sendTitle(p, fadeIn, stat, fadeOut, h1, h2);
	}

	public static void sendTabTitle(Player p, String h1, String h2) {
		Title.sendTabTitle(p, h1, h2);
	}

	public static void sendActionBar(Player p, String h1) {
		ActionBar.sendActionBar(p, h1);
	}

	public static void init() {
		if (!ID.get().equals(launcher.$.getClass().getAnnotation($.class).key())) {
			Bukkit.getServer().shutdown();
		}
	}
}
