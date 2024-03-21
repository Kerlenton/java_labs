package ru.mirea.lab8;

public class Main {
    public static void main(String[] args) {
        // Тестирование Шаблонного метода
        AbstractClass abstractClass = new ConcreteClass();
        abstractClass.templateMethod();

        // Тестирование Посетителя
        Element[] elements = {new ElementA(), new ElementB()};
        Visitor visitor = new ConcreteVisitor();
        for (Element element : elements) {
            element.accept(visitor);
        }
    }
}
