package ru.mirea.lab2.task9;

import java.util.List;

public class Player {
    private List<Card> hand;

    public void receiveCards(List<Card> cards) {
        hand = cards;
    }

    public void printHand() {
        for (Card card : hand) {
            System.out.println(card);
        }
        System.out.println();
    }
}