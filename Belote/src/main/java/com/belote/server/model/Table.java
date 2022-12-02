package com.belote.server.model;

import lombok.Data;
import java.util.List;

@Data
public class Table {
    private final String tableID;
    private List<Player> players;
    private String tableStatus;
    private Player host;
    private Game game;
}
