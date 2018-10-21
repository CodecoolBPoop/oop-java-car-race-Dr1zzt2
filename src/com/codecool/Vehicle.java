package com.codecool;

import java.util.Random;

class Vehicle {
    private int speed = 0; // km/h

    public int getSpeedMax() {
        return speedMax;
    }

    public void setSpeedMax(int speedMax) {
        this.speedMax = speedMax;
    }

    private int speedMax = 999; // km/h

    private String name;

    private int distanceTraveled = 0;

    String getName() {
        return name;
    }

    int getSpeed() {
        return speed;
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
        if (speed > speedMax) {
            distanceTraveled = distanceTraveled + speedMax;
        } else {
            distanceTraveled = distanceTraveled + speed;
        }
    }
}
