package com.borymskyi.patterns.creational.abstractfactory.website;

import com.borymskyi.patterns.creational.abstractfactory.Developer;
import com.borymskyi.patterns.creational.abstractfactory.ProjectManager;
import com.borymskyi.patterns.creational.abstractfactory.ProjectTeamFactory;
import com.borymskyi.patterns.creational.abstractfactory.Tester;

/**
 * @author Dmitrii Borymskyi
 * @version 1.0
 */
public class WebsiteTeamFactory implements ProjectTeamFactory {
    @Override
    public Developer getDeveloper() {
        return new PHPDeveloper();
    }

    @Override
    public Tester getTester() {
        return new ManualTester();
    }

    @Override
    public ProjectManager getProjectManager() {
        return new WebsitePM();
    }
}
