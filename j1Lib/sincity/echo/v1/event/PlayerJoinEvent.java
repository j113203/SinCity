package j1Lib.sincity.echo.v1.event;

import org.bukkit.Bukkit;

import org.bukkit.GameMode;
import org.bukkit.Location;
import org.bukkit.entity.Player;



import j1Lib.sincity.echo.v1.launcher;
import j1Lib.sincity.echo.v1.cache.c;

import j1Lib.sincity.echo.v1.library.j1Lib.Tab;
import j1Lib.sincity.echo.v1.library.j1Lib.Title;


public class PlayerJoinEvent implements PlayerEvent {

	@Override
	public void handler(org.bukkit.event.player.PlayerEvent $, Player p) {
		org.bukkit.event.player.PlayerJoinEvent e = (org.bukkit.event.player.PlayerJoinEvent) $;
		e.setJoinMessage(null);
		p.setGameMode(GameMode.SPECTATOR);
		//l.setTitle(p, ChatColor.GOLD + "<<轍迹之城>", "米養百態 ， 人安所命 ， 運道各異寤生 。");
		Title.set(p, "hello", "world");		
		Tab.set(p, "hello", "world");
		//l.sendTabTitle(p, null, null);
		//l.sendActionBar(p, "nonono");
		p.setPlayerListName("                                        <<轍迹之城>                                       ");
		p.teleport(new Location(p.getWorld(), 112.501, 94.99269, 294.001, 91.7f, 30.7f));
		/*c.set(p, "demo", Bukkit.getScheduler().scheduleSyncRepeatingTask(launcher.$, new Runnable() {
			public void run() {
				//p.sendMessage(p.getName());
			}
		}, 0L, 60L));*/
		c.set(p, "autoKick", Bukkit.getScheduler().scheduleSyncDelayedTask(launcher.$, new Runnable(){
			public void run() {
				p.kickPlayer("auto kick");
			}
		},99999L));	
	}
}
