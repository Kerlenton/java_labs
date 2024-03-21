package ru.mirea.lab8;

// Шаблонный метод
abstract class AbstractClass {
    // Это метод, который предоставляет основной алгоритм
    public void templateMethod() {
        primitiveOperation1();
        primitiveOperation2();
        concreteOperation();
    }

    // Абстрактные методы, которые должны быть реализованы в подклассах
    protected abstract void primitiveOperation1();
    protected abstract void primitiveOperation2();

    // Метод с реализацией по умолчанию
    protected void concreteOperation() {
        System.out.println("Default implementation of concreteOperation()");
    }
}
