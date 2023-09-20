package ru.mirea.lab41.task6;

public class Main {
    public static void main(String[] args) {
        Employer employer = new Manager("John", "Doe", 50000, 20000);

        System.out.println("Income: " + employer.getIncome());
    }
}