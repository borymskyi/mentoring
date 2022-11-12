package com.borymskyi.patterns.creational.builder2.builders;

import com.borymskyi.patterns.creational.builder2.components.*;

/**
 * @author Dmitrii Borymskyi
 * @version 1.0
 */
public interface BuildingBuilder {

    BuildingBuilder buildType(Type type);

    BuildingBuilder buildSquare(int square);

    void buildWall(Wall wall);

    void buildFloor(Floor floor);

    void buildRoof(Roof roof);

    void buildEntrance(Entrance entrance);

    void buildWindow(int windows);

    void buildSwimmingPool(boolean swimmingPool);

    void buildGarage(boolean garage);

    void buildMoat(boolean moat);

    void buildBattleTowers(boolean battleTowers);

    void buildWell(boolean well);

    void buildInnerCourt(boolean innerCourt);

    void buildOutBuildings(boolean outbuildings);

    void buildNumberOfGuards(int numberOfGuards);

    void buildBalcony(boolean balcony);
}
