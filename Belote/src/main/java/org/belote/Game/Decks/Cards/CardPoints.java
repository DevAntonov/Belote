package org.belote.Game.Decks.Cards;

public enum CardPoints {

    POINTS_OF_SEVEN(0), POINTS_OF_EIGHT(0), POINTS_OF_NINE(0),
    POINTS_OF_TEN(10), POINTS_OF_J(2), POINTS_OF_Q(3),
    POINTS_OF_K(4), POINTS_OF_A(11), TRUMP_NINE(14), TRUMP_J(20),
    WINNER_OF_LAST_TRICK(10);
    final int points;

    CardPoints(int points) {
        this.points = points;
    }
}
