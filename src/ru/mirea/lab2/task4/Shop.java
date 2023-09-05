package ru.mirea.lab2.task4;

import java.util.ArrayList;
import java.util.function.Predicate;

public class Shop {
    private ArrayList<Computer> computers;

    public Shop() {
        computers = new ArrayList<>();
    }

    public void addComputer(Computer computer) {
        computers.add(computer);
    }

    public void removeComputer(Computer computer) {
        computers.remove(computer);
    }

    public Computer findComputer(Predicate<Computer> criteria) {
        for (Computer computer : computers) {
            if (criteria.test(computer)) {
                return computer;
            }
        }
        return null;
    }

    public Computer searchByPrice(int price) {
        return findComputer(c -> c.getPrice() == price);
    }

    public Computer searchByBrand(String brand) {
        return findComputer(c -> c.getBrand().equals(brand));
    }

    public Computer searchByModel(String model) {
        return findComputer(c -> c.getModel().equals(model));
    }

    public Computer searchByCPU(String cpu) {
        return findComputer(c -> c.getCPU().equals(cpu));
    }

    public Computer searchByRAM(String ram) {
        return findComputer(c -> c.getRAM().equals(ram));
    }
}