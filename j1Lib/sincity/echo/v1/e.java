package j1Lib.sincity.echo.v1;

import java.util.HashMap;
import java.util.Map;

import j1Lib.sincity.echo.v1.event.PlayerEvent;

public class e {
	private static Map<String, PlayerEvent> $ = new HashMap<String, PlayerEvent>();

	public static PlayerEvent get(String $) {
		if (e.$.containsKey($)) {
			return e.$.get($);
		} else {
			try {
				e.$.put($, (PlayerEvent) Class.forName("j1Lib.sincity.echo.v1.event."+$).newInstance());
			} catch (InstantiationException e) {
				return null;
			} catch (IllegalAccessException e) {
				return null;
			} catch (ClassNotFoundException e) {
				return null;
			}
			return get($);
		}
	}
}
