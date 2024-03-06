package ru.mirea.lab7.Flyweight;

public class FlyweightTest {
    public static void main(String[] args) {
        CoffeeFlavorFactory flavorFactory = new CoffeeFlavorFactory();

        CoffeeFlavor flavor1 = flavorFactory.getCoffeeFlavor("Латте");
        CoffeeFlavor flavor2 = flavorFactory.getCoffeeFlavor("Эспрессо");
        CoffeeFlavor flavor3 = flavorFactory.getCoffeeFlavor("Латте");

        System.out.println("Всего создано видов кофе: " + flavorFactory.getTotalCoffeeFlavorsMade());
    }
}
