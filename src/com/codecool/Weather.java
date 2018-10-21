package com.codecool;
import java.util.Random;

public class Weather {
    private static boolean isRaining = false;

    static void setRaining() {
        Random rand = new Random();
        isRaining = rand.nextInt(100) + 1 <= 30;
    }

    static boolean isRaining() {
        return isRaining;
    }
}
