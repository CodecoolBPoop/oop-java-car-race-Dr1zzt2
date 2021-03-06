package com.codecool;
import java.util.Random;

class Truck extends Vehicle{
    private int breakdownTurnsLeft = 0;

    int getBreakdownTurnsLeft() {
        return breakdownTurnsLeft;
    }

    void setBreakdownTurnsLeft(int breakdownTurnsLeft) {
        this.breakdownTurnsLeft = breakdownTurnsLeft;
    }


    void breakdownRoll() {
        Random rand = new Random();
        if (rand.nextInt(100) + 1 <= 5) {
            setBreakdownTurnsLeft(2);
            setSpeedMax(0);
            System.out.println("Breakdown!");
        }
    }

    Truck() {
        setSpeed(100);
        Random rand = new Random();
        setName(String.valueOf(rand.nextInt(1001)));

    }
}
