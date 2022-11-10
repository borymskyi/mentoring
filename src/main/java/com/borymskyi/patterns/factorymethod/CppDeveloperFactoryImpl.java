package com.borymskyi.patterns.factorymethod;
/**
 *
 *
 * @author Dmitrii Borymskyi
 * @version 1.0
 */
public class CppDeveloperFactoryImpl implements DeveloperFactory {
    @Override
    public Developer createDeveloper() {
        return new CppDeveloper();
    }
}
