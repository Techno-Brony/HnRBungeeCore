package com.weebly.openboxtechnologies.hnrbungee.commands;

import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;

public class PartyCommands implements CommandExecutor {
    @Override
    public boolean onCommand(CommandSender e, Command command, String label, String[] args) {
        if (args.length == 0) {
            //TODO Displays the help for /party
            return true;
        }

        if (args.length == 1) {
            switch (args[0].toLowerCase()) {
                case "create":
                    //TODO Create a party
                    break;

                case "leave":
                    //TODO Leave a party
                    break;

                case "list":
                    //TODO List members in Party
                    break;

                case "disband":
                    //TODO Disband Party
                    break;

                default:
                    //TODO Unknown Argument or Not Enough Arguments
                    break;
            }
        }

        if (args.length == 2) {
            switch (args[0].toLowerCase()) {
                case "invite":
                    //TODO Invite a player
                    break;

                case "join":
                    //TODO Join a party invitation
                    break;

                default:
                    //TODO Unknown Argument
                    break;
            }
        }
        return false;
    }
}
