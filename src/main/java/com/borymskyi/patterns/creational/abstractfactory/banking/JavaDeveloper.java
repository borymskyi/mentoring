package com.borymskyi.patterns.creational.abstractfactory.banking;

import com.borymskyi.patterns.creational.abstractfactory.Developer;

/**
 * @author Dmitrii Borymskyi
 * @version 1.0
 */
public class JavaDeveloper implements Developer {
    @Override
    public void writeCode() {
        System.out.println("JavaDeveloper writes some code for a banking project.");
    }
}
