package ru.mirea.lab41.task2;

public class Phone {
    private String number;
    private String model;
    private double weight;

    public Phone(String number, String model, double weight) {
        this.number = number;
        this.model = model;
        this.weight = weight;
    }

    public Phone(String number, String model) {
        this.number = number;
        this.model = model;
    }

    public Phone() {
        // пустой конструктор
    }

    public void receiveCall(String callerName) {
        System.out.println("Звонит " + callerName);
    }

    public String getNumber() {
        return number;
    }

    public void receiveCall(String callerName, String callerNumber) {
        System.out.println("Звонит " + callerName + ", номер телефона: " + callerNumber);
    }

    public void sendMessage(String... numbers) {
        System.out.println("Отправляется сообщение на номера: ");
        for (String number : numbers) {
            System.out.println(number);
        }
    }

    public void printInfo() {
        System.out.println("Номер телефона: " + number);
        System.out.println("Модель: " + model);
        System.out.println("Вес: " + weight);
    }
}
