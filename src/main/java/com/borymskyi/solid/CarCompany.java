package com.borymskyi.solid;

import java.util.*;

/**
 * @author Dmitrii Borymskyi
 * @version 1.0
 */
public class CarCompany {
    private String nameCompany;
    private Map<String, Car> cars;

    public CarCompany() {
        this.nameCompany = "SuperCars";
        this.cars = Map.of(
                "1", new Car(CarType.VAN, CarBrand.MERCEDES, 10),
                "2", new Car(CarType.PICKUP, CarBrand.HONDA, 6),
                "3", new Car(CarType.SEDAN, CarBrand.AUDI, 4));
    }

    public List<Car> findCarsByType(CarType carType) {
        List<Car> result = new ArrayList<>();
        for (Map.Entry<String, Car> v : cars.entrySet()) {
            if (v.getValue().getCarType().equals(carType)) {
                result.add(v.getValue());
            }
        }
        return result;
    }

    public Map<String, Car> getCars() {
        return cars;
    }

    public void setCars(Map<String, Car> cars) {
        this.cars = cars;
    }

    public String getNameCompany() {
        return nameCompany;
    }

    public void setNameCompany(String nameCompany) {
        this.nameCompany = nameCompany;
    }
}
