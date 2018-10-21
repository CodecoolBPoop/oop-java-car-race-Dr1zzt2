package com.codecool;
import java.util.Arrays;
import java.util.List;
import java.util.Random;

class Car extends Vehicle {
    private static final List<String> carNames = Arrays.asList("Zeal", "Prodigy", "Revelation",
                                                       "Realm", "Roamer", "Dynamo",
                                                       "Dusk", "Phantom");

    Car() {
        Random rand = new Random();
        setSpeed(rand.nextInt(110) + 80);
        setName(carNames.get(rand.nextInt(8)) + carNames.get(rand.nextInt(8)));

    }
}
