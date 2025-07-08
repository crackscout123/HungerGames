package eu.crackscout.commands;

import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;
import org.bukkit.plugin.java.JavaPlugin;


public class SetupCommand implements CommandExecutor {
	
	@SuppressWarnings("unused")
	private final JavaPlugin plugin;
	
	public SetupCommand(JavaPlugin plugin) {
		this.plugin = plugin;
	}
	
	@Override
	public boolean onCommand(CommandSender sender, Command command, String label, String[] args) {
		if(sender instanceof Player) {
			Player player = (Player)sender;
			if(!player.isOp()) {
				//TODO: message#noPerms
				System.out.println("nopermissions");
				return true;
			}
			System.out.println("well done");
			//TODO: code#continues
		}
		System.out.println("need to be player");
		return true;
	}
}


/** 
 *
 * @author Joel Rzepka - crackscout.de
 *
 * @date Jul 8, 2025 - 3:47:01 PM
 *
 */