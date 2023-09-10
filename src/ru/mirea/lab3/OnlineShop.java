package ru.mirea.lab3;

import java.util.Scanner;

public class OnlineShop {
    private double exchangeRate;

    // Конструктор класса, принимающий курс валюты
    public OnlineShop(double exchangeRate) {
        this.exchangeRate = exchangeRate;
    }

    // Метод для расчета стоимости покупки в выбранной валюте
    public double calculatePrice(double price, String currency) {
        if (currency.equalsIgnoreCase("USD")) {
            return price * exchangeRate;
        } else {
            return price;
        }
    }

    public static void main(String[] args) {
        OnlineShop shop = new OnlineShop(1.07); // Создаем объект интернет-магазина с курсом 1 евро = 1.17 доллара

        Scanner scanner = new Scanner(System.in);

        System.out.print("Введите стоимость товара: ");
        double price = scanner.nextDouble();

        System.out.print("Введите валюту для оплаты (USD или EUR): ");
        String currency = scanner.next();

        double totalPrice = shop.calculatePrice(price, currency); // Расчет стоимости покупки в выбранной валюте

        System.out.println("Стоимость покупки: " + totalPrice + " " + currency);
    }
}
