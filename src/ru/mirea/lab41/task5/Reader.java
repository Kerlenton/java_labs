package ru.mirea.lab41.task5;

public class Reader {
    private String fullName;
    private String libraryCardNumber;
    private String faculty;
    private String dateOfBirth;
    private String phoneNumber;

    public Reader(String fullName, String libraryCardNumber, String faculty, String dateOfBirth, String phoneNumber) {
        this.fullName = fullName;
        this.libraryCardNumber = libraryCardNumber;
        this.faculty = faculty;
        this.dateOfBirth = dateOfBirth;
        this.phoneNumber = phoneNumber;
    }

    public void takeBook(int numberOfBooks) {
        System.out.println(fullName + " взял " + numberOfBooks + " книги");
    }

    public void takeBook(String... bookTitles) {
        String books = String.join(", ", bookTitles);
        System.out.println(fullName + " взял книги: " + books);
    }

    public void takeBook(Book... books) {
        StringBuilder sb = new StringBuilder();
        for (Book book : books) {
            sb.append(book.getTitle()).append(" (").append(book.getAuthor()).append(")").append(", ");
        }
        String bookList = sb.substring(0, sb.length() - 2);
        System.out.println(fullName + " взял книги: " + bookList);
    }

    public void returnBook(int numberOfBooks) {
        System.out.println(fullName + " вернул " + numberOfBooks + " книги");
    }

    public void returnBook(String... bookTitles) {
        String books = String.join(", ", bookTitles);
        System.out.println(fullName + " вернул книги: " + books);
    }

    public void returnBook(Book... books) {
        StringBuilder sb = new StringBuilder();
        for (Book book : books) {
            sb.append(book.getTitle()).append(" (").append(book.getAuthor()).append(")").append(", ");
        }
        String bookList = sb.substring(0, sb.length() - 2);
        System.out.println(fullName + " вернул книги: " + bookList);
    }
}
