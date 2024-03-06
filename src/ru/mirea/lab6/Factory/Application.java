package ru.mirea.lab6.Factory;

abstract class Application {
    public void newDocument() {
        Document doc = createDocument();
        doc.open();
    }

    abstract Document createDocument();
}