package com.borymskyi.oop.first;

import com.borymskyi.oop.first.Car;
import com.borymskyi.oop.first.Engine;
import com.borymskyi.oop.first.Driver;

/**
 * @author Dmitrii Borymskyi
 * @version 1.0
 */
public class Lorry extends Car {

    private int carrying;

    public Lorry(String marka, String carClass, int weight, Driver driver, Engine engine, int carrying) {
        super(marka, carClass, weight, driver, engine);
        this.carrying = carrying;
    }

    public int getCarrying() {
        return carrying;
    }

    public void setCarrying(int carrying) {
        this.carrying = carrying;
    }

    @Override
    public String toString() {
        return "Lorry{" +
                "carrying=" + carrying +
                '}';
    }
}
