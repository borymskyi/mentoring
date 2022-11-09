package com.borymskyi.patterns.factory2;

/**
 * @author Dmitrii Borymskyi
 * @version 1.0
 */
public class Runner {
    public static void main(String[] args) {
        Car audi = Factory.createCar("audi");
        Car toyota = Factory.createCar("Toyota");
        audi.drive();
        toyota.drive();
    }
}
