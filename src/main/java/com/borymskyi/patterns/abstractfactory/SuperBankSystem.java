package com.borymskyi.patterns.abstractfactory;

import com.borymskyi.patterns.abstractfactory.banking.BankingTeamFactory;

/**
 * @author Dmitrii Borymskyi
 * @version 1.0
 */
public class SuperBankSystem {
    public static void main(String[] args) {
        ProjectTeamFactory projectTeamFactory = new BankingTeamFactory();

        Developer developer = projectTeamFactory.getDeveloper();
        Tester tester = projectTeamFactory.getTester();
        ProjectManager pm = projectTeamFactory.getProjectManager();

        System.out.println("Creating banking system...");
        developer.writeCode();
        tester.testCode();
        pm.manageProject();
    }
}
