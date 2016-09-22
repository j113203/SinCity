package j1Lib.sincity.echo.v1.storage;

import java.io.File;
import java.io.IOException;

import org.bukkit.configuration.InvalidConfigurationException;
import org.bukkit.configuration.file.YamlConfiguration;

import j1Lib.sincity.echo.v1.launcher;

public class io {
	public static YamlConfiguration config(String name) {
		File f = new File(launcher.$.getDataFolder(), name);
		if (!f.exists()) {
	        f.getParentFile().mkdirs();
	        launcher.$.saveResource(name, true);
	    }
		YamlConfiguration c = new YamlConfiguration();
		try {
			c.load(f);
		} catch (IOException | InvalidConfigurationException e) {			
		}
		return c;
	}
	public static void save(){
		launcher.$.saveConfig();
	}
}
