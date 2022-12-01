package org.belote.Game.Tables;

import org.belote.Game.Players.Player;

public class Seat {

    private Player player;
    private Player playerOnLeftSeat;
    private Player playerOnRightSeat;

    Seat() {
        player = null;
        playerOnLeftSeat = null;
        playerOnRightSeat = null;
    }

    public void sit(Player player) {
        if (this.player == null) {
            this.player = player;
        }
    }

    public void setPlayerOnLeftSeat(Player playerOnLeftSeat) {
        if(this.playerOnLeftSeat == null) {
            this.playerOnLeftSeat = playerOnLeftSeat;
        }
    }

    public void setPlayerOnRightSeat(Player playerOnRightSeat) {
        if(this.playerOnRightSeat == null) {
            this.playerOnRightSeat = playerOnRightSeat;
        }
    }

    public Player getPlayer() {
        return player;
    }

    public Player getPlayerOnLeftSeat() {
        return playerOnLeftSeat;
    }

    public Player getPlayerOnRightSeat() {
        return playerOnRightSeat;
    }

    public void setSeatEmpty() {
        player = null;
    }
}
