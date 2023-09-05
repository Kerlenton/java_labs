package ru.mirea.lab2;

import java.util.Scanner;

public class task10 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a sentence: ");
        String sentence = scanner.nextLine();
        String[] words = sentence.split(" ");
        int numWords = words.length;
        System.out.println("You entered " + numWords + " words.");
    }
}
