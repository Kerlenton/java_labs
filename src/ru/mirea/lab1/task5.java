package ru.mirea.lab1;

import java.math.BigInteger;
import java.util.Scanner;

public class task5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Введите число: ");

        int length = sc.nextInt();
        BigInteger ans = BigInteger.valueOf(1);

        for (int i = 0; i < length; i++) {
            ans = ans.multiply(ans);
        }

        System.out.println(ans);
    }
}