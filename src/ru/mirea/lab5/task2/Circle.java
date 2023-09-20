package ru.mirea.lab5.task2;

import java.awt.*;
import java.util.Random;

class Circle extends Shape {
    private int radius;

    public Circle() {
        super();
        Random random = new Random();
        // Генерирование случайного радиуса
        this.radius = random.nextInt(50) + 10;
    }

    @Override
    public void draw(Graphics g) {
        g.setColor(this.color);
        g.fillOval(this.x, this.y, this.radius * 2, this.radius * 2);
    }
}