package com.borymskyi.oop.first;

/**
 * @author Dmitrii Borymskyi
 * @version 1.0
 */
public class Driver extends Person {
    private int experience;

    public Driver(int experience, String name, String surName, String patronymicName, boolean retired, int age ) {
        super(name, surName, patronymicName, retired, age);
        this.experience = experience;
    }

    public int getExperience() {
        return experience;
    }

    public void setExperience(int experience) {
        this.experience = experience;
    }

    @Override
    public String toString() {
        return "Driver{" +
                "experience=" + experience +
                '}';
    }
}
