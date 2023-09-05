package ru.mirea.lab2.task6;

public class CircleTest {
    public static void main(String[] args) {
        Circle circle1 = new Circle(5);
        Circle circle2 = new Circle(7);

        System.out.println("Circle 1:");
        System.out.println("Radius: " + circle1.getRadius());
        System.out.println("Area: " + circle1.getArea());
        System.out.println("Circumference: " + circle1.getCircumference());

        System.out.println("\nCircle 2:");
        System.out.println("Radius: " + circle2.getRadius());
        System.out.println("Area: " + circle2.getArea());
        System.out.println("Circumference: " + circle2.getCircumference());

        System.out.println("\nCircle 1 equals Circle 2: " + circle1.equals(circle2));
        System.out.println("Circle 1 equals a new Circle with radius 5: " + circle1.equals(new Circle(5)));
    }
}
