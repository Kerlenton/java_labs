package ru.mirea.lab41.task3;

public class PersonTester {
    public static void main(String[] args) {
        Person person1 = new Person();
        Person person2 = new Person("John Doe", 25);

        person1.move();
        person2.talk();
    }
}
