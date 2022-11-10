package com.borymskyi.patterns.creational.builder2;

/**
 * @author Dmitrii Borymskyi
 * @version 1.0
 */
public abstract class BuildingForPeopleBuilder {
    protected BuildingForPeople buildingForPeople;

    protected void createBuilding() {
        buildingForPeople = new BuildingForPeople();
    }

    public abstract void buildType();

    public abstract void buildSquare();

    public abstract void buildWall();

    public abstract void buildFloor();

    public abstract void buildRoof();

    public abstract void buildEntrance();

    public abstract void buildWindow();

    public abstract void buildSwimmingPool();

    public abstract void buildGarage();

    public abstract void buildMoat();

    public abstract void buildBattleTowers();

    public abstract void buildWell();

    public abstract void buildInnerCourt();

    public abstract void buildOutBuildings();

    public BuildingForPeople getBuildingForPeople(){
        return buildingForPeople;
    }
}
