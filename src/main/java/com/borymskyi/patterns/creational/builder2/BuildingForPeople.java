package com.borymskyi.patterns.creational.builder2;

/**
 * @author Dmitrii Borymskyi
 * @version 1.0
 */
public class BuildingForPeople {
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

    public BuildingForPeople() {
    }

    public void setTypeBuilding(Type typeBuilding) {
        this.typeBuilding = typeBuilding;
    }

    public void setSquare(int square) {
        this.square = square;
    }

    public void setWall(Wall wall) {
        this.wall = wall;
    }

    public void setFloor(Floor floor) {
        this.floor = floor;
    }

    public void setRoof(Roof roof) {
        this.roof = roof;
    }

    public void setEntrance(Entrance entrance) {
        this.entrance = entrance;
    }

    public void setWindow(int window) {
        this.window = window;
    }

    public void setSwimmingPool(boolean swimmingPool) {
        this.swimmingPool = swimmingPool;
    }

    public void setGarage(boolean garage) {
        this.garage = garage;
    }

    public void setMoat(boolean moat) {
        this.moat = moat;
    }

    public void setBattleTowers(boolean battleTowers) {
        this.battleTowers = battleTowers;
    }

    public void setWell(boolean well) {
        this.well = well;
    }

    public void setInnerCourt(boolean innerCourt) {
        this.innerCourt = innerCourt;
    }

    public void setOutbuildings(boolean outbuildings) {
        this.outbuildings = outbuildings;
    }

    @Override
    public String toString() {
        return "BuildingForPeople{" +
                "typeBuilding=" + typeBuilding +
                ", square=" + square +
                ", wall=" + wall +
                ", floor=" + floor +
                ", roof=" + roof +
                ", entrance=" + entrance +
                ", window=" + window +
                ", swimmingPool=" + swimmingPool +
                ", garage=" + garage +
                ", moat=" + moat +
                ", battleTowers=" + battleTowers +
                ", well=" + well +
                ", innerCourt=" + innerCourt +
                ", outbuildings=" + outbuildings +
                '}';
    }
}
