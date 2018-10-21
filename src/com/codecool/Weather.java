package com.codecool;
import java.util.Random;

class Weather {
    private static boolean isRaining = false;

    static void setRaining() {
        Random rand = new Random();
        isRaining = rand.nextInt(100) + 1 <= 30;
        if (isRaining) {
            System.out.println("Raining!");
        }
    }

    static boolean isRaining() {
        return isRaining;
    }
}
