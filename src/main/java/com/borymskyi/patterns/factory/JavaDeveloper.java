package com.borymskyi.patterns.factory;

/**
 * @author Dmitrii Borymskyi
 * @version 1.0
 */
public class JavaDeveloper implements Developer {
    @Override
    public void writeSomeCode() {
        System.out.println("Java developer writes Java code");
    }
}
