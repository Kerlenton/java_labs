package ru.mirea.lab4;

class Tie extends Clothes implements MenClothing {
    public Tie(Size size, double cost, String color) {
        this.size = size;
        this.cost = cost;
        this.color = color;
    }

    @Override
    public void dressMan() {
        System.out.println("Одеваем мужчину в галстук размера " + size +
                ", стоимостью " + cost + " и цветом " + color);
    }
}