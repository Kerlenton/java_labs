package ru.mirea.lab7.Decorator;

public class DecoratorTest {
    public static void main(String[] args) {
        Coffee simpleCoffee = new SimpleCoffee();
        System.out.println(simpleCoffee.getDescription() + " стоит " + simpleCoffee.getCost());

        Coffee milkCoffee = new MilkDecorator(new SimpleCoffee());
        System.out.println(milkCoffee.getDescription() + " стоит " + milkCoffee.getCost());

        Coffee fancyCoffee = new SugarDecorator(new MilkDecorator(new SimpleCoffee()));
        System.out.println(fancyCoffee.getDescription() + " стоит " + fancyCoffee.getCost());
    }
}
