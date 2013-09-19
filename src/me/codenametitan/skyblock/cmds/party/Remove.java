package me.codenametitan.skyblock.cmds.party;

import org.bukkit.Bukkit;
import org.bukkit.ChatColor;
import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;

public class Remove implements CommandExecutor{
	
	String prefix = ChatColor.AQUA + "TCGN" + ChatColor.GRAY + " | " + ChatColor.GREEN + "Skyblock ";

	@Override
	public boolean onCommand(CommandSender sender, Command cmd, String c,
			String[] args) {
		
		if(c.equalsIgnoreCase("sb remove")) {
			Player p = (Player) sender;
			if(args.length == 0) {
				p.sendMessage(prefix + ChatColor.YELLOW + "Please Specify The Player To Remove");
			} else if(args.length > 1) {
				Player target = Bukkit.getPlayer(args[0]);
				target.teleport(Bukkit.getServer().getWorld("SkyblockSpawn").getSpawnLocation());
				target.sendMessage(prefix + ChatColor.YELLOW + "You have been removed off of " + p.getName() +"'s Island");
			}
		}
		
		
		
		return false;
	}

}
