package com.codecool;

class Motorcycle extends Vehicle{
    private static int nameNumber = 0;
    Motorcycle() {
        setSpeed(100);
        nameNumber++;
        setName("Motorcycle" + nameNumber);

    }
}
