package com.belote.client.Game;

import com.belote.client.Game.Decks.Cards.Card;
import com.belote.client.Game.Players.Player;
import java.util.Arrays;
import java.util.List;
import java.util.Random;

public class Game {

    Player player1;
    Player player2;
    Player player3;
    Player player4;
    Player dealer;
    List<Card> teamOneTricksWon;
    List<Card> teamTwoTricksWon;
    private int teamOnePoints;
    private int teamTwoPoints;


    public Game(Player player1, Player player2, Player player3, Player player4) {

        this.player1 = player1;
        this.player2 = player2;
        this.player3 = player3;
        this.player4 = player4;
        setRandomDealer();



    }

    public void setDealer(Player dealer) {
        this.dealer = dealer;
    }

    private void setRandomDealer() {

        List<Player> playersList = Arrays.asList(player1, player2, player3, player4);
        Random random = new Random();

        int randomIndex = random.nextInt(playersList.size());
        dealer = playersList.get(randomIndex);
    }
}
