package com.borymskyi.solid.good;

import com.borymskyi.solid.Car;
import com.borymskyi.solid.CarCompany;
import com.borymskyi.solid.CarType;

import java.util.List;

/**
 * Теперь каждый класс несет ответственность только за одну зону и есть только одна причина для его изменения.
 *
 * @author Dmitrii Borymskyi
 * @version 1.0
 */
public class CarInfoService {
    public void getCarInterestInfo(CarCompany carCompany, CarType carType) {
        List<Car> cars = carCompany.findCarsByType(carType);

        System.out.println("The company have some a cars for your type request");
        if (carType.equals(CarType.SEDAN)) {
            System.out.println("In 2022, we received sedans mainly from Europe." +
                    "\nHere is our list of possible purchases:");
            cars.stream().forEach(System.out::println);
        }
        else if (carType.equals(CarType.VAN)) {
            System.out.println("In 2022, we received vans mainly from America." +
                    "\nHere is our list of possible purchases:");
        }
        else if (carType.equals(CarType.PICKUP)) {
            System.out.println("In 2022, we received pickups mainly from China." +
                    "\nHere is our list of possible purchases.");
        }
    }
}
