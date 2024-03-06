package ru.mirea.lab6.Prototype;

class Square extends Shape {

    public Square() {
        type = "Квадрат";
    }

    @Override
    void draw() {
        System.out.println("Внутри Square::draw() метод.");
    }
}
