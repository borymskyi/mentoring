package com.borymskyi.patterns.abstractfactory.banking;

import com.borymskyi.patterns.abstractfactory.Developer;

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
