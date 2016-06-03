package com.weebly.openboxtechnologies.hnrbungee;

import org.bukkit.event.Event;
import org.bukkit.event.HandlerList;

public class PlayerVanishedEvent extends Event {
    private static final HandlerList handlers = new HandlerList();
    private String playerName;

    public PlayerVanishedEvent(String e) {
        playerName = e;
    }

    public String getPlayerName() {
        return playerName;
    }

    public HandlerList getHandlers() {
        return handlers;
    }

    public static HandlerList getHandlerList() {
        return handlers;
    }
}
