package com.borymskyi.patterns.abstractfactory;

import com.borymskyi.patterns.abstractfactory.website.WebsiteTeamFactory;

/**
 * @author Dmitrii Borymskyi
 * @version 1.0
 */
public class AuctionSiteProject {
    public static void main(String[] args) {
        ProjectTeamFactory projectTeamFactory = new WebsiteTeamFactory();

        Developer developer = projectTeamFactory.getDeveloper();
        Tester tester = projectTeamFactory.getTester();
        ProjectManager pm = projectTeamFactory.getProjectManager();

        System.out.println("Creating website system...");
        developer.writeCode();
        tester.testCode();
        pm.manageProject();
    }
}
