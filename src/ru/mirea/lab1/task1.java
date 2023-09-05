package ru.mirea.lab1;

import java.util.Scanner;

public class task1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Введите рамер массива: ");

        int length = sc.nextInt();
        double[] array = new double[length];
        double sum = 0;

        for (int i = 0; i < length; i++) {
            array[i] = sc.nextDouble();
            sum += array[i];
        }

        System.out.println(sum);
        System.out.println(sum / length);
    }
}