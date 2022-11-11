package com.borymskyi.patterns.creational.builder2.building;

import com.borymskyi.patterns.creational.builder2.components.*;

/**
 * @author Dmitrii Borymskyi
 * @version 1.0
 */
public class Castle {
    private final Type typeBuilding;
    private int square;
    private final Wall wall;
    private final Floor floor;
    private final Roof roof;
    private final Entrance entrance;
    private final int window;
    private final boolean swimmingPool;
    private final boolean garage;
    private final boolean moat;
    private final boolean battleTowers;
    private final boolean well;
    private final boolean innerCourt;
    private final boolean outbuildings;
    private int numberOfGuards;
    private final boolean balcony;

    public Castle(Type typeBuilding, int square, Wall wall, Floor floor, Roof roof, Entrance entrance,
                  int window, boolean swimmingPool, boolean garage, boolean moat, boolean battleTowers,
                  boolean well, boolean innerCourt, boolean outbuildings, int numberOfGuards, boolean balcony) {
        this.typeBuilding = typeBuilding;
        this.square = square;
        this.wall = wall;
        this.floor = floor;
        this.roof = roof;
        this.entrance = entrance;
        this.window = window;
        this.swimmingPool = swimmingPool;
        this.garage = garage;
        this.moat = moat;
        this.battleTowers = battleTowers;
        this.well = well;
        this.innerCourt = innerCourt;
        this.outbuildings = outbuildings;
        this.numberOfGuards = numberOfGuards;
        this.balcony = balcony;
    }

    public String putDefendersInPosition() {
        return numberOfGuards + " guardians on position.";
    }

    public String openTheGate() {
        return "The gate is opened";
    }

    public String closeTheGate() {
        return "The gate is closed";
    }
}
