package ru.mirea.lab1;

import java.util.Scanner;

public class task5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Введите число: ");

        int length = sc.nextInt();
        int ans = 1;

        for (int i = 0; i < length; i++) {
            ans *= (i + 1);
        }

        System.out.println(ans);
    }
}