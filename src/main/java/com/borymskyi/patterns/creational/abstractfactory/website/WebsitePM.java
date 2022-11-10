package com.borymskyi.patterns.creational.abstractfactory.website;

import com.borymskyi.patterns.creational.abstractfactory.ProjectManager;

/**
 * @author Dmitrii Borymskyi
 * @version 1.0
 */
public class WebsitePM implements ProjectManager {
    @Override
    public void manageProject() {
        System.out.println("WebsitePM manages a web project");
    }
}
