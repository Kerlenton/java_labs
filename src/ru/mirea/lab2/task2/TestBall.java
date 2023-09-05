package ru.mirea.lab2.task2;

public class TestBall {
    public static void main(String[] args) {
        Ball ball = new Ball(1.2, 2.1);

        double x = ball.getX();
        double y = ball.getY();

        System.out.println(ball.toString());
    }
}