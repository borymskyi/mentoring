package com.borymskyi.patterns.creational.builder;

/**
 * @author Dmitrii Borymskyi
 * @version 1.0
 */
public class VisitCardWebsiteBuilder extends WebsiteBuilder {

    @Override
    void buildName() {
        website.setName("Visit card");
    }

    @Override
    void buildCms() {
        website.setCms(Cms.WORDPRESS);
    }

    @Override
    void buildPrice() {
        website.setPrice(500);
    }
}
