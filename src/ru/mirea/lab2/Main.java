package ru.mirea.lab2;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<Human> humans = new ArrayList<>();
        humans.add(new Human(80, "John", "Doe", LocalDate.of(1997, 6, 12), 70));
        humans.add(new Human(30, "Alice", "Smith", LocalDate.of(1992, 9, 1), 65));
        humans.add(new Human(20, "Bob", "Johnson", LocalDate.of(2002, 3, 25), 80));
        humans.add(new Human(35, "Emily", "Brown", LocalDate.of(1987, 12, 5), 75));

        System.out.println("Исходный список:");
        humans.forEach(System.out::println);

        List<Human> filteredList = humans.stream().filter(h -> h.getWeight() > h.getAge()).toList();
        System.out.println("\nСписок после фильтрации по признаку «вес больше, чем возраст»:");
        filteredList.forEach(System.out::println);

        List<Human> sortedList = humans.stream()
                .sorted(Comparator.comparing(Human::getLastName).reversed())
                .toList();
        System.out.println("\nСписок после сортировки по фамилии в обратном порядке:");
        sortedList.forEach(System.out::println);

        int totalWeight = humans.stream().mapToInt(Human::getWeight).sum();
        System.out.println("\nСумма всех весов: " + totalWeight);
    }
}