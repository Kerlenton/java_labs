package ru.mirea.lab3;

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class task4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Введите рамер массива: ");

        int n = sc.nextInt();
        int[] array1 = new int[n];
        int[] array2;

        Random random = new Random();

        for (int i = 0; i < array1.length; i++) {
            array1[i] = random.nextInt(n + 1);
        }

        System.out.println("Первый массив: " + Arrays.toString(array1));

        int evenCount = 0;
        for (int i = 0; i < array1.length; i++) {
            if (array1[i] % 2 == 0) {
                evenCount++;
            }
        }

        array2 = new int[evenCount];
        int index = 0;
        for (int i = 0; i < array1.length; i++) {
            if (array1[i] % 2 == 0) {
                array2[index++] = array1[i];
            }
        }

        System.out.println("Второй массив: " + Arrays.toString(array2));
    }
}
