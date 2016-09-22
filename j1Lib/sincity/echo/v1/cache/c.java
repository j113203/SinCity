package j1Lib.sincity.echo.v1.cache;

import java.util.HashMap;
import java.util.Map;

import org.bukkit.entity.Player;

public class c {
	private static Map<String,Object> $= new HashMap<String,Object>();
	public static Object get(String $){
		return get($,null);
	}
	public static Object get(String $,Object $$){
		if (c.$.containsKey($)){
			return c.$.get($);
		}else{
			return $$;
		}
	}
	public static Object set(String $,Object $$){
		c.$.put($, $$);
		return $$;
	}
	public static boolean has(String $){
		return c.$.containsKey($);
	}
	@SuppressWarnings("unchecked")
	private static Map<String,Object> getC(Player p){
		return (Map<String, Object>) c.get(p.getUniqueId().toString(),new HashMap<String,Object>());
	}
	public static Object get(Player p,String $){
		return get(p,$,null);
	}
	public static Object get(Player p,String $,Object $$){
		Map<String,Object> c = getC(p);
		if (c.containsKey($)){
			return c.get($);
		}else{
			return $$;
		}
	}
	public static Object set(Player p,String $,Object $$){
		Map<String,Object> cache = getC(p);
		cache.put($,$$);
		c.set(p.getUniqueId().toString(),cache);
		return $$;
	}
}
