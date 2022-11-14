package com.borymskyi.solid.bad4;

import java.math.BigDecimal;

/**
 * @author Dmitrii Borymskyi
 * @version 1.0
 */
public class BadShop {
    //Ошибка!
    private BadCash cash;

    public BadShop(BadCash cash) {
        this.cash = cash;
    }

    public void doPayment(String order, BigDecimal amount) {
        cash.doTransaction(amount);
        System.out.println("You made payment by order: " + order);
        System.out.println("Now your balance: " + cash.getBalance().toString());
    }
}
