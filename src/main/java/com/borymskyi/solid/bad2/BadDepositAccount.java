package com.borymskyi.solid.bad2;

import java.math.BigDecimal;

/**
 * Здесь я нарушаю третий принцип Подстановка Борбари Лисков.
 * Бизнес требует чтобы депозитный счет не поддерживал проведение оплаты.
 * В коде где используется метод родителя я ставлю экземпляр депозита, код не работает...
 *
 * @author Dmitrii Borymskyi
 * @version 1.0
 */
public class BadDepositAccount extends BadAccount {

    @Override
    public BigDecimal balance(BadBank bank, String numberAccount) {
        return super.balance(bank, numberAccount);
    }

    @Override
    public void refill(BadBank bank, String numberAccount, BigDecimal sum) {
        super.refill(bank, numberAccount, sum);
    }

    //Ошибка!
    @Override
    public void payment(BadBank bank, String numberAccount, BigDecimal sum) {
        throw new UnsupportedOperationException("Operation nt supported!");
    }
}
