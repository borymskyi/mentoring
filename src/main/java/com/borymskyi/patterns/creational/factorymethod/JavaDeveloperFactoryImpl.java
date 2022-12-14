package com.borymskyi.patterns.creational.factorymethod;

/**
 * @author Dmitrii Borymskyi
 * @version 1.0
 */
public class JavaDeveloperFactoryImpl implements DeveloperFactory {
    @Override
    public Developer createDeveloper() {
        return new JavaDeveloper();
    }
}
