package com.borymskyi.patterns.abstractfactory.banking;

import com.borymskyi.patterns.abstractfactory.Tester;

/**
 * @author Dmitrii Borymskyi
 * @version 1.0
 */
public class QaTester implements Tester {
    @Override
    public void testCode() {
        System.out.println("QaTester tests a banking code");
    }
}
