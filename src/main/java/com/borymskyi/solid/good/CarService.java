package com.borymskyi.solid.good;

import com.borymskyi.solid.Car;
import com.borymskyi.solid.CarCompany;

/**
 * Теперь каждый класс несет ответственность только за одну зону и есть только одна причина для его изменения.
 *
 * @author Dmitrii Borymskyi
 * @version 1.0
 */
public class CarService {
    public Car findCar(CarCompany carCompany, String carNo) {
        return carCompany.getCars().get(carNo);
    }
}
