package com.borymskyi.patterns.creational.builder;

/**
 * @author Dmitrii Borymskyi
 * @version 1.0
 */
public class BuilderWebsiteRunner {
    public static void main(String[] args) {
        Director director = new Director();
        director.setWebsiteBuilder(new EnterpriseWebsiteBuilder());

        Website website = director.buildWebsite();

        System.out.println(website);
    }
}
