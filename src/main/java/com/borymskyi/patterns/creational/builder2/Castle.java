package com.borymskyi.patterns.creational.builder2;

/**
 * @author Dmitrii Borymskyi
 * @version 1.0
 */
public class Castle extends BuildingForPeopleBuilder {

    @Override
    public void buildType() {
        buildingForPeople.setTypeBuilding(Type.CASTLE);
    }

    @Override
    public void buildSquare() {
        buildingForPeople.setSquare(15000);
    }

    @Override
    public void buildWall() {
        buildingForPeople.setWall(Wall.CASTLE_WALL);
    }

    @Override
    public void buildFloor() {
        buildingForPeople.setFloor(Floor.MARBLE_FLOOR);
    }

    @Override
    public void buildRoof() {
        buildingForPeople.setRoof(Roof.STONE);
    }

    @Override
    public void buildEntrance() {
        buildingForPeople.setEntrance(Entrance.CASTLE_ENTRANCE);
    }

    @Override
    public void buildWindow() {
        buildingForPeople.setWindow(65);
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
        buildingForPeople.setMoat(true);
    }

    @Override
    public void buildBattleTowers() {
        buildingForPeople.setBattleTowers(true);
    }

    @Override
    public void buildWell() {
        buildingForPeople.setWell(true);
    }

    @Override
    public void buildInnerCourt() {
        buildingForPeople.setInnerCourt(true);
    }

    @Override
    public void buildOutBuildings() {
        buildingForPeople.setOutbuildings(true);
    }
}
