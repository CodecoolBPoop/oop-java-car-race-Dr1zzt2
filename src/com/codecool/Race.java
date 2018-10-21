package com.codecool;

import java.util.ArrayList;
import java.util.List;

public class Race {
    private static List<Vehicle> Vehicles = new ArrayList<>();

    private static void createVehicles() {
        for (int i = 0; i < 10; i++) {
            Vehicles.add(new Car());
            Vehicles.add(new Motorcycle());
            Vehicles.add(new Truck());
        }

    }

    private static void simulateRace() {
        Weather.setRaining();
        for (int i = 0; i < 50; i++) {
            for (Vehicle vehicle : Vehicles) {
                vehicle.moveForAnHour();
            }
        }
    }

    private static void printRaceResults() {
        for (Vehicle vehicle : Vehicles) {
            System.out.println(vehicle.getClass().getSimpleName() +
                               " named " +
                               vehicle.getName() +
                               " travelled " +
                               vehicle.getDistanceTraveled() +
                               " km-s ");
        }
    }

    boolean isThereABrokenTruck() {
        return false;
    }

    public static void main(String[] args) {
        createVehicles();
	    simulateRace();
        printRaceResults();
    }
}
