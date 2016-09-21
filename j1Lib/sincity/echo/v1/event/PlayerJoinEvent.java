package j1Lib.sincity.echo.v1.event;

import org.bukkit.ChatColor;
import org.bukkit.GameMode;
import org.bukkit.Location;
import org.bukkit.entity.Player;

import j1Lib.sincity.echo.v1.library.l;

public class PlayerJoinEvent implements PlayerEvent{

	@Override
	public void handler(org.bukkit.event.player.PlayerEvent $, Player p) {
		org.bukkit.event.player.PlayerJoinEvent e = (org.bukkit.event.player.PlayerJoinEvent) $;
		e.setJoinMessage(null);
		p.setGameMode(GameMode.SPECTATOR);
		l.setTitle(p, ChatColor.GOLD+"<<轍迹之城>", "米養百態 ， 人安所命 ， 運道各異寤生 。");
		l.sendTabTitle(p, null, null);
		l.sendActionBar(p, "nonono");
		p.setPlayerListName("                                        <<轍迹之城>                                       ");
		p.teleport(new Location(p.getWorld(), 112.501, 94.99269 ,294.001,91.7f, 30.7f));
		
		//p.setResourcePack(arg0);
		
	}
}
