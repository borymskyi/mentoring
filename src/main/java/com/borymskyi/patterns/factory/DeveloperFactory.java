package com.borymskyi.patterns.factory;

/**
 * @author Dmitrii Borymskyi
 * @version 1.0
 */
public abstract class DeveloperFactory {

    public Developer huntNewDeveloper() {
        Developer developer = createDevByName();
        developer.writeSomeCode();
        return developer;
    }

    public abstract Developer createDevByName();
}
