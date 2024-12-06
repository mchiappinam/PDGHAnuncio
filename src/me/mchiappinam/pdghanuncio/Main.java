package me.mchiappinam.pdghanuncio;

import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;
import org.bukkit.plugin.java.JavaPlugin;


public class Main extends JavaPlugin implements CommandExecutor {
	
	  public void onEnable() {
		//getServer().getPluginManager().registerEvents(this, this);
		getServer().getPluginCommand("anuncio").setExecutor(this);
		getServer().getConsoleSender().sendMessage("§3[PDGHSay] §2ativado - Plugin by: mchiappinam");
		getServer().getConsoleSender().sendMessage("§3[PDGHSay] §2Acesse: http://pdgh.com.br/");
	  }

	  public void onDisable() {
		getServer().getConsoleSender().sendMessage("§3[PDGHSay] §2desativado - Plugin by: mchiappinam");
		getServer().getConsoleSender().sendMessage("§3[PDGHSay] §2Acesse: http://pdgh.com.br/");
	  }

	  	@Override
	    public boolean onCommand(CommandSender sender, Command cmd, String label, String[] args) {
            if(cmd.getName().equalsIgnoreCase("anuncio")) {
		        final Player p = (Player) sender;
  				if(!p.hasPermission("pdgh.vip")) {
  					p.sendMessage("§cSem permissões");
  					return true;
  				}
            	if(args.length < 1) {
  					p.sendMessage("§cUse /say <mensagem>");
  					return true;
            	}
                StringBuilder sb = new StringBuilder();
                sb.append(args[0]);
                for (int i = 1; i < args.length; i++) {
                  sb.append(" ");
                  sb.append(args[i]);
                }
  	  	    	getServer().broadcastMessage(("§d["+p.getName()+"] "+sb).replaceAll("&", "§"));
				return true;
            }else if(cmd.getName().equalsIgnoreCase("ssay")) {
				if(sender==getServer().getConsoleSender()) {
	            	if(args.length < 1) {
	            		sender.sendMessage("§cUse /ssay <mensagem>");
	  					return true;
	            	}
	                StringBuilder sb = new StringBuilder();
	                sb.append(args[0]);
	                for (int i = 1; i < args.length; i++) {
	                  sb.append(" ");
	                  sb.append(args[i]);
	                }
      	  	    	getServer().broadcastMessage("§d§l[Server]");
      	  	    	getServer().broadcastMessage("§d§l[Server]");
      	  	    	getServer().broadcastMessage(("§d§l[Server] §d"+sb).replaceAll("&", "§"));
      	  	    	getServer().broadcastMessage("§d§l[Server]");
      	  	    	getServer().broadcastMessage("§d§l[Server]");
  					return true;
				}
		        final Player p = (Player) sender;
  				if(!p.hasPermission("pdgh.admin")) {
  					p.sendMessage("§cSem permissões");
  					return true;
  				}
            	if(args.length < 1) {
  					p.sendMessage("§cUse /ssay <mensagem>");
  					return true;
            	}
                StringBuilder sb = new StringBuilder();
                sb.append(args[0]);
                for (int i = 1; i < args.length; i++) {
                  sb.append(" ");
                  sb.append(args[i]);
                }
  	  	    	getServer().broadcastMessage("§d§l["+p.getName()+"]");
  	  	    	getServer().broadcastMessage("§d§l["+p.getName()+"]");
  	  	    	getServer().broadcastMessage(("§d§l["+p.getName()+"] §d"+sb).replaceAll("&", "§"));
  	  	    	getServer().broadcastMessage("§d§l["+p.getName()+"]");
  	  	    	getServer().broadcastMessage("§d§l["+p.getName()+"]");
				return true;
            }
			return false;
	    }
	    
	    
	    
}