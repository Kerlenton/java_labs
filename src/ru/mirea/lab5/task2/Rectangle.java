package ru.mirea.lab5.task2;

import java.awt.*;
import java.util.Random;

class Rectangle extends Shape {
    private int width;
    private int height;

    public Rectangle() {
        super();
        Random random = new Random();
        // Генерирование случайной ширины и высоты
        this.width = random.nextInt(100) + 10;
        this.height = random.nextInt(100) + 10;
    }

    @Override
    public void draw(Graphics g) {
        g.setColor(this.color);
        g.fillRect(this.x, this.y, this.width, this.height);
    }
}
