package com.codecool;

class Vehicle {
    private int speed = 0; // km/h

    private String name;

    private int distanceTraveled = 0;

    String getName() {
        return name;
    }

    void setName(String newName) {
        name = newName;
    }

    void setSpeed(int newSpeed) {
        speed = newSpeed;
    }

    int getDistanceTraveled() {
        return distanceTraveled;
    }

    void moveForAnHour() {
        distanceTraveled = distanceTraveled + speed;
    }
}
