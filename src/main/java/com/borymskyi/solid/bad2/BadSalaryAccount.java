package com.borymskyi.solid.bad2;

import java.math.BigDecimal;

/**
 * @author Dmitrii Borymskyi
 * @version 1.0
 */
public class BadSalaryAccount extends BadAccount {

    @Override
    public void refill(BadBank bank, String numberAccount, BigDecimal sum) {
        super.refill(bank, numberAccount, sum);
    }

    @Override
    public void payment(BadBank bank, String numberAccount, BigDecimal sum) {
        super.payment(bank, numberAccount, sum);
    }
}
