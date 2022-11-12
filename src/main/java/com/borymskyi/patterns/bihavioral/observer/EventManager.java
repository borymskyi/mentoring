package com.borymskyi.patterns.bihavioral.observer;

import com.borymskyi.patterns.bihavioral.observer.EventListener;

import java.io.File;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * Издатель
 *
 * @author Dmitrii Borymskyi
 * @version 1.0
 */
public class EventManager {
    Map<String, List<EventListener>> listeners = new HashMap<>();

    public EventManager(String... operations) {
        for (String o : operations) {
            this.listeners.put(o, new ArrayList<>());
        }
    }

    public void subscribe(String eventType, EventListener listener) {
        List<EventListener> users = getListeners().get(eventType);
        users.add(listener);
    }

    public void unsubscribe(String eventType, EventListener listener) {
        List<EventListener> users = getListeners().get(eventType);
        users.remove(listener);

    }

    public void notify(String eventType, File file) {
        List<EventListener> users = getListeners().get(eventType);
        for (EventListener listener : getListeners().get(eventType)) {

            listener.update(eventType, file);
        }
    }

    public Map<String, List<EventListener>> getListeners() {
        return listeners;
    }
}
