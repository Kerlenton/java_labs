package ru.mirea.lab6.Prototype;

class Rectangle extends Shape {

    public Rectangle() {
        type = "Прямоугольник";
    }

    @Override
    void draw() {
        System.out.println("Внутри Rectangle::draw() метод.");
    }
}
