package eu.crackscout.hungergames;

import org.bukkit.plugin.java.JavaPlugin;

import eu.crackscout.commands.SetupCommand;

public class Main extends JavaPlugin {
	
	@SuppressWarnings("unused")
	private static Main instance;
	
	@Override
	public void onEnable() {
		instance = this;
	}
	
	void initCommands() {
		getCommand("setup").setExecutor(new SetupCommand(this));
	}
	

}


/** 
 *
 * @author Joel Rzepka - crackscout.de
 *
 * @date Jul 8, 2025 - 3:46:08 PM
 *
 */