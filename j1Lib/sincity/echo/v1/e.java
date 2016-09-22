package j1Lib.sincity.echo.v1;

import j1Lib.sincity.echo.v1.cache.c;
import j1Lib.sincity.echo.v1.event.PlayerEvent;

public class e {
	public static PlayerEvent get(String $) {
		try {
			PlayerEvent $$ = (PlayerEvent) c.get($,(PlayerEvent) Class.forName("j1Lib.sincity.echo.v1.event." + $).newInstance());
			if (!c.has($)) {
				c.set($, $$);
			}
			return $$;
		} catch (InstantiationException | IllegalAccessException | ClassNotFoundException e) {
			return null;
		}
	}
}
