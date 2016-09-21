package j1Lib.sincity.echo.v1.event;

import org.bukkit.entity.Player;

public class AsyncPlayerChatEvent implements PlayerEvent{

	@Override
	public void handler(org.bukkit.event.player.PlayerEvent $, Player p) {
		org.bukkit.event.player.AsyncPlayerChatEvent e = (org.bukkit.event.player.AsyncPlayerChatEvent) $;
		e.setCancelled(true);
	}

}
