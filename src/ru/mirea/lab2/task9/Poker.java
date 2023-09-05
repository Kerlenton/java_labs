package ru.mirea.lab2.task9;

import java.util.List;
import java.util.Scanner;

public class Poker {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter number of players: ");
        int numPlayers = scanner.nextInt();
        scanner.nextLine();

        Deck deck = new Deck();
        deck.shuffle();

        for (int i = 0; i < numPlayers; i++) {
            Player player = new Player();
            List<Card> hand = deck.deal(5);
            player.receiveCards(hand);
            player.printHand();
        }
    }
}
