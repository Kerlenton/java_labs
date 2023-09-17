package ru.mirea.lab4.task2;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class ShoppingCart {
    public static void main(String[] args) {
        List<String> items = new ArrayList<>();

        Scanner scanner = new Scanner(System.in);
        System.out.print("Введите название товара: ");
        String item = scanner.nextLine();

        // Добавление выбранного товара в корзину
        items.add(item);
    }
}
