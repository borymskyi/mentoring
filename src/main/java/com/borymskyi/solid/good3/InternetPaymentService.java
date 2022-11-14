package com.borymskyi.solid.good3;

/**
 * @author Dmitrii Borymskyi
 * @version 1.0
 */
public class InternetPaymentService implements WebMoneyPayment, CreditCardPaymet, PhoneNumberPayment {
    @Override
    public void payCreditCard() {
        //logic
    }

    @Override
    public void payPhoneNumber() {
        //logic
    }

    @Override
    public void payWebMoney() {
        //logic
    }
}
