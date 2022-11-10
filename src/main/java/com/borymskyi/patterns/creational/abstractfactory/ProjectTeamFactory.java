package com.borymskyi.patterns.creational.abstractfactory;

/**
 * @author Dmitrii Borymskyi
 * @version 1.0
 */
public interface ProjectTeamFactory {
    Developer getDeveloper();

    Tester getTester();

    ProjectManager getProjectManager();
}
