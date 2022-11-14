package com.borymskyi.solid.good4;

import java.math.BigDecimal;

/**
 * @author Dmitrii Borymskyi
 * @version 1.0
 */
public class BankCard implements Payments {
    private BigDecimal balance;

    public BankCard(BigDecimal balance) {
        this.balance = balance;
    }

    public BigDecimal getBalance() {
        return balance;
    }

    public void setBalance(BigDecimal balance) {
        this.balance = balance;
    }

    @Override
    public void doTransaction(BigDecimal amount) {
        balance = balance.subtract(amount);
        System.out.println("BankCard transaction");
        System.out.println("Balance: " + balance.toString());
    }
}
