package ru.mirea.lab6.Factory;

class ExcelDocument implements Document {
    @Override
    public void open() {
        System.out.println("Открыт документ Excel");
    }

    @Override
    public void close() {
        System.out.println("Закрыт документ Excel");
    }
}
