package com.borymskyi.patterns.factory;

/**
 * @author Dmitrii Borymskyi
 * @version 1.0
 */
public class CppDeveloper implements Developer {
    @Override
    public void writeSomeCode() {
        System.out.println("Cpp developer writes cpp code");
    }
}