package com.belote.server.model;

import lombok.Data;

@Data
public class Player {
    private final String playerID;
    private final String username;
    private Table table;
    private boolean isHostingTheTable;

    public Player(String playerID, String username) {
        this.playerID = playerID;
        this.username = username;
    }
}
