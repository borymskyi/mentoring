package com.borymskyi.patterns.bihavioral.observer;

import com.borymskyi.patterns.bihavioral.observer.EventListener;

import java.io.File;

/**
 * Слушатель, записывающий лог операций
 *
 * @author Dmitrii Borymskyi
 * @version 1.0
 */
public class LogOpenListener implements EventListener {
    private File log;

    public LogOpenListener(String fileName) {
        this.log = new File(fileName);
    }

    @Override
    public void update(String eventType, File file) {
        System.out.println("Save to log " + ": Someone has performed" + eventType + " operation with the following file: " + file.getName());
    }
}
