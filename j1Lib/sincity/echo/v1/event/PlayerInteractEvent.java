package j1Lib.sincity.echo.v1.event;

import org.bukkit.entity.Player;

public class PlayerInteractEvent implements PlayerEvent {

	@Override
	public void handler(org.bukkit.event.player.PlayerEvent $, Player p) {
		org.bukkit.event.player.PlayerInteractEvent e = (org.bukkit.event.player.PlayerInteractEvent) $;
		p.sendMessage("clicked");
		e.hasItem();
	}

}
