package ru.mirea.lab6.Builder;

class ConcreteCarBuilder implements CarBuilder {
    private Car car;

    public ConcreteCarBuilder() {
        this.car = new Car();
    }

    public void buildWheels() {
        car.setWheels("Обычные колеса");
    }

    public void buildEngine() {
        car.setEngine("Обычный двигатель");
    }

    public void buildBody() {
        car.setBody("Обычный кузов");
    }

    public Car getCar() {
        return car;
    }
}
