package com.borymskyi.oop.first;

import com.borymskyi.oop.first.Car;
import com.borymskyi.oop.first.Engine;
import com.borymskyi.oop.first.Driver;

/**
 * @author Dmitrii Borymskyi
 * @version 1.0
 */
public class SportCar extends Car {

    private String speed;

    public SportCar(String marka, String carClass, int weight, Driver driver, Engine engine, String speed) {
        super(marka, carClass, weight, driver, engine);
        this.speed = speed;
    }

    public String getSpeed() {
        return speed;
    }

    public void setSpeed(String speed) {
        this.speed = speed;
    }

    @Override
    public String toString() {
        return "SportCar{" +
                "speed='" + speed + '\'' +
                '}';
    }
}
