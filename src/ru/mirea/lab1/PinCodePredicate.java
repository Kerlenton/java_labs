package ru.mirea.lab1;

import java.util.function.Predicate;

public class PinCodePredicate implements Predicate<String> {
    @Override
    public boolean test(String pin) {
        return pin.matches("^\\d{4}$|^\\d{6}$");
    }
}