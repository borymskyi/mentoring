package com.borymskyi.patterns.bihavioral.observer2;

import java.util.List;

/**
 * @author Dmitrii Borymskyi
 * @version 1.0
 */
public class Subscriber implements Observer {
    String name;

    public Subscriber(String name) {
        this.name = name;
    }

    @Override
    public void handleEvent(List<String> vacanсies) {
        System.out.println("Dear " + name + "\nWe have some changes in vacancies:" + vacanсies +
                "\n=====================================\n");
    }
}
