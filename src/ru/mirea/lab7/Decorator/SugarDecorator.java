package ru.mirea.lab7.Decorator;

class SugarDecorator extends CoffeeDecorator {
    public SugarDecorator(Coffee coffee) {
        super(coffee);
    }

    public String getDescription() {
        return super.getDescription() + ", с сахаром";
    }

    public double getCost() {
        return super.getCost() + 1;
    }
}
