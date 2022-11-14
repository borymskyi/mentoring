package com.borymskyi.solid.good4;

import com.borymskyi.solid.bad4.BadCash;

import java.math.BigDecimal;

/**
 * @author Dmitrii Borymskyi
 * @version 1.0
 */
public class Shop {

    private Payments payments;

    public Shop(Payments payments) {
        this.payments = payments;
    }

    public void doPayment(String order, BigDecimal amount) {
        payments.doTransaction(amount);
        System.out.println("You made payment by order: " + order);
    }
}
