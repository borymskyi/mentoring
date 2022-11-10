package com.borymskyi.patterns.factory;
/**
 *
 *
 * @author Dmitrii Borymskyi
 * @version 1.0
 */
public class CppDeveloperFactoryImpl extends DeveloperFactory {
    @Override
    public Developer createDevByName() {
        return new CppDeveloper();
    }
}
