package j1Lib.sincity.echo.v1;

import org.bukkit.Bukkit;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.player.AsyncPlayerChatEvent;
import org.bukkit.event.player.PlayerJoinEvent;
import org.bukkit.event.player.PlayerMoveEvent;
import org.bukkit.event.player.PlayerQuitEvent;
import org.bukkit.plugin.java.JavaPlugin;

import j1Lib.sincity.echo.v1.library.l;

public class launcher extends JavaPlugin implements Listener {

	public static launcher $;
	
	public launcher(){
		$=this;
	}
	
	public void onEnable() {
		getServer().getPluginManager().registerEvents(this, this);
		String id = l.getID();
		if (id.equals("00155D2FDC00W9E9E407804A92F00W9E9E407804A92F00W9E9E407804A92F00")) {
			getLogger().info(id);
		} else {
			Bukkit.getServer().shutdown();
		}
	}
	
	//https://www.spigotmc.org/threads/register-for-all-events.80359/page-2
	@EventHandler
        public void handler(Event $) {
        	e.get($.getEventName()).handler($);
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
