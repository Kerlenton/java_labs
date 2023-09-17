package ru.mirea.lab4.task2;

import java.util.HashMap;
import java.util.Map;

public class Products {
    public static void main(String[] args) {
        Map<String, String> catalogProducts = new HashMap<>();
        catalogProducts.put("Электроника", "Телефон, Ноутбук, Телевизор");
        catalogProducts.put("Одежда", "Футболка, Джинсы, Платье");
        catalogProducts.put("Косметика", "Помада, Лак для ногтей, Масло для тела");

        String selectedCatalog = "Электроника";
        // Вывод списка товаров определенного каталога
        System.out.println(catalogProducts.get(selectedCatalog));
    }
}
