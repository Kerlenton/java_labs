package ru.mirea.lab4;

class TShirt extends Clothes implements MenClothing, WomenClothing {
    public TShirt(Size size, double cost, String color) {
        this.size = size;
        this.cost = cost;
        this.color = color;
    }

    @Override
    public void dressMan() {
        System.out.println("Одеваем мужчину в футболку размера " + size +
                ", стоимостью " + cost + " и цветом " + color);
    }

    @Override
    public void dressWomen() {
        System.out.println("Одеваем женщину в футболку размера " + size +
                ", стоимостью " + cost + " и цветом " + color);
    }
}
