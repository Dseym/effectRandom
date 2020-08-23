package effectRandom;

import org.bukkit.Bukkit;
import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;

public class Commands implements CommandExecutor {

	@Override
	public boolean onCommand(CommandSender sender, Command cmd, String label, String[] args) {

		if(Main.start) {
			
			sender.sendMessage(Main.tagPlugin + "Игра уже идет");
			
			return true;
			
		}
		
		Main.start = true;
		Bukkit.getPluginManager().registerEvents(new Event(), Main.plugin);
		Bukkit.getScheduler().runTaskTimer(Main.plugin, new EffectGive(), 15*20, 30*20);
		sender.sendMessage(Main.tagPlugin + "Игра началась");
			
		return true;
		
	}

}
