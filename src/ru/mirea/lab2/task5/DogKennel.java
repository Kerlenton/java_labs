package ru.mirea.lab2.task5;

import java.util.Arrays;

public class DogKennel {
    private Dog[] dogs;

    public DogKennel() {
        dogs = new Dog[0];
    }

    public void addDog(Dog dog) {
        Dog[] temp = new Dog[dogs.length + 1];
        for (int i = 0; i < dogs.length; i++) {
            temp[i] = dogs[i];
        }
        temp[dogs.length] = dog;
        dogs = temp;
    }

    @Override
    public String toString() {
        return "DogKennel{" +
                "dogs=" + Arrays.toString(dogs) +
                '}';
    }

    public static void main(String[] args) {
        Dog dog1 = new Dog("Бобик", 3);
        Dog dog2 = new Dog("Шарик", 5);
        Dog dog3 = new Dog("Тузик", 2);

        DogKennel kennel = new DogKennel();
        kennel.addDog(dog1);
        kennel.addDog(dog2);
        kennel.addDog(dog3);

        System.out.println(kennel);
    }
}