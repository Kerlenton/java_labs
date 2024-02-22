package ru.mirea.lab3;

import java.util.List;
import java.util.Map;

public class Main {
    public static void main(String[] args) {
        // Тестирование класса ThreadSafeList
        List<Integer> threadSafeList = new ThreadSafeList<>();

        Thread writerThread = new Thread(() -> {
            for (int i = 0; i < 10; i++) {
                threadSafeList.add(i);
                System.out.println("Added element: " + i);
                try {
                    Thread.sleep(500);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        });

        Thread readerThread = new Thread(() -> {
            while (!threadSafeList.isEmpty()) {
                int element = threadSafeList.remove(0);
                System.out.println("Removed element: " + element);
                try {
                    Thread.sleep(1000);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        });

        writerThread.start();
        readerThread.start();

        try {
            writerThread.join();
            readerThread.join();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        // Тестирование класса ThreadSafeMap
        Map<String, Integer> threadSafeMap = new ThreadSafeMap<>();

        threadSafeMap.put("one", 1);
        threadSafeMap.put("two", 2);
        threadSafeMap.put("three", 3);

        System.out.println("Size of map: " + threadSafeMap.size());

        threadSafeMap.remove("two");
        System.out.println("Size of map after removal: " + threadSafeMap.size());
    }
}