package ru.mirea.lab3;

public class CurrencyConverter {
    private double exchangeRate;

    // Конструктор класса, принимающий курс валюты
    public CurrencyConverter(double exchangeRate) {
        this.exchangeRate = exchangeRate;
    }

    // Метод для конвертации суммы из одной валюты в другую
    public double convert(double amount) {
        return amount * exchangeRate;
    }

    // Метод для изменения курса валюты
    public void setExchangeRate(double exchangeRate) {
        this.exchangeRate = exchangeRate;
    }

    // Метод для получения текущего курса валюты
    public double getExchangeRate() {
        return exchangeRate;
    }

    public static void main(String[] args) {
        CurrencyConverter converter = new CurrencyConverter(1.07); // Создаем объект конвертера с курсом 1 евро = 1.17 доллара

        double amountInEuro = 100; // Сумма в евро
        double amountInDollars = converter.convert(amountInEuro); // Конвертируем сумму из евро в доллары

        System.out.println(amountInEuro + " евро = " + amountInDollars + " долларов");

        converter.setExchangeRate(1.2); // Изменяем курс валюты

        amountInDollars = converter.convert(amountInEuro); // Конвертируем сумму из евро в доллары с новым курсом

        System.out.println(amountInEuro + " евро = " + amountInDollars + " долларов");
    }
}
