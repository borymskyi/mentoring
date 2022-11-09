package com.borymskyi.patterns.factory2;

/**
 * @author Dmitrii Borymskyi
 * @version 1.0
 */
public class Factory {

    public static Car createCar(String specialty) {
        if (specialty.equalsIgnoreCase("Toyota")) {
            return new Toyota();
        }
        else if (specialty.equalsIgnoreCase("Audi")) {
            return new Audi();
        }
        else {
            throw new RuntimeException(specialty + " is not exist");
        }
    }
}
