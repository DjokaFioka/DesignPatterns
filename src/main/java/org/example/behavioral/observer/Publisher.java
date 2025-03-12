package org.example.behavioral.observer;

public interface Publisher {
    void register(Observer o);
    void unregister(Observer o);
    void notifyObserver();
}
