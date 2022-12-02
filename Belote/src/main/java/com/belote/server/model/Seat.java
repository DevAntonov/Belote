package com.belote.server.model;

import lombok.Data;

@Data
public class Seat {
    private Player player;
    private Player playerOnLeftSeat;
    private Player playerOnRightSeat;

    public void setSeatEmpty() {
        player = null;
    }
}
