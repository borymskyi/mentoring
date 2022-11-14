package com.borymskyi.solid.good2;

import java.math.BigDecimal;

/**
 * @author Dmitrii Borymskyi
 * @version 1.0
 */
public class DepositAccount extends Account {
    @Override
    public BigDecimal balance(Bank bank, String numberAccount) {
        return super.balance(bank, numberAccount);
    }

    @Override
    public void refill(Bank bank, String numberAccount, BigDecimal sum) {
        super.refill(bank, numberAccount, sum);
    }
}
