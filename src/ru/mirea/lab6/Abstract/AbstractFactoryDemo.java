package ru.mirea.lab6.Abstract;

public class AbstractFactoryDemo {
    public static void main(String[] args) {
        Application application = new Application(new WinFactory());
        application.paint();

        application = new Application(new MacFactory());
        application.paint();
    }
}
