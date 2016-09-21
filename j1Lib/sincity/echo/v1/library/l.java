package j1Lib.sincity.echo.v1.library;

import org.bukkit.entity.Player;

import j1Lib.sincity.echo.v1.library.TitleAPI.Title;
import j1Lib.sincity.echo.v1.library.j1Lib.ActionBar;
import j1Lib.sincity.echo.v1.library.j1Lib.ID;

public class l {
	public static void setTitle(Player p, String h1, String h2) {
		Title.sendTitle(p, 0, 9999, 9999, h1, h2);
	}
	public static void sendTabTitle(Player p,String h1, String h2){
		Title.sendTabTitle(p, h1, h2);
	}
	public static void sendActionBar(Player p,String h1){
		ActionBar.sendActionBar(p, h1);
	}
	public static String getID(){
		return ID.get();
	}
}
