package com.belote.client.Game.Players;

import com.belote.client.Game.Decks.Cards.Card;

import java.util.ArrayList;
import java.util.List;

public class HumanPlayer implements Player{
    private List<Card> hand;

    HumanPlayer() {
        hand = new ArrayList<>();
    }

}
