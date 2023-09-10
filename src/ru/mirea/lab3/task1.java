package ru.mirea.lab3;

import java.util.Arrays;
import java.util.Random;

public class task1 {
    public static void main(String[] args) {
        double[] arr = new double[5];
        for (int i = 0; i < 5; i++) {
            arr[i] = Math.random();
        }

        System.out.println("Исходный массив: " + Arrays.toString(arr));
        Arrays.sort(arr);
        System.out.println("Отсортированный массив: " + Arrays.toString(arr));

        double[] arr2 = new double[5];
        Random random = new Random();
        for (int i = 0; i < 5; i++) {
            arr2[i] = random.nextDouble();
        }

        System.out.println("Исходный массив: " + Arrays.toString(arr2));
        Arrays.sort(arr2);
        System.out.println("Отсортированный массив: " + Arrays.toString(arr2));
    }
}
