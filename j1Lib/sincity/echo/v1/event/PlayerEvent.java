package j1Lib.sincity.echo.v1.event;

import org.bukkit.entity.Player;

public interface PlayerEvent {
	public default void handler(org.bukkit.event.player.PlayerEvent $){
		handler($,$.getPlayer());
		Runtime.getRuntime().gc();
	};
	public void handler(org.bukkit.event.player.PlayerEvent $,Player $$);
}
