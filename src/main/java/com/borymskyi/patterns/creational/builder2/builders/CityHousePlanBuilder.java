package com.borymskyi.patterns.creational.builder2.builders;

import com.borymskyi.patterns.creational.builder2.building.CityHousePlan;
import com.borymskyi.patterns.creational.builder2.components.*;

/**
 * @author Dmitrii Borymskyi
 * @version 1.0
 */
public class CityHousePlanBuilder implements BuildingBuilder {
    private Type typeBuilding;
    private int square;
    private Wall wall;
    private Floor floor;
    private Roof roof;
    private Entrance entrance;
    private int window;
    private boolean swimmingPool;
    private boolean garage;
    private boolean moat;
    private boolean battleTowers;
    private boolean well;
    private boolean innerCourt;
    private boolean outbuildings;
    private int numberOfGuards;
    private boolean balcony;

    public CityHousePlan getResult() {
        return new CityHousePlan(typeBuilding, square, wall, floor, roof, entrance, window, swimmingPool, garage, moat,
                battleTowers, well, innerCourt, outbuildings, numberOfGuards, balcony);
    }

    @Override
    public BuildingBuilder buildType(Type type) {
        this.typeBuilding = type;
        return this;
    }

    @Override
    public BuildingBuilder buildSquare(int square) {
        this.square = square;
        return this;
    }

    @Override
    public void buildWall(Wall wall) {
        this.wall = wall;
    }

    @Override
    public void buildFloor(Floor floor) {
        this.floor = floor;
    }

    @Override
    public void buildRoof(Roof roof) {
        this.roof = roof;
    }

    @Override
    public void buildEntrance(Entrance entrance) {
        this.entrance = entrance;
    }

    @Override
    public void buildWindow(int windows) {
        this.window = windows;
    }

    @Override
    public void buildSwimmingPool(boolean swimmingPool) {
        this.swimmingPool = swimmingPool;
    }

    @Override
    public void buildGarage(boolean garage) {
        this.garage = garage;
    }

    @Override
    public void buildMoat(boolean moat) {
        this.moat = moat;
    }

    @Override
    public void buildBattleTowers(boolean battleTowers) {
        this.battleTowers = battleTowers;
    }

    @Override
    public void buildWell(boolean well) {
        this.well = well;
    }

    @Override
    public void buildInnerCourt(boolean innerCourt) {
        this.innerCourt = innerCourt;
    }

    @Override
    public void buildOutBuildings(boolean outbuildings) {
        this.outbuildings = outbuildings;
    }

    @Override
    public void buildNumberOfGuards(int numberOfGuards) {
        this.numberOfGuards = numberOfGuards;
    }

    @Override
    public void buildBalcony(boolean balcony) {
        this.balcony = balcony;
    }
}
