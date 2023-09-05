package ru.mirea.lab2.task7;

import java.util.Arrays;

public class BookShelf {
    private Book[] books;
    private int count;

    public BookShelf(int capacity) {
        books = new Book[capacity];
        count = 0;
    }

    public void addBook(Book book) {
        if (count < books.length) {
            books[count++] = book;
        } else {
            System.out.println("The bookshelf is full!");
        }
    }

    public Book getEarliestBook() {
        if (count == 0) {
            return null;
        }
        Book earliestBook = books[0];
        for (int i = 1; i < count; i++) {
            if (books[i].getYear() < earliestBook.getYear()) {
                earliestBook = books[i];
            }
        }
        return earliestBook;
    }

    public Book getLatestBook() {
        if (count == 0) {
            return null;
        }
        Book latestBook = books[0];
        for (int i = 1; i < count; i++) {
            if (books[i].getYear() > latestBook.getYear()) {
                latestBook = books[i];
            }
        }
        return latestBook;
    }

    public void sortBooksByYear() {
        Arrays.sort(books, 0, count, (b1, b2) -> Integer.compare(b1.getYear(), b2.getYear()));
    }

    public int getCount() {
        return count;
    }

    public Book[] getBooks() {
        return books;
    }
}
