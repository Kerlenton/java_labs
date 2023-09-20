package ru.mirea.lab41.task5;

public class Main {
    public static void main(String args) {
        Reader reader1 = new Reader("Иванов Иван Иванович", "12345", "Математика", "01.01.1990", "123456789");
        Reader reader2 = new Reader("Петров Петр Петрович", "54321", "Физика", "02.02.1995", "987654321");

        Book book1 = new Book("Приключения", "Автор1");
        Book book2 = new Book("Словарь", "Автор2");
        Book book3 = new Book("Энциклопедия", "Автор3");

        reader1.takeBook(3);
        reader1.takeBook("Приключения", "Словарь", "Энциклопедия");
        reader1.takeBook(book1, book2, book3);

        reader2.returnBook(3);
        reader2.returnBook("Приключения", "Словарь", "Энциклопедия");
        reader2.returnBook(book1, book2, book3);
    }
}
