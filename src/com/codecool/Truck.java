package com.codecool;
import java.util.Random;

class Truck extends Vehicle{
    private int breakdownTurnsLeft = 0;
    void breakdown() {
        Random rand = new Random();
        if (rand.nextInt(100) + 1 <= 5) {
            breakdownTurnsLeft = 2;
            setSpeed(0);
        }
    }

    Truck() {
        setSpeed(100);
        Random rand = new Random();
        setName(String.valueOf(rand.nextInt(1001)));

    }
}
