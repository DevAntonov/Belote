package com.belote.client.Game.Decks;

import com.belote.client.Game.Decks.Cards.Card;

public interface Deck {

    Card draw();
    void cut();
    void shuffle();
}
