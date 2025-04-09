package org.example.behavioral.observer.guru;

import org.example.behavioral.observer.guru.listeners.EmailNotificationListener;
import org.example.behavioral.observer.guru.listeners.LogOpenListener;

/**
 Observer is a behavioral design pattern that lets you define a subscription mechanism
 to notify multiple objects about any events that happen to the object they’re observing.
 * */
public class ObserverMain {
    public static void main(String[] args) {
        Editor editor = new Editor();
        editor.events.subscribe("open", new LogOpenListener("/path/to/log/file.txt"));
        editor.events.subscribe("save", new EmailNotificationListener("admin@example.com"));

        try {
            editor.openFile("test.txt");
            editor.saveFile();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
