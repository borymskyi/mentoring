package com.borymskyi.solid.good2;

import java.math.BigDecimal;

/**
 * Для того чтобы решить проблему подстановки Баббары Лисков,
 * необходимо родительский класс вносить только общую логику, характерную для будущих наследников.
 *
 * @author Dmitrii Borymskyi
 * @version 1.0
 */
public class Account {
    private BigDecimal balance;

    public BigDecimal balance(Bank bank, String numberAccount) {
        return bank.getCards().get(numberAccount).balance;
    }

    public void refill(Bank bank, String numberAccount, BigDecimal sum) {
        bank.getCards().get(numberAccount).balance = bank.getCards().get(numberAccount).balance.add(sum);
        System.out.println("After refill your balance: " + bank.getCards().get(numberAccount).balance.toString());
    }

    public BigDecimal getBalance() {
        return balance;
    }

    public void setBalance(BigDecimal balance) {
        this.balance = balance;
    }
}
