package ru.mirea.lab7.Decorator;

class MilkDecorator extends CoffeeDecorator {
    public MilkDecorator(Coffee coffee) {
        super(coffee);
    }

    public String getDescription() {
        return super.getDescription() + ", с молоком";
    }

    public double getCost() {
        return super.getCost() + 2;
    }
}
