package com.borymskyi.solid.good2;

import java.math.BigDecimal;

/**
 * @author Dmitrii Borymskyi
 * @version 1.0
 */
public class SalaryAccount extends PaymentAccount {
    @Override
    public BigDecimal balance(Bank bank, String numberAccount) {
        return super.balance(bank, numberAccount);
    }

    @Override
    public void refill(Bank bank, String numberAccount, BigDecimal sum) {
        super.refill(bank, numberAccount, sum);
    }

    @Override
    public void payment(Bank bank, String numberAccount, BigDecimal sum) {
        super.payment(bank, numberAccount, sum);
    }
}
