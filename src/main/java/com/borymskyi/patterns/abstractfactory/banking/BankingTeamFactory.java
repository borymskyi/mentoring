package com.borymskyi.patterns.abstractfactory.banking;

import com.borymskyi.patterns.abstractfactory.Developer;
import com.borymskyi.patterns.abstractfactory.ProjectManager;
import com.borymskyi.patterns.abstractfactory.ProjectTeamFactory;
import com.borymskyi.patterns.abstractfactory.Tester;

/**
 * @author Dmitrii Borymskyi
 * @version 1.0
 */
public class BankingTeamFactory implements ProjectTeamFactory {
    @Override
    public Developer getDeveloper() {
        return new JavaDeveloper();
    }

    @Override
    public Tester getTester() {
        return new QaTester();
    }

    @Override
    public ProjectManager getProjectManager() {
        return new BankingPM();
    }
}
