package com.weebly.openboxtechnologies.hnrbungee;

import com.weebly.openboxtechnologies.hnrbungee.commands.PartyCommands;
import org.bukkit.GameMode;
import org.bukkit.command.Command;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;
import org.bukkit.metadata.FixedMetadataValue;
import org.bukkit.plugin.java.JavaPlugin;
import org.bukkit.scheduler.BukkitRunnable;

import java.util.ArrayList;
import java.util.UUID;

public class hnrbungee extends JavaPlugin {

    private ChatMessages messages = new ChatMessages();

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
        if (!(e instanceof Player)) { return false; }

        if (args.length == 0) {
            switch (command.getName().toLowerCase()) {
                case "hnrbungee":
                    //TODO Displays the chat listed down in the messages section
                    return true;

                case "blocklist":
                    //TODO Show list of blocked people
                    return true;

                case "msgtoggle":
                    //TODO Toggle receive messages
                    return true;

                case "vanish":
                    //TODO Vanish player
                    //TODO FUCK IT LET SOMEONE ELSE HANDLE THIS PLZ I AM DONE WITH VANISH IT IS SO HARD
                    if (!e.hasPermission("rank.mentee")) {
                        e.sendMessage(messages.vanishNoPerm);
                        return true;
                    }
                    return true;

                case "m":
                case "w":
                case "message":
                case "whisper":
                case "tell":
                case "msg":
                    //TODO Error message for no message specified
                    return true;

                case "r":
                case "reply":
                    //TODO Error message for no message specified
                    return true;

                case "announce":
                    //TODO Error message for no message specified
                    return true;

                case "block":
                    //TODO Error message for no player specified
                    return true;

                case "unblock":
                    //TODO Error message for no player specified
                    return true;

                default:
                    //TODO Error message for not enough arguments
                    return true;
            }
        }

        switch (command.getName().toLowerCase()) {
            case "m":
            case "w":
            case "message":
            case "whisper":
            case "tell":
            case "msg":
                //TODO Messages the specified player the specified message with the format in the messages section
                return true;

            case "r":
            case "reply":
                //TODO Reply to the last messaged person who is online
                return true;

            case "announce":
                //TODO Sends a chat message, title, and subtitle to all players on the entire network
                //TODO Especially Subtitles
                return true;

            case "block":
                //TODO Block an unblocked player
                return true;

            case "unblock":
                //TODO Unblock a blocked person
                return true;

            default:
                return false;
        }
    }
}
