package j1Lib.sincity.echo.v1;

import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.player.AsyncPlayerChatEvent;
import org.bukkit.event.player.PlayerInteractEvent;
import org.bukkit.event.player.PlayerJoinEvent;
import org.bukkit.event.player.PlayerMoveEvent;
import org.bukkit.event.player.PlayerQuitEvent;
import org.bukkit.plugin.java.JavaPlugin;

import com.comphenix.protocol.ProtocolLibrary;
import com.comphenix.protocol.ProtocolManager;

import j1Lib.sincity.echo.v1.library.$;

import j1Lib.sincity.echo.v1.library.l;

@$(key = "00155D2FDC00W9E9E407804A92F00W9E9E407804A92F00W9E9E407804A92F00")
public class launcher extends JavaPlugin implements Listener {

	public static launcher $;
	public static ProtocolManager protocolManager;

	public launcher() {
		$ = this;
		protocolManager = ProtocolLibrary.getProtocolManager();
	}

	public void onEnable() {
		getServer().getPluginManager().registerEvents(this, this);
		l.init();
	}

	@EventHandler
	public void handler(PlayerJoinEvent $) {
		e.get($.getEventName()).handler($);
	}

	@EventHandler
	public void handler(PlayerMoveEvent $) {
		e.get($.getEventName()).handler($);
	}

	@EventHandler
	public void handler(AsyncPlayerChatEvent $) {
		e.get($.getEventName()).handler($);
	}

	@EventHandler
	public void handler(PlayerQuitEvent $) {
		e.get($.getEventName()).handler($);
	}

	@EventHandler
	public void handler(PlayerInteractEvent $) {
		e.get($.getEventName()).handler($);
	}
	

}
