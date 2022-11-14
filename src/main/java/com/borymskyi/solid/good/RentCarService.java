package com.borymskyi.solid.good;

import com.borymskyi.solid.CarCompany;
import com.borymskyi.solid.Client;
import com.borymskyi.solid.Order;

/**
 * Теперь каждый класс несет ответственность только за одну зону и есть только одна причина для его изменения.
 *
 * @author Dmitrii Borymskyi
 * @version 1.0
 */
public class RentCarService {
    public Order orderCar(CarCompany carCompany, String carNo, Client client) {
        return new Order(1L, carCompany.getCars().get(carNo), client);
    }
}
