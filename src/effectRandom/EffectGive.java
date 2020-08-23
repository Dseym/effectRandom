package effectRandom;

import org.bukkit.Bukkit;
import org.bukkit.entity.Player;
import org.bukkit.potion.PotionEffect;
import org.bukkit.potion.PotionEffectType;

public class EffectGive implements Runnable {

	@Override
	public void run() {
		
		for(Player p: Bukkit.getOnlinePlayers()) {
			
			int effect = (int)Math.floor(Math.random()*PotionEffectType.values().length);
			int duration = (30+(int)Math.floor(Math.random()*(Main.level+1)))*20;
			int amplifer = (int)Math.floor(Main.level / 20);
			
			try {
				
				p.addPotionEffect(new PotionEffect(PotionEffectType.values()[effect], duration, amplifer));
			
			} catch (Exception e) {
				
				p.addPotionEffect(new PotionEffect(PotionEffectType.values()[effect], 30, 0));
				
			}
			
			Main.level++;
			
		}
		
	}
	
}
