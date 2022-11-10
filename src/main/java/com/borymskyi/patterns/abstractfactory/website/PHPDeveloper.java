package com.borymskyi.patterns.abstractfactory.website;

import com.borymskyi.patterns.abstractfactory.Developer;

/**
 * @author Dmitrii Borymskyi
 * @version 1.0
 */
public class PHPDeveloper implements Developer {
    @Override
    public void writeCode() {
        System.out.println("PHP developer write some code for a website project.");
    }
}
