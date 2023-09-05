package ru.mirea.lab2.task7;

public class BookShelfTest {
    public static void main(String[] args) {
        BookShelf bookshelf = new BookShelf(5);

        bookshelf.addBook(new Book("J.K. Rowling", "Harry Potter and the Philosopher's Stone", 1997));
        bookshelf.addBook(new Book("J.R.R. Tolkien", "The Hobbit", 1937));
        bookshelf.addBook(new Book("George Orwell", "1984", 1949));
        bookshelf.addBook(new Book("Jane Austen", "Pride and Prejudice", 1813));
        bookshelf.addBook(new Book("Charles Dickens", "Oliver Twist", 1838));

        System.out.println("Earliest book: " + bookshelf.getEarliestBook().getTitle() + " (" + bookshelf.getEarliestBook().getYear() + ")");
        System.out.println("Latest book: " + bookshelf.getLatestBook().getTitle() + " (" + bookshelf.getLatestBook().getYear() + ")");

        bookshelf.sortBooksByYear();

        System.out.println("\nBooks sorted by year:");
        for (int i = 0; i < bookshelf.getCount(); i++) {
            System.out.println(bookshelf.getBooks()[i].getTitle() + " (" + bookshelf.getBooks()[i].getYear() + ")");
        }
    }
}
