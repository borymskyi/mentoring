package com.borymskyi.patterns.bihavioral.observer;

import com.borymskyi.patterns.bihavioral.observer.EventListener;

import java.io.File;

/**
 * Слушатель, рассылающий email-уведомления
 *
 * @author Dmitrii Borymskyi
 * @version 1.0
 */
public class EmailNotificationListener implements EventListener {
    private String email;

    public EmailNotificationListener(String email) {
        this.email = email;
    }

    @Override
    public void update(String eventType, File file) {
        System.out.println("Email to " + email + ": Someone has performed " + eventType + " operation with the following file: " + file.getName());
    }
}
