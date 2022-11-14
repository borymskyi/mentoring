package com.borymskyi.solid;

import java.util.Objects;

/**
 * @author Dmitrii Borymskyi
 * @version 1.0
 */
public class Car {
    private final CarType carType;
    private CarBrand carBrand;
    private int seats;

    public Car(CarType carType, CarBrand carBrand, int seats) {
        this.carType = carType;
        this.carBrand = carBrand;
        this.seats = seats;
    }

    public CarType getCarType() {
        return carType;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Car car = (Car) o;
        return seats == car.seats && carType == car.carType && carBrand == car.carBrand;
    }

    @Override
    public int hashCode() {
        return Objects.hash(carType, carBrand, seats);
    }

    public CarBrand getCarBrand() {
        return carBrand;
    }

    public void setCarBrand(CarBrand carBrand) {
        this.carBrand = carBrand;
    }

    public int getSeats() {
        return seats;
    }

    public void setSeats(int seats) {
        this.seats = seats;
    }

    @Override
    public String toString() {
        return "Car{" +
                "carType=" + carType +
                ", carBrand=" + carBrand +
                ", seats=" + seats +
                '}';
    }
}
