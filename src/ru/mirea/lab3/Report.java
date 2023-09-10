package ru.mirea.lab3;

public class Report {
    public static void generateReport(Employee[] employees) {
        System.out.println("Отчет о сотрудниках:");
        System.out.printf("%-20s %10s\n", "ФИО", "Зарплата");
        System.out.println("--------------------");

        for (Employee employee : employees) {
            System.out.printf("%-20s %,10.2f\n", employee.getFullname(), employee.getSalary());
        }
    }

    public static void main(String[] args) {
        Employee[] employees = new Employee[3];
        employees[0] = new Employee("Иванов Иван", 2500.50);
        employees[1] = new Employee("Петров Петр", 1800.00);
        employees[2] = new Employee("Сидоров Алексей", 3000.75);

        generateReport(employees);
    }
}
