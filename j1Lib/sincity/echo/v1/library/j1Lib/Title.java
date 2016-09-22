package j1Lib.sincity.echo.v1.library.j1Lib;
import org.bukkit.Bukkit;
import org.bukkit.entity.Player;


public class Title {
	public static void set(Player p, String title, String subtitle) {
		String prefix = "title " + p.getName() + " ";
		Bukkit.dispatchCommand(Bukkit.getConsoleSender(), prefix + "times " + 99999 + " " + 99999 + " " + 0 + " ");
        Bukkit.dispatchCommand(Bukkit.getConsoleSender(), prefix + "subtitle {text:\"" + subtitle + "\"}");
        Bukkit.dispatchCommand(Bukkit.getConsoleSender(), prefix + "title {text:\"" + title + "\"}");
	}

}
