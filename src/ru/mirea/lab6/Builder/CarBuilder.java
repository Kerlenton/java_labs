package ru.mirea.lab6.Builder;

interface CarBuilder {
    void buildWheels();
    void buildEngine();
    void buildBody();
    Car getCar();
}
