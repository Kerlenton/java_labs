package ru.mirea.lab4;

public class TestClothes {
    public static void main(String[] args) {
        Clothes[] clothes = new Clothes[4];

        clothes[0] = new TShirt(Size.XXS, 1, "red");
        clothes[1] = new Pants(Size.XXS, 1, "green");
        clothes[2] = new Skirt(Size.XXS, 1, "yellow");
        clothes[3] = new Tie(Size.XXS, 1, "black");

        Atelier atelier = new Atelier();
        atelier.dressWomen(clothes);
        System.out.println();
        atelier.dressMan(clothes);
    }
}
