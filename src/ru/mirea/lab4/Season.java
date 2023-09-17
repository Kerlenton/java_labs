package ru.mirea.lab4;

public enum Season {
    SPRING(15),
    SUMMER(25),
    AUTUMN(10),
    WINTER(0);

    private int averageTemperature;

    Season(int averageTemperature) {
        this.averageTemperature = averageTemperature;
    }

    public int getAverageTemperature() {
        return averageTemperature;
    }

    public String getDescription() {
        switch (this) {
            case SPRING:
                return "Теплое время года";
            case SUMMER:
                return "Теплое время года";
            case AUTUMN:
                return "Холодное время года";
            case WINTER:
                return "Холодное время года";
            default:
                return "Неизвестное время года";
        }
    }

    public static void main(String[] args) {
        Season favoriteSeason = Season.SUMMER;
        System.out.println("Любимое время года: " + favoriteSeason);
        System.out.println("Средняя температура: " + favoriteSeason.getAverageTemperature() + "°C");
        System.out.println("Описание: " + favoriteSeason.getDescription());

        System.out.println("--- Все времена года ---");
        for (Season season : Season.values()) {
            System.out.println("Время года: " + season);
            System.out.println("Средняя температура: " + season.getAverageTemperature() + "°C");
            System.out.println("Описание: " + season.getDescription());
            System.out.println();
        }
    }
}
