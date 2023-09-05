package ru.mirea.lab1;

import java.util.Scanner;

public class task2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Введите рамер массива: ");

        int length = sc.nextInt();
        double[] array = new double[length];
        double sum = 0;
        int i = 0;

        Double mx = Double.MIN_VALUE;
        Double mn = Double.MAX_VALUE;

        while (i < length) {
            array[i] = sc.nextDouble();
            sum += array[i];
            mx = Double.max(mx, array[i]);
            mn = Double.min(mn, array[i]);
            ++i;
        }

        System.out.println(sum);
        System.out.println(mx);
        System.out.println(mn);
    }
}