package com.borymskyi.solid.bad2;

import java.math.BigDecimal;

/**
 * @author Dmitrii Borymskyi
 * @version 1.0
 */
public class BadAccount {
    private BigDecimal balance;

    public BigDecimal balance(BadBank bank, String numberAccount) {
        return bank.getCards().get(numberAccount).balance;
    }

    public void refill(BadBank bank, String numberAccount, BigDecimal sum) {
        bank.getCards().get(numberAccount).balance = bank.getCards().get(numberAccount).balance.add(sum);
        System.out.println("After refill your balance: " + bank.getCards().get(numberAccount).balance.toString());
    }

    public void payment(BadBank bank, String numberAccount, BigDecimal sum) {
        bank.getCards().get(numberAccount).balance = bank.getCards().get(numberAccount).balance.subtract(sum);
        System.out.println("After payment your balance: " + bank.getCards().get(numberAccount).balance.toString());
    }

    public BigDecimal balance() {
        return balance;
    }

    public void setBalance(BigDecimal balance) {
        this.balance = balance;
    }
}
