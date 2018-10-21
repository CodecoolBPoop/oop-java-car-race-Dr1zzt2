package com.codecool;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

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
        for (int i = 0; i < 50; i++) {
            for (Vehicle vehicle : Vehicles) {
                Weather.setRaining();
                if (vehicle instanceof Truck) {
                    if (((Truck) vehicle).getBreakdownTurnsLeft() > 0) {
                        ((Truck) vehicle).setBreakdownTurnsLeft(((Truck) vehicle).getBreakdownTurnsLeft() - 1);
                    } else {
                        ((Truck) vehicle).breakdownRoll();
                    }
                }
                if (isThereABrokenTruck()) {
                    vehicle.setSpeedMax(75);
                } else {
                    vehicle.setSpeedMax(999);
                }
                if (Weather.isRaining() && vehicle instanceof Motorcycle) {
                    Random rand = new Random();
                    vehicle.setSpeedMax(100 - rand.nextInt(51 - 5) + 5);
                }
                vehicle.moveForAnHour();
                System.out.println(vehicle.getClass().getSimpleName() + String.valueOf(vehicle.getSpeedMax()));
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

    private static boolean isThereABrokenTruck() {
        for (Vehicle vehicle : Vehicles) {
            if (vehicle instanceof Truck) {
                if (((Truck) vehicle).getBreakdownTurnsLeft() > 0) {
                    return true;
                }
            }
        }
        return false;
    }

    public static void main(String[] args) {
        createVehicles();
	    simulateRace();
        printRaceResults();
    }
}
