package com.borymskyi.patterns.creational.builder2.directors;

import com.borymskyi.patterns.creational.builder2.builders.BuildingBuilder;
import com.borymskyi.patterns.creational.builder2.builders.CastleBuilder;
import com.borymskyi.patterns.creational.builder2.building.Castle;
import com.borymskyi.patterns.creational.builder2.components.*;

/**
 * @author Dmitrii Borymskyi
 * @version 1.0
 */
public class Director {
    public Castle buildCastle(CastleBuilder castleBuilder) {
//        buildingBuilder.buildType(Type.CASTLE).buildSquare(25000).buildWall(Wall.CASTLE_WALL);

        castleBuilder.buildType(Type.CASTLE);
        castleBuilder.buildSquare(25000);
        castleBuilder.buildWall(Wall.CASTLE_WALL);
        castleBuilder.buildFloor(Floor.MARBLE_FLOOR);
        castleBuilder.buildRoof(Roof.STONE);
        castleBuilder.buildEntrance(Entrance.CASTLE_ENTRANCE);
        castleBuilder.buildWindow(60);
        castleBuilder.buildMoat(true);
        castleBuilder.buildBattleTowers(true);
        castleBuilder.buildWell(true);
        castleBuilder.buildInnerCourt(true);
        castleBuilder.buildOutBuildings(true);
        castleBuilder.buildNumberOfGuards(45);

        return castleBuilder.getResult();
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
