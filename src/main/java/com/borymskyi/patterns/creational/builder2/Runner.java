package com.borymskyi.patterns.creational.builder2;

/**
 * @author Dmitrii Borymskyi
 * @version 1.0
 */
public class Runner {
    public static void main(String[] args) {
        Director director = new Director();
        director.setBuilder(new Castle());
        director.createBuilding();
        System.out.println(director.createBuilding().toString());
    }
}
