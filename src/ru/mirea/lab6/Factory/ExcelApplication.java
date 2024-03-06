package ru.mirea.lab6.Factory;

class ExcelApplication extends Application {
    @Override
    Document createDocument() {
        return new ExcelDocument();
    }
}
