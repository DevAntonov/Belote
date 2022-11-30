package org.belote.Game.Decks;

import org.belote.Game.Decks.Cards.Card;

public interface Deck {

    Card draw();
    void cut();
    void shuffle();
}
