package com.borymskyi.patterns.factory;

/**
 * @author Dmitrii Borymskyi
 * @version 1.0
 */
public class JavaDeveloperFactoryImpl extends DeveloperFactory {
    @Override
    public Developer createDevByName() {
        return new JavaDeveloper();
    }
}
