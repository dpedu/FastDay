package me.dpedu.fastday;

import org.bukkit.plugin.java.JavaPlugin;
import org.bukkit.scheduler.BukkitRunnable;

public class FastDay extends JavaPlugin {
	public void onEnable() {
		new SetNight(this).runTaskTimer(this, 1, 1); 
	}
	
	public class SetNight extends BukkitRunnable {
		// Helper class for performing time updates
		private final JavaPlugin plugin;
	    public SetNight(JavaPlugin plugin) {
	        this.plugin = plugin;
	    }
	    public void run() {
	    	long curtime = plugin.getServer().getWorld("world").getFullTime();
	    	curtime+=19;
	    	plugin.getServer().getWorld("world").setFullTime(curtime);
	    }
	}
	
}
