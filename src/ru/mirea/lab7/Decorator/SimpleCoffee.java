package ru.mirea.lab7.Decorator;

class SimpleCoffee implements Coffee {
    public String getDescription() {
        return "Простой кофе";
    }

    public double getCost() {
        return 10;
    }
}
