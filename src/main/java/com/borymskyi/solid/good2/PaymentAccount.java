package com.borymskyi.solid.good2;

import java.math.BigDecimal;

/**
 * @author Dmitrii Borymskyi
 * @version 1.0
 */
public class PaymentAccount extends Account {

    public void payment(Bank bank, String numberAccount, BigDecimal sum) {
        bank.getCards().get(numberAccount).setBalance(bank.getCards().get(numberAccount).getBalance().subtract(sum));
        System.out.println("After payment your balance: " + bank.getCards().get(numberAccount).getBalance().toString());
    }
}
