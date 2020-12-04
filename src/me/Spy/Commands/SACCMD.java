package me.Spy.Commands;

import me.Spy.Main.Main;
import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;

public class SACCMD implements CommandExecutor {

    @Override
    public boolean onCommand(CommandSender sender, Command cmd, String s, String[] strings) {
        if(sender instanceof Player){
            Player p = (Player)sender;
            if(p.hasPermission("System.SAC")){
                p.sendMessage(Main.prefix + "§cUsage: /sac <info>/<notify>/<check>");
                //if(strings.length == 1 ){
                //
                //}
            }
        }
        return false;
    }
}
