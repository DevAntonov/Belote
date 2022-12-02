package com.belote.client.Game.Decks;


import com.belote.client.Game.Decks.Cards.Card;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Random;

public class BeloteDeck implements Deck{
    private List<Card> beloteDeck;
    private boolean isShuffled;

    public BeloteDeck() {
        // Adding 32 Cards - 7 8 9 10 J Q K A from every suit
        beloteDeck = new ArrayList<>(Arrays.asList(
                Card.SEVEN_SPADE, Card.EIGHT_SPADE, Card.NINE_SPADE, Card.TEN_SPADE,
                Card.J_SPADE, Card.Q_SPADE, Card.K_SPADE, Card.A_SPADE,
                Card.SEVEN_DIAMOND, Card.EIGHT_DIAMOND, Card.NINE_DIAMOND, Card.TEN_DIAMOND,
                Card.J_DIAMOND, Card.Q_DIAMOND, Card.K_DIAMOND, Card.A_DIAMOND,
                Card.SEVEN_HEART, Card.EIGHT_HEART, Card.NINE_HEART, Card.TEN_HEART,
                Card.J_HEART, Card.Q_HEART, Card.K_HEART, Card.A_HEART,
                Card.SEVEN_CLUB, Card.EIGHT_CLUB, Card.NINE_CLUB, Card.TEN_CLUB,
                Card.J_CLUB, Card.Q_CLUB, Card.K_CLUB, Card.A_CLUB
        ));

        isShuffled = false;
    }

    @Override
    public Card draw() {
        Card cardOnTop = beloteDeck.get(beloteDeck.size() - 1);
        beloteDeck.remove(cardOnTop);
        return cardOnTop;
    }

    @Override
    public void cut() {
        List<Card> bottomCut = beloteDeck.subList(0, (beloteDeck.size() / 2) - 1);
        List<Card> topCut = beloteDeck.subList(beloteDeck.size() / 2, beloteDeck.size() - 1);

        topCut.addAll(bottomCut);
        beloteDeck = topCut;
    }

    @Override
    public void shuffle() {

        if (isShuffled) {
            Random random = new Random();

            for (int i = beloteDeck.size() - 1; i > 0; i--) {
                int indexOfElementToSwap = random.nextInt(i + 1);
                Card currentElement = beloteDeck.get(i);
                beloteDeck.set(i, beloteDeck.get(indexOfElementToSwap));
                beloteDeck.set(indexOfElementToSwap, currentElement);
            }
        }

        isShuffled = true;
    }

    public List<Card> getBeloteDeck() {
        return beloteDeck;
    }
}
