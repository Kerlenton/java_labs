package ru.mirea.lab8;

class ConcreteClass extends AbstractClass {
    // Реализация абстрактных методов
    @Override
    protected void primitiveOperation1() {
        System.out.println("ConcreteClass primitiveOperation1()");
    }

    @Override
    protected void primitiveOperation2() {
        System.out.println("ConcreteClass primitiveOperation2()");
    }
}
