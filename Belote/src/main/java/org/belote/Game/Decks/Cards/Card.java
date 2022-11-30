package org.belote.Game.Decks.Cards;

public enum Card {
    A_SPADE(Rank.ACE, Suit.SPADES), A_DIAMOND(Rank.ACE, Suit.DIAMONDS), A_HEART(Rank.ACE, Suit.HEARTS), A_CLUB(Rank.ACE, Suit.CLUBS),
    K_SPADE(Rank.KING, Suit.SPADES), K_DIAMOND(Rank.KING, Suit.DIAMONDS), K_HEART(Rank.KING, Suit.HEARTS), K_CLUB(Rank.KING, Suit.CLUBS),
    Q_SPADE(Rank.QUEEN, Suit.SPADES), Q_DIAMOND(Rank.QUEEN, Suit.DIAMONDS), Q_HEART(Rank.QUEEN, Suit.HEARTS), Q_CLUB(Rank.QUEEN, Suit.CLUBS),
    J_SPADE(Rank.JACK, Suit.SPADES), J_DIAMOND(Rank.JACK, Suit.DIAMONDS), J_HEART(Rank.JACK, Suit.HEARTS), J_CLUB(Rank.JACK, Suit.CLUBS),
    TEN_SPADE(Rank.TEN, Suit.SPADES), TEN_DIAMOND(Rank.TEN, Suit.DIAMONDS), TEN_HEART(Rank.TEN, Suit.HEARTS), TEN_CLUB(Rank.TEN, Suit.CLUBS),
    NINE_SPADE(Rank.NINE, Suit.SPADES), NINE_DIAMOND(Rank.NINE, Suit.DIAMONDS), NINE_HEART(Rank.NINE, Suit.HEARTS), NINE_CLUB(Rank.NINE, Suit.CLUBS),
    EIGHT_SPADE(Rank.EIGHT, Suit.SPADES), EIGHT_DIAMOND(Rank.EIGHT, Suit.DIAMONDS), EIGHT_HEART(Rank.EIGHT, Suit.HEARTS), EIGHT_CLUB(Rank.EIGHT, Suit.CLUBS),
    SEVEN_SPADE(Rank.SEVEN, Suit.SPADES), SEVEN_DIAMOND(Rank.SEVEN, Suit.DIAMONDS), SEVEN_HEART(Rank.SEVEN, Suit.HEARTS), SEVEN_CLUB(Rank.SEVEN, Suit.CLUBS),
    SIX_SPADE(Rank.SIX, Suit.SPADES), SIX_DIAMOND(Rank.SIX, Suit.DIAMONDS), SIX_HEART(Rank.SIX, Suit.HEARTS), SIX_CLUB(Rank.SIX, Suit.CLUBS),
    FIVE_SPADE(Rank.FIVE, Suit.SPADES), FIVE_DIAMOND(Rank.FIVE, Suit.DIAMONDS), FIVE_HEART(Rank.FIVE, Suit.HEARTS), FIVE_CLUB(Rank.FIVE, Suit.CLUBS),
    FOUR_SPADE(Rank.FOUR, Suit.SPADES), FOUR_DIAMOND(Rank.FOUR, Suit.DIAMONDS), FOUR_HEART(Rank.FOUR, Suit.HEARTS), FOUR_CLUB(Rank.FOUR, Suit.CLUBS),
    THREE_SPADE(Rank.THREE, Suit.SPADES), THREE_DIAMOND(Rank.THREE, Suit.DIAMONDS), THREE_HEART(Rank.THREE, Suit.HEARTS), THREE_CLUB(Rank.THREE, Suit.CLUBS),
    TWO_SPADE(Rank.TWO, Suit.SPADES), TWO_DIAMOND(Rank.TWO, Suit.DIAMONDS), TWO_HEART(Rank.TWO, Suit.HEARTS), TWO_CLUB(Rank.TWO, Suit.CLUBS);
    private final Rank rank;
    private final Suit suit;

    Card(Rank rank, Suit suit) {
        this.rank = rank;
        this.suit = suit;
    }

    public Rank getRank() {
        return rank;
    }

    public Suit getSuit() {
        return suit;
    }
}
