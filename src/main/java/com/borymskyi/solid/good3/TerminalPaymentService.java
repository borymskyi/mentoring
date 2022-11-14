package com.borymskyi.solid.good3;

/**
 * @author Dmitrii Borymskyi
 * @version 1.0
 */
public class TerminalPaymentService implements WebMoneyPayment, CreditCardPaymet {
    @Override
    public void payCreditCard() {
        //logic
    }

    @Override
    public void payWebMoney() {
        //logic
    }
}
