package com.borymskyi.patterns.creational.builder2;

import com.borymskyi.patterns.creational.builder2.builders.CastleBuilder;
import com.borymskyi.patterns.creational.builder2.builders.CityHousePlanBuilder;
import com.borymskyi.patterns.creational.builder2.building.Castle;
import com.borymskyi.patterns.creational.builder2.building.CityHousePlan;
import com.borymskyi.patterns.creational.builder2.directors.Director;

/**
 * @author Dmitrii Borymskyi
 * @version 1.0
 */
public class Runner {
    public static void main(String[] args) {
        Director director = new Director();
        CastleBuilder castleBuilder = new CastleBuilder();
        director.buildCastle(castleBuilder);

        Castle castle = castleBuilder.getResult();
        System.out.println(castle.openTheGate());
        System.out.println(castle.putDefendersInPosition());

        CityHousePlanBuilder cityHousePlanBuilder = new CityHousePlanBuilder();
        director.buildPlanCityHouse(cityHousePlanBuilder);

        CityHousePlan cityHousePlan = cityHousePlanBuilder.getResult();
        System.out.println(cityHousePlan.showPlan());
    }
}
