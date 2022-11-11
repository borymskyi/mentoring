package com.borymskyi.patterns.creational.builder2.directors;

import com.borymskyi.patterns.creational.builder2.builders.BuildingBuilder;
import com.borymskyi.patterns.creational.builder2.components.*;

/**
 * @author Dmitrii Borymskyi
 * @version 1.0
 */
public class Director {
    public void buildCastle(BuildingBuilder buildingBuilder) {
        buildingBuilder.buildType(Type.CASTLE);
        buildingBuilder.buildSquare(25000);
        buildingBuilder.buildWall(Wall.CASTLE_WALL);
        buildingBuilder.buildFloor(Floor.MARBLE_FLOOR);
        buildingBuilder.buildRoof(Roof.STONE);
        buildingBuilder.buildEntrance(Entrance.CASTLE_ENTRANCE);
        buildingBuilder.buildWindow(60);
        buildingBuilder.buildMoat(true);
        buildingBuilder.buildBattleTowers(true);
        buildingBuilder.buildWell(true);
        buildingBuilder.buildInnerCourt(true);
        buildingBuilder.buildOutBuildings(true);
        buildingBuilder.buildNumberOfGuards(45);
    }

    public void buildPlanCityHouse(BuildingBuilder buildingBuilder) {
        buildingBuilder.buildType(Type.CITY_HOUSE);
        buildingBuilder.buildSquare(80);
        buildingBuilder.buildWall(Wall.BRICK_WALL);
        buildingBuilder.buildFloor(Floor.WOODEN_FLOOR);
        buildingBuilder.buildRoof(Roof.IRON);
        buildingBuilder.buildEntrance(Entrance.IRON);
        buildingBuilder.buildWindow(4);
        buildingBuilder.buildBalcony(true);
    }

    public void buildCityHouse(BuildingBuilder buildingBuilder) {
        buildingBuilder.buildType(Type.CITY_HOUSE);
        buildingBuilder.buildSquare(80);
        buildingBuilder.buildWall(Wall.BRICK_WALL);
        buildingBuilder.buildFloor(Floor.WOODEN_FLOOR);
        buildingBuilder.buildRoof(Roof.IRON);
        buildingBuilder.buildEntrance(Entrance.IRON);
        buildingBuilder.buildWindow(4);
        buildingBuilder.buildBalcony(true);
    }
}
