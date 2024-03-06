package ru.mirea.lab6.Factory;

public class FactoryMethodDemo {
    public static void main(String[] args) {
        Application app = new WordApplication();
        app.newDocument();

        app = new ExcelApplication();
        app.newDocument();
    }
}
