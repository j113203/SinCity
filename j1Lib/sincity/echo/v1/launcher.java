package j1Lib.sincity.echo.v1;

import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.player.AsyncPlayerChatEvent;
import org.bukkit.event.player.PlayerJoinEvent;
import org.bukkit.event.player.PlayerMoveEvent;
import org.bukkit.event.player.PlayerQuitEvent;
import org.bukkit.plugin.java.JavaPlugin;
import  j1Lib.sincity.echo.v1.library.$;

import j1Lib.sincity.echo.v1.library.l;

@$(key = "00155D2FDC00W9E9E407804A92F00W9E9E407804A92F00W9E9E407804A92F00")
public class launcher extends JavaPlugin implements Listener {

	public static launcher $;
	
	public launcher(){
		$=this;
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
	
}
