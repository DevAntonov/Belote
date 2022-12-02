package com.belote.server.model;

import lombok.Data;
import java.util.List;

@Data
public class Game {
    private final String gameID;
    private List<Round> finishedRounds;
}
