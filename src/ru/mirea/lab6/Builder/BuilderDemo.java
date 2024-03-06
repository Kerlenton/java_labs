package ru.mirea.lab6.Builder;

public class BuilderDemo {
    public static void main(String[] args) {
        CarBuilder builder = new ConcreteCarBuilder();
        CarDirector director = new CarDirector(builder);

        Car car = director.construct();
        System.out.println(car);
    }
}
