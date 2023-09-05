package ru.mirea.lab2.task1;

public class TestAuthor {
    public static void main(String[] args) {
        Author Person1 = new Author("Alice", "alice@mail.ru", 'w');
        Author Person2 = new Author("Bob", "bov@mail.ru", 'm');

        String name1 = Person1.getName();
        String name2 = Person2.getName();

        String email1 = Person1.getEmail();
        String email2 = Person2.getEmail();

        char gender1 = Person1.getGender();
        char gender2 = Person2.getGender();

        Person2.setEmail("bob@mail.ru");

        System.out.println(Person1.toString());
        System.out.println(Person2.toString());
    }
}
