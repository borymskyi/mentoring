package com.borymskyi.oop.first;

/**
 * @author Dmitrii Borymskyi
 * @version 1.0
 */
public class FirstRunner {
    public static void main(String[] args) {
        Driver driver = new Driver(41, "Edward", "Borymskyi", "Tadeushevuch", true, 60);
        Engine engine = new Engine(80, "Volkswagen");
        Car car = new Lorry("volkswagen", "Lineup", 100, driver, engine, 200);
        System.out.println(car);
        car.start();
        car.turnLeft();
        car.turnRight();
        car.stop();
    }
}
