package com.borymskyi.patterns.abstractfactory.website;

import com.borymskyi.patterns.abstractfactory.Tester;

/**
 * @author Dmitrii Borymskyi
 * @version 1.0
 */
public class ManualTester implements Tester {
    @Override
    public void testCode() {
        System.out.println("Manual tester tests code for a website project.");
    }
}
