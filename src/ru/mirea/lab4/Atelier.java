package ru.mirea.lab4;

class Atelier {
    public void dressWomen(Clothes[] clothes) {
        System.out.println("Женская одежда:");
        for (Clothes item : clothes) {
            if (item instanceof WomenClothing) {
                WomenClothing clothing = (WomenClothing) item;
                clothing.dressWomen();
            }
        }
    }

    public void dressMan(Clothes[] clothes) {
        System.out.println("Мужская одежда:");
        for (Clothes item : clothes) {
            if (item instanceof MenClothing) {
                MenClothing clothing = (MenClothing) item;
                clothing.dressMan();
            }
        }
    }
}
