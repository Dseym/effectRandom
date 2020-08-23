package effectRandom;

import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.entity.PlayerDeathEvent;

public class Event implements Listener {

	@EventHandler
	void isPlayerDead(PlayerDeathEvent e) {
		
		Main.level--;
		
	}
	
}
