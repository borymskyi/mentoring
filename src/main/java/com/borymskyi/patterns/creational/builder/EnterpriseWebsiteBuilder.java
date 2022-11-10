package com.borymskyi.patterns.creational.builder;

/**
 * @author Dmitrii Borymskyi
 * @version 1.0
 */
public class EnterpriseWebsiteBuilder extends WebsiteBuilder {
    @Override
    void buildName() {
        website.setName("Enterprise web site");
    }

    @Override
    void buildCms() {
        website.setCms(Cms.ALIFRESCO);
    }

    @Override
    void buildPrice() {
        website.setPrice(10000);
    }
}
