package com.weebly.openboxtechnologies.hnrbungee;

import com.weebly.openboxtechnologies.hnrbungee.commands.PartyCommands;
import org.bukkit.command.Command;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;
import org.bukkit.plugin.java.JavaPlugin;

public class hnrbungee extends JavaPlugin {

    @Override
    public void onEnable() {
        new Listener(this);
        getCommand("party").setExecutor(new PartyCommands());
    }

    @Override
    public void onDisable() {

    }

    @Override
    public boolean onCommand(CommandSender e, Command command, String label, String[] args) {
        if (command.getName().equalsIgnoreCase("templatecmd")) {
            if (e instanceof Player) {
                e.sendMessage("This command works!");
            }
            return true;
        }
        return false;
    }

}
