package ru.mirea.lab4.task2;

import java.util.ArrayList;
import java.util.List;

public class Catalog {
    public static void main(String[] args) {
        List<String> catalogs = new ArrayList<>();
        catalogs.add("Электроника");
        catalogs.add("Одежда");
        catalogs.add("Косметика");

        // Вывод списка каталогов
        for (String catalog : catalogs) {
            System.out.println(catalog);
        }
    }
}
