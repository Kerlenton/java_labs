package ru.mirea.lab6.Factory;

class WordDocument implements Document {
    @Override
    public void open() {
        System.out.println("Открыт документ Word");
    }

    @Override
    public void close() {
        System.out.println("Закрыт документ Word");
    }
}
