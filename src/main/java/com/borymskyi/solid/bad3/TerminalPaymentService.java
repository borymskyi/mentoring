package com.borymskyi.solid.bad3;

/**
 * Нарушение принципа разделения интерфейсов. Так как я заставил класс реализовывать тот функционал который
 * ему не нужен.
 *
 * = нужно разделить интрефейс на несколько.
 *
 *
 * @author Dmitrii Borymskyi
 * @version 1.0
 */
public class TerminalPaymentService implements Payments {
    @Override
    public void payWebMoney() {
        //logic
    }

    @Override
    public void payCreditCard() {
        //logic
    }

    //Error!
    @Override
    public void payPhoneNumber() {
        throw new UnsupportedOperationException("Terminal unsupported operation!");
    }
}
