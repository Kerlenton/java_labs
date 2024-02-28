package ru.mirea.lab5;

public class SingletonTest {
    public static void main(String[] args) {
        // Тестирование SingletonEager
        SingletonEager eagerInstance1 = SingletonEager.getInstance();
        SingletonEager eagerInstance2 = SingletonEager.getInstance();

        System.out.println("SingletonEager Instances Equal: " + (eagerInstance1 == eagerInstance2));

        // Тестирование SingletonDoubleChecked
        SingletonDoubleChecked enumInstance1 = SingletonDoubleChecked.getInstance();
        SingletonDoubleChecked enumInstance2 = SingletonDoubleChecked.getInstance();

        System.out.println("SingletonEnum Instances Equal: " + (enumInstance1 == enumInstance2));

        // Тестирование SingletonLazy
        SingletonLazy lazyInstance1 = SingletonLazy.getInstance();
        SingletonLazy lazyInstance2 = SingletonLazy.getInstance();

        System.out.println("SingletonLazy Instances Equal: " + (lazyInstance1 == lazyInstance2));
    }
}
