package ru.mirea.lab4;

class Skirt extends Clothes implements WomenClothing {
    public Skirt(Size size, double cost, String color) {
        this.size = size;
        this.cost = cost;
        this.color = color;
    }

    @Override
    public void dressWomen() {
        System.out.println("Одеваем женщину в юбку размера " + size +
                ", стоимостью " + cost + " и цветом " + color);
    }
}

