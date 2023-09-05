package ru.mirea.lab2.task4;

import java.util.Scanner;

public class TestShop {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Shop shop = new Shop();

        while (true) {
            System.out.println("Введите бренд компьютера или 'stop' для завершения ввода:");
            String brand = scanner.nextLine();
            if (brand.equalsIgnoreCase("stop")) {
                break;
            }

            System.out.println("Введите модель компьютера:");
            String model = scanner.nextLine();

            System.out.println("Введите цену компьютера:");
            int price = scanner.nextInt();
            scanner.nextLine();

            System.out.println("Введите название процессора компьютера:");
            String cpu = scanner.nextLine();

            System.out.println("Введите название оперативной памяти компьютера:");
            String ram = scanner.nextLine();

            Computer computer = new Computer(brand, model, price, cpu, ram);
            shop.addComputer(computer);
        }

        if (shop.searchByBrand("Apple") != null)
            System.out.println(shop.searchByBrand("Apple").getModel());
        else
            System.out.println("Not found");
    }
}
