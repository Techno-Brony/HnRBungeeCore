package com.weebly.openboxtechnologies.hnrbungee.commands;

import org.bukkit.ChatColor;

final class PartyMessages {

    String partyHelp = encodeColors("&e&lParty&7&l> &a/party - &fDisplays the help for parties\n" +
            "&e&lParty&7&l> &a/party create - &fCreates a party\n" +
            "&e&lParty&7&l> &a/party invite <player> - &fInvites a player to a party\n" +
            "&e&lParty&7&l> &a/party join <player> - &fJoins a party you were invited to\n" +
            "&e&lParty&7&l> &a/party leave - &fLeaves your current party\n" +
            "&e&lParty&7&l> &a/party list - &fLists all of the players in your party\n" +
            "&e&lParty&7&l> &a/party disband - &fIf you are the leader of your party, you completely delete your party");

    String partyCreate = encodeColors("&e&lParty&7&l> &9You have created a party!");

    String partyCreateInParty = encodeColors("&e&lParty&7&l> &9You are already in a party!\n" +
            "&e&lParty&7&l> &9Type &a/party leave &9to be able to create your own!");

    String partyInviteNoPlayer = encodeColors("&e&lCommand&7&l> &9You have incorrectly used this command!\n" +
            "&e&lCommand&7&l> &9You must specify a player!\n" +
            "&e&lCommand&7&l> &a/party invite <player>");

    String partyInvite = encodeColors("&e&lParty&7&l> &9You have invited &c<player> &9to your party!");

    String partyBeenInvited = encodeColors("&e&lParty&7&l> &9You have been invited to &c<player>&9’s party!");

    String partyJoinNoPlayer = encodeColors("&e&lCommand&7&l> &9You have incorrectly used this command!\n" +
            "&e&lCommand&7&l> &9You must specify a player!\n" +
            "&e&lCommand&7&l> &a/party join <player>");

    String partyJoinInvite = encodeColors("&e&lParty&7&l> &9You have joined &c<player>&9’s party!");

    String partyAcceptInvite = encodeColors("&e&lParty&7&l> &c<player> &9has accepted your party invite!");

    String partyJoinInParty = encodeColors("&e&lParty&7&l> &9You are already in a party!\n" +
            "&e&lParty&7&l> &9Type &a/party leave &9to be able to join one!");

    String partyLeaveNoParty = encodeColors("&e&lParty&7&l> &9You are not currently in a party!");

    //Variables include : Player
    String partyLeave = encodeColors("&e&lParty&7&l> &9You have left &c%player%&9’s party!");
    String partyNotifyLeave = encodeColors("&e&lParty&7&l> &c%player% &9has left your party!");

    String partyListNoParty = encodeColors("&e&lParty&7&l> &9You are not currently in a party!");

    String partyListPrefix = encodeColors("&e&lParty&7&l> ");
    //Variables include : Player
    String partyListPlayer = encodeColors("&c%player%&9 ");

    String partyDisbandNoParty = encodeColors("&e&lParty&7&l> &9You are not currently in a party!");

    String partyDisbandNotLeader = encodeColors("&e&lParty&7&l> &9You are not the leader of this party!");

    String partyDisband = encodeColors("&e&lParty&7&l> &9You have disbanded your party!");

    String partyNotifyDisband = encodeColors("&e&lParty&7&l> &9The party you were just in has been disbanded!");

    String partyNotifyLeader = encodeColors("&e&lParty&7&l> &c<newpartyleader> &9has been promoted to party leader!");

    String partyNewLeaderNotify = encodeColors("&e&lParty&7&l> &9You have become the new party leader!");

    private String encodeColors(String e) {
        return ChatColor.translateAlternateColorCodes('&', e);
    }
}
