package com.borymskyi.solid.good4;

import java.math.BigDecimal;

/**
 * @author Dmitrii Borymskyi
 * @version 1.0
 */
public interface Payments {
    void doTransaction(BigDecimal amount);
}
