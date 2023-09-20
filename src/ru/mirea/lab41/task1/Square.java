package ru.mirea.lab41.task1;

import ru.mirea.lab41.task1.Rectangle;

public class Square extends Rectangle {
    public Square(double side) {
        super(side, side);
    }

    @Override
    public String getType() {
        return "Square";
    }
}
