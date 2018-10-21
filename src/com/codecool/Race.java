package com.codecool;

import java.util.ArrayList;
import java.util.List;

public class Race {

    static void createVehicles(List Vehicles) {
        for (int i = 0; i < 10; i++) {
            Vehicles.add(new Car());
            Vehicles.add(new Motorcycle());
            Vehicles.add(new Truck());
        }

    }

    static void simulateRace() {
        Weather.setRaining();
        List<Vehicle> Vehicles = new ArrayList<>();
        createVehicles(Vehicles);
        for (int i = 0; i < 50; i++) {
            for (Vehicle vehicle : Vehicles) {
                vehicle.moveForAnHour();
            }
        }
        printRaceResults(Vehicles);
    }

    static void printRaceResults(List Vehicles) {
        for (Vehicle vehicle : Vehicles) {
            System.out.println(vehicle.getClass().getSimpleName() +
                               "named" +
                               "" +
                               "travelled" +
                               vehicle.getDistanceTraveled() +
                               "km-s");
        }
    }

    boolean isThereABrokenTruck() {

    }

    public static void main(String[] args) {
	    simulateRace();
    }
}
