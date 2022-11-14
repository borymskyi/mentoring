package com.borymskyi.patterns.bihavioral.observer2;

import java.util.ArrayList;
import java.util.List;

/**
 * @author Dmitrii Borymskyi
 * @version 1.0
 */
public class JavaDeveloperJobSite implements Observed {
    List<String> vacancies = new ArrayList<>();

    List<Observer> subscribers = new ArrayList<>();

    public void addVacancy(String vacancy) {
        vacancies.add(vacancy);
        notifyObservers();
    }

    public void removeVacancy(String vacancy) {
        vacancies.remove(vacancy);
        notifyObservers();
    }

    @Override
    public void addObserver(Observer observer) {
        subscribers.add(observer);
    }

    @Override
    public void removeObserver(Observer observer) {
        subscribers.remove(observer);
    }

    @Override
    public void notifyObservers() {
        for (Observer observer : subscribers) {
            observer.handleEvent(vacancies);
        }
    }
}
