package ru.mirea.lab41.task2;

public class PhoneTester {
    public static void main(String[] args) {
        Phone phone1 = new Phone("123456789", "Nokia", 100.0);
        Phone phone2 = new Phone("987654321", "Samsung", 150.0);
        Phone phone3 = new Phone("456789123", "iPhone");

        // Вывод значений переменных
        phone1.printInfo();
        System.out.println();
        phone2.printInfo();
        System.out.println();
        phone3.printInfo();
        System.out.println();

        // Методы receiveCall и getNumber
        phone1.receiveCall("John");
        System.out.println("Номер телефона: " + phone1.getNumber());

        phone2.receiveCall("Alice");
        System.out.println("Номер телефона: " + phone2.getNumber());

        phone3.receiveCall("Bob");
        System.out.println("Номер телефона: " + phone3.getNumber());

        System.out.println();

        // Перегруженный метод receiveCall
        phone1.receiveCall("Mark", "987654321");
        phone2.receiveCall("Emily", "123456789");
        phone3.receiveCall("David", "456789123");

        System.out.println();

        // Метод sendMessage
        phone1.sendMessage("987654321", "456789123");
        phone2.sendMessage("123456789", "456789123", "987654321");
        phone3.sendMessage("123456789");

    }
}
