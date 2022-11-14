package com.borymskyi.solid.good;

import com.borymskyi.solid.CarCompany;
import com.borymskyi.solid.Order;

/**
 * Теперь каждый класс несет ответственность только за одну зону и есть только одна причина для его изменения.
 *
 * @author Dmitrii Borymskyi
 * @version 1.0
 */
public class PrinterService {
    public void printOrder(CarCompany carCompany, Order order) {
        System.out.println("The company " + carCompany.getNameCompany() + " create the order " +
                "\n Order number: " + order.getNumberOrder() +
                "\n Client: " + order.getClient().getFirstName() +
                "\n Type Car: " + order.getCar().getCarType());
    }
}
