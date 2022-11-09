package com.borymskyi.patterns.factory2;

/**
 * @author Dmitrii Borymskyi
 * @version 1.0
 */
public class Toyota implements Car {
    @Override
    public void drive() {
        System.out.println("Toyota");
    }
}
