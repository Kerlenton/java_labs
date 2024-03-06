package ru.mirea.lab6.Factory;

class WordApplication extends Application {
    @Override
    Document createDocument() {
        return new WordDocument();
    }
}
