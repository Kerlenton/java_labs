package ru.mirea.lab3;

public class task5 {
    public static void main(String[] args) {
        // Создаем объекты класса Double с помощью метода valueOf()
        Double number1 = Double.valueOf(3.14);
        Double number2 = Double.valueOf("2.718");

        // Преобразуем значение типа String к типу double с помощью метода Double.parseDouble()
        String str = "1.618";
        double number3 = Double.parseDouble(str);

        // Преобразуем объект класса Double ко всем примитивным типам
        double primitiveDouble = number1.doubleValue();
        float primitiveFloat = number2.floatValue();
        int primitiveInt = number1.intValue();
        long primitiveLong = number2.longValue();
        short primitiveShort = number1.shortValue();
        byte primitiveByte = number2.byteValue();

        // Выводим значение объекта Double на консоль
        System.out.println("Number 1: " + number1);
        System.out.println("Number 2: " + number2);

        // Преобразуем литерал типа double к строке с помощью метода Double.toString()
        String doubleAsString = Double.toString(3.14);
        System.out.println("Double as String: " + doubleAsString);
    }
}
