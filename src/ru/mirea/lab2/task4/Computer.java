package ru.mirea.lab2.task4;

public class Computer {
    private String brand;
    private String model;
    private int price;
    private String cpu;
    private String ram;

    public Computer(String brand, String model, int price, String cpu, String ram) {
        this.brand = brand;
        this.model = model;
        this.price = price;
        this.cpu = cpu;
        this.ram = ram;
    }

    public String getBrand() {
        return brand;
    }

    public String getModel() {
        return model;
    }

    public int getPrice() {
        return price;
    }

    public String getCPU() {
        return cpu;
    }

    public String getRAM() {
        return ram;
    }
}
