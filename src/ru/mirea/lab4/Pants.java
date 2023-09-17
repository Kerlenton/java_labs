package ru.mirea.lab4;

class Pants extends Clothes implements MenClothing, WomenClothing {
    public Pants(Size size, double cost, String color) {
        this.size = size;
        this.cost = cost;
        this.color = color;
    }

    @Override
    public void dressMan() {
        System.out.println("Одеваем мужчину в штаны размера " + size +
                ", стоимостью " + cost + " и цветом " + color);
    }

    @Override
    public void dressWomen() {
        System.out.println("Одеваем женщину в штаны размера " + size +
                ", стоимостью " + cost + " и цветом " + color);
    }
}
