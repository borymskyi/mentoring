package com.borymskyi.patterns.creational.builder2;

/**
 * @author Dmitrii Borymskyi
 * @version 1.0
 */
public class Director {
    private BuildingForPeopleBuilder builder;

    public void setBuilder(BuildingForPeopleBuilder builder) {
        this.builder = builder;
    }

    public BuildingForPeople createBuilding(){
        builder.createBuilding();
        builder.buildType();
        builder.buildSquare();
        builder.buildWall();
        builder.buildFloor();
        builder.buildRoof();
        builder.buildEntrance();
        builder.buildWindow();
        builder.buildSwimmingPool();
        builder.buildGarage();
        builder.buildMoat();
        builder.buildBattleTowers();
        builder.buildInnerCourt();
        builder.buildOutBuildings();

        return builder.getBuildingForPeople();
    }
}
