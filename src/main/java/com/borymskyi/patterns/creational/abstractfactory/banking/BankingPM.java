package com.borymskyi.patterns.creational.abstractfactory.banking;

import com.borymskyi.patterns.creational.abstractfactory.ProjectManager;

/**
 * @author Dmitrii Borymskyi
 * @version 1.0
 */
public class BankingPM implements ProjectManager {
    @Override
    public void manageProject() {
        System.out.println("BankingPM manages banking project.");
    }
}
