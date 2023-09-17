package ru.mirea.lab4.task2;

import java.util.ArrayList;
import java.util.List;

public class Purchase {
    public static void main(String[] args) {
        List<String> shoppingCart = new ArrayList<>();
        shoppingCart.add("Телефон");
        shoppingCart.add("Футболка");
        shoppingCart.add("Помада");

        // Вывод списка товаров в корзине
        for (String item : shoppingCart) {
            System.out.println("Товар: " + item);
        }

        // Здесь можно добавить дополнительную логику для оформления заказа
    }
}
