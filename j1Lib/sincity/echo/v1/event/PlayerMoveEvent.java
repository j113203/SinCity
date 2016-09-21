package j1Lib.sincity.echo.v1.event;

import org.bukkit.entity.Player;

public class PlayerMoveEvent implements PlayerEvent{

	@Override
	public void handler(org.bukkit.event.player.PlayerEvent $, Player p) {
		org.bukkit.event.player.PlayerMoveEvent e = (org.bukkit.event.player.PlayerMoveEvent) $;
		e.setCancelled(e.getTo().distance(e.getFrom())!=0.0);
	}
	
}
