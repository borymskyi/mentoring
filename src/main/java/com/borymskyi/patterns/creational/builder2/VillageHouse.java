package com.borymskyi.patterns.creational.builder2;

/**
 * @author Dmitrii Borymskyi
 * @version 1.0
 */
public class VillageHouse extends BuildingForPeopleBuilder{
    @Override
    public void buildType() {
        buildingForPeople.setTypeBuilding(Type.VILLAGE_HOUSE);
    }

    @Override
    public void buildSquare() {
        buildingForPeople.setSquare(80);
    }

    @Override
    public void buildWall() {
        buildingForPeople.setWall(Wall.WOOD_WALL);
    }

    @Override
    public void buildFloor() {
        buildingForPeople.setFloor(Floor.WOODEN_FLOOR);
    }

    @Override
    public void buildRoof() {
        buildingForPeople.setRoof(Roof.WOODEN);
    }

    @Override
    public void buildEntrance() {
        buildingForPeople.setEntrance(Entrance.WOODEN);
    }

    @Override
    public void buildWindow() {
        buildingForPeople.setWindow(6);
    }

    @Override
    public void buildSwimmingPool() {
        buildingForPeople.setSwimmingPool(true);
    }

    @Override
    public void buildGarage() {
        buildingForPeople.setGarage(true);
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
        buildingForPeople.setWell(true);
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
