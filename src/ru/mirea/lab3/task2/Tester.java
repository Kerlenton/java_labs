package ru.mirea.lab3.task2;

import java.util.Arrays;
import java.util.Random;

public class Tester {
    private Circle[] circles;
    private int count;

    public Tester(int size) {
        circles = new Circle[size];
        count = 0;
    }

    public void addCircle(Circle circle) {
        circles[count] = circle;
        count++;
    }

    public int getCount() {
        return count;
    }

    public Circle getSmallestCircle() {
        if (count == 0) {
            return null;
        }
        Circle smallestCircle = circles[0];
        for (int i = 1; i < count; i++) {
            if (circles[i].getRadius() < smallestCircle.getRadius()) {
                smallestCircle = circles[i];
            }
        }
        return smallestCircle;
    }

    public Circle getLargestCircle() {
        if (count == 0) {
            return null;
        }
        Circle largestCircle = circles[0];
        for (int i = 1; i < count; i++) {
            if (circles[i].getRadius() > largestCircle.getRadius()) {
                largestCircle = circles[i];
            }
        }
        return largestCircle;
    }

    public void sortCirclesByRadius() {
        Arrays.sort(circles, 0, count, (c1, c2) -> Double.compare(c1.getRadius(), c2.getRadius()));
    }

    public static void main(String[] args) {
        Tester tester = new Tester(10);
        Random random = new Random();
        for (int i = 0; i < 10; i++) {
            Point center = new Point(random.nextDouble(), random.nextDouble());
            double radius = random.nextDouble();
            Circle circle = new Circle(center, radius);
            tester.addCircle(circle);
        }
        System.out.println("Исходный массив:");
        for (int i = 0; i < tester.getCount(); i++) {
            System.out.println(tester.circles[i].getRadius());
        }
        System.out.println("Самая маленькая окружность: " + tester.getSmallestCircle().getRadius());
        System.out.println("Самая большая окружность: " + tester.getLargestCircle().getRadius());
        tester.sortCirclesByRadius();
        System.out.println("Отсортированный массив:");
        for (int i = 0; i < tester.getCount(); i++) {
            System.out.println(tester.circles[i].getRadius());
        }
    }
}