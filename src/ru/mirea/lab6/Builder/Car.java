package ru.mirea.lab6.Builder;

class Car {
    private String wheels;
    private String engine;
    private String body;

    public void setWheels(String wheels) {
        this.wheels = wheels;
    }

    public void setEngine(String engine) {
        this.engine = engine;
    }

    public void setBody(String body) {
        this.body = body;
    }

    @Override
    public String toString() {
        return "Car{" +
                "wheels='" + wheels + '\'' +
                ", engine='" + engine + '\'' +
                ", body='" + body + '\'' +
                '}';
    }
}
