package effectRandom;


import org.bukkit.ChatColor;
import org.bukkit.command.CommandExecutor;
import org.bukkit.plugin.java.JavaPlugin;



public class Main extends JavaPlugin {

	static boolean start = false;
	static String tagPlugin;
	static Main plugin;
	static int level = 0;
	
	public void onEnable() {
		
		tagPlugin = ChatColor.RESET + "[" + ChatColor.BLUE + getName() + ChatColor.RESET + "] ";
		plugin = this;
		
		this.getCommand("start").setExecutor((CommandExecutor)new Commands());
		this.getLogger().info("Started!");
		
	}
	
}
