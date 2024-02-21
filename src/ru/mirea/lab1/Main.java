package ru.mirea.lab1;

import java.util.function.Predicate;

public class Main {
    public static void main(String[] args) {
        Predicate<String> pinCodePredicate = new PinCodePredicate();

        String pin1 = "1234";
        System.out.println(pinCodePredicate.test(pin1)); // true

        String pin2 = "987654";
        System.out.println(pinCodePredicate.test(pin2)); // true

        String pin3 = "1";
        System.out.println(pinCodePredicate.test(pin3)); // false

        String pin4 = "ABCD";
        System.out.println(pinCodePredicate.test(pin4)); // false
    }
}
