package com.borymskyi.solid.bad4;

import java.math.BigDecimal;

/**
 * @author Dmitrii Borymskyi
 * @version 1.0
 */
public class BadCash {
    private BigDecimal balance;

    public BadCash(BigDecimal balance) {
        this.balance = balance;
    }

    public void doTransaction(BigDecimal amount) {
        balance = balance.subtract(amount);
        System.out.println("You made transaction");
    }

    public BigDecimal getBalance() {
        return balance;
    }

    public void setBalance(BigDecimal balance) {
        this.balance = balance;
    }
}
