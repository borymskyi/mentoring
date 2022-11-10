package com.borymskyi.patterns.creational.builder;

/**
 * @author Dmitrii Borymskyi
 * @version 1.0
 */
public abstract class WebsiteBuilder {
    Website website;

    void createWebsite(){
        website = new Website();
    }

    abstract void buildName();

    abstract void buildCms();

    abstract void buildPrice();

    Website getWebsite() {
        return website;
    }
}
