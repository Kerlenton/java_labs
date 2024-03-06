package ru.mirea.lab6.Builder;

class CarDirector {
    private CarBuilder builder;

    public CarDirector(CarBuilder builder) {
        this.builder = builder;
    }

    public Car construct() {
        builder.buildBody();
        builder.buildEngine();
        builder.buildWheels();
        return builder.getCar();
    }
}
