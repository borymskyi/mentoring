package com.borymskyi.patterns.creational.builder2;

/**
 * @author Dmitrii Borymskyi
 * @version 1.0
 */
public class CityHouse extends BuildingForPeopleBuilder {
    @Override
    public void buildType() {
        buildingForPeople.setTypeBuilding(Type.CITY_HOUSE);
    }

    @Override
    public void buildSquare() {
        buildingForPeople.setSquare(65);
    }

    @Override
    public void buildWall() {
        buildingForPeople.setWall(Wall.BRICK_WALL);
    }

    @Override
    public void buildFloor() {
        buildingForPeople.setFloor(Floor.WOODEN_FLOOR);
    }

    @Override
    public void buildRoof() {
        buildingForPeople.setRoof(Roof.IRON);
    }

    @Override
    public void buildEntrance() {
        buildingForPeople.setEntrance(Entrance.IRON);
    }

    @Override
    public void buildWindow() {
        buildingForPeople.setWindow(4);
    }

    @Override
    public void buildSwimmingPool() {
        buildingForPeople.setSwimmingPool(false);
    }

    @Override
    public void buildGarage() {
        buildingForPeople.setGarage(false);
    }

    @Override
    public void buildMoat() {
        buildingForPeople.setMoat(false);
    }

    @Override
    public void buildBattleTowers() {
        buildingForPeople.setBattleTowers(false);
    }

    @Override
    public void buildWell() {
        buildingForPeople.setWell(false);
    }

    @Override
    public void buildInnerCourt() {
        buildingForPeople.setInnerCourt(false);
    }

    @Override
    public void buildOutBuildings() {
        buildingForPeople.setOutbuildings(false);
    }
}
