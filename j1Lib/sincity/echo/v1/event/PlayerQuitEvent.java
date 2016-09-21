package j1Lib.sincity.echo.v1.event;

import org.bukkit.Bukkit;
import org.bukkit.entity.Player;

import j1Lib.sincity.echo.v1.cache.c;


public class PlayerQuitEvent implements PlayerEvent{

	@Override
	public void handler(org.bukkit.event.player.PlayerEvent $, Player p) {
		org.bukkit.event.player.PlayerQuitEvent e = (org.bukkit.event.player.PlayerQuitEvent) $;
		e.setQuitMessage(null);
		Bukkit.getScheduler().cancelTask((int) c.get(p, "autoKick"));
		Bukkit.getScheduler().cancelTask((int) c.get(p, "demo"));		
	}
	
}
