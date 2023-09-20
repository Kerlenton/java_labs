package ru.mirea.lab5.task2;

import java.awt.*;
import java.util.Random;

abstract class Shape {
    protected Color color;
    protected int x;
    protected int y;

    public Shape() {
        Random random = new Random();
        // Генерирование случайного цвета
        int r = random.nextInt(256);
        int g = random.nextInt(256);
        int b = random.nextInt(256);
        this.color = new Color(r, g, b);
        // Генерирование случайной позиции на экране
        this.x = random.nextInt(300);
        this.y = random.nextInt(300);
    }

    abstract void draw(Graphics g);
}
