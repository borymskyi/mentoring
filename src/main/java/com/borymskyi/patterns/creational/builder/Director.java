package com.borymskyi.patterns.creational.builder;

/**
 * @author Dmitrii Borymskyi
 * @version 1.0
 */
public class Director {
    WebsiteBuilder websiteBuilder;

    public void setWebsiteBuilder(WebsiteBuilder websiteBuilder) {
        this.websiteBuilder = websiteBuilder;
    }

    Website buildWebsite() {
        websiteBuilder.createWebsite();
        websiteBuilder.buildName();
        websiteBuilder.buildCms();
        websiteBuilder.buildPrice();

        Website website = websiteBuilder.getWebsite();

        return website;
    }
}
