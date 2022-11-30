package org.belote.Game.Players;

import org.belote.Game.Decks.Cards.Card;

import java.util.ArrayList;
import java.util.List;

public class HumanPlayer implements Player{
    private List<Card> hand;

    HumanPlayer() {
        hand = new ArrayList<>();
    }

}
