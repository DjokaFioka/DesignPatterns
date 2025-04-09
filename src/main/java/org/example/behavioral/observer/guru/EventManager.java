package org.example.behavioral.observer.guru;

import org.example.behavioral.observer.guru.listeners.EventListener;

import java.io.File;
import java.util.*;

public class EventManager {
    Map<String, List<org.example.behavioral.observer.guru.listeners.EventListener>> listeners = new HashMap<>();

    public EventManager(String... operations) {
        for (String operation : operations) {
            this.listeners.put(operation, new ArrayList<>());
        }
    }

    public void subscribe(String eventType, org.example.behavioral.observer.guru.listeners.EventListener listener) {
        List<org.example.behavioral.observer.guru.listeners.EventListener> users = listeners.get(eventType);
        users.add(listener);
    }

    public void unsubscribe(String eventType, org.example.behavioral.observer.guru.listeners.EventListener listener) {
        List<org.example.behavioral.observer.guru.listeners.EventListener> users = listeners.get(eventType);
        users.remove(listener);
    }

    public void notify(String eventType, File file) {
        List<org.example.behavioral.observer.guru.listeners.EventListener> users = listeners.get(eventType);
        for (EventListener listener : users) {
            listener.update(eventType, file);
        }
    }
}
