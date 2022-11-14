package com.borymskyi.patterns.bihavioral.observer2;

/**
 * @author Dmitrii Borymskyi
 * @version 1.0
 */
public interface Observed {
    void addObserver(Observer observer);

    void removeObserver(Observer observer);

    void notifyObservers();
}
