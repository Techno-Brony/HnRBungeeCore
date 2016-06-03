package com.weebly.openboxtechnologies.hnrbungee;

import org.bukkit.ChatColor;

public final class ChatMessages {
    String bungeeMsg = encodeColors("&e&lBungee&7&l> &9This is the bungee plugin containing all things having to do with cross server commands!");

    String msgNoArgs = encodeColors("&e&lCommand&7&l> &9You have incorrectly used this command!\n" +
            "&e&lCommand&7&l> &9You did not specify any arguments!\n" +
            "&e&lCommand&7&l> &a/msg <player> <message>");

    String msgNoPlayer = encodeColors("&e&lCommand&7&l> &9You have incorrectly used this command!\n" +
            "&e&lCommand&7&l> &9You did not specify a player!\n" +
            "&e&lCommand&7&l> &a/msg <player> <message>");

    String noMsg = encodeColors("&e&lCommand&7&l> &9You have incorrectly used this command!\n" +
            "&e&lCommand&7&l> &9You did not specify a message!\n" +
            "&e&lCommand&7&l> &a/msg <player> <message>");

    String msgBadPlayer = encodeColors("&e&lCommand&7&l> &9The player you are trying to message does not exist or is offline!\n" +
            "&e&lCommand&7&l> &a/msg <player> <message>");

    //Variables include : Player, Target, Message
    String msgReplyFormat = encodeColors("&b&l%player% &3&l&m>> &b&l%target% &3&l%message%");
    String msgReplyReceived = encodeColors("&b&l%target% &3&l&m>> &b&l%player% &3&l%message%");

    String replyNoMSG = encodeColors("&e&lCommand&7&l> &9You have incorrectly used this command!\n" +
            "&e&lCommand&7&l> &9You did not specify a message!\n" +
            "&e&lCommand&7&l> &a/r <message>");

    String replyBadPlayer = encodeColors("&e&lCommand&7&l> &9This player is no longer online!\n" +
            "&e&lCommand&7&l> &a/r <message>");

    String replyNoPlayer = encodeColors("&e&lCommand&7&l> &9You have not messaged anyone recently!\n" +
            "&e&lCommand&7&l> &a/r <message>");

    String announceNoMSG = encodeColors("&e&lCommand&7&l> &9You have incorrectly used this command!\n" +
            "&e&lCommand&7&l> &9You must specify a message!\n" +
            "&e&lCommand&7&l> &a/announce <message>");

    //Variables include : Message
    String announceMSG = encodeColors("&e&lAnnouncement&7&l> &b&l%message%");
    String announceSubtitle = encodeColors("&9%message%");

    String announceTitle = encodeColors("&e&lAnnouncement");

    String blockNoPlayer = encodeColors("&e&lCommand&7&l> &9You have incorrectly used this command!\n" +
            "&e&lCommand&7&l> &9You must specify a player!\n" +
            "&e&lCommand&7&l> &a/block <player>");

    //Variables include : Player
    String blockedMSG = encodeColors("&e&lBlock&7&l> &9You have blocked &c%player%&9!");

    String msgBlocked = encodeColors("&e&lBlock&7&l> &9This player has blocked you! You cannot message them!");

    String unblockNoPlayer = encodeColors("&e&lCommand&7&l> &9You have incorrectly used this command!\\n\n" +
            "&e&lCommand&7&l> &9You must specify a player!\n" +
            "&e&lCommand&7&l> &a/unblock <player>");

    String unblockedNotBlocked = encodeColors("&e&lBlock&7&l> &9This player is not blocked!");

    String blockBlocked = encodeColors("&e&lBlock&7&l> &9You have already blocked this player!");

    String msgToggle = encodeColors("&e&lMessage&7&l> &9You have toggled messaging!");

    String msgToggled = encodeColors("&e&lMessage&7&l> &9This player has messaging turned off!");

    String vanishEnabled = encodeColors("&e&lVanish&7&l> &9You have enabled vanish!");

    String vanishDisabled = encodeColors("&e&lVanish&7&l> &9You have disabled vanish!");

    String vanishNoPerm = encodeColors("&e&lHnRPerms&7&l> &9To use this feature, you must be rank &8(&3MENTEE&8)&9!");

    String blockListPrefix = encodeColors("&e&lBlockList&7&l> ");
    //Variables include : Player
    String blockListPlayer = encodeColors("&c%player% ");


    private String encodeColors(String e) {
        return ChatColor.translateAlternateColorCodes('&', e);
    }
}
