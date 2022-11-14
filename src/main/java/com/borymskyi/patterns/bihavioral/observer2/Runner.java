package com.borymskyi.patterns.bihavioral.observer2;

/**
 * @author Dmitrii Borymskyi
 * @version 1.0
 */
public class Runner {
    public static void main(String[] args) {
        JavaDeveloperJobSite jobSite = new JavaDeveloperJobSite();
        jobSite.addVacancy("Junior java developer");
        jobSite.addVacancy("Senior java developer");


        Subscriber subscriber = new Subscriber("Dmytrii");
        Subscriber subscriber2 = new Subscriber("Alex");

        jobSite.addObserver(subscriber);
        jobSite.addObserver(subscriber2);

        jobSite.addVacancy("Full stack developer");
        jobSite.removeVacancy("Senior java developer");
    }
}
