package ru.mirea.lab4.task2;

import java.util.Scanner;

public class Authentication {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Введите логин: ");
        String login = scanner.nextLine();
        System.out.print("Введите пароль: ");
        String password = scanner.nextLine();

        // Проверка сочетания логина и пароля
        if (login.equals("admin") && password.equals("password")) {
            System.out.println("Аутентификация прошла успешно");
            // Установка сессии для пользователя
        } else {
            System.out.println("Неверный логин или пароль");
        }
    }
}
