package com.belote.server.model;

import lombok.Data;
import java.util.List;

@Data
public class Lobby {
    List<Table> tables;
    List<Player> players;
}
