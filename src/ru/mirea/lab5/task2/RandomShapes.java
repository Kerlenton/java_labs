package ru.mirea.lab5.task2;

import javax.swing.*;
import java.awt.*;
import java.util.Random;

public class RandomShapes extends JFrame {
    private Shape[] shapes;

    public RandomShapes() {
        setTitle("Random Shapes");
        setSize(400, 400);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLocationRelativeTo(null);

        // Создание массива фигур
        shapes = new Shape[20];
        Random random = new Random();
        for (int i = 0; i < 20; i++) {
            // Случайный выбор между прямоугольником и кругом
            if (random.nextBoolean()) {
                shapes[i] = new Rectangle();
            } else {
                shapes[i] = new Circle();
            }
        }
    }

    @Override
    public void paint(Graphics g) {
        super.paint(g);
        for (Shape shape : shapes) {
            shape.draw(g);
        }
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(() -> {
            RandomShapes randomShapes = new RandomShapes();
            randomShapes.setVisible(true);
        });
    }
}
