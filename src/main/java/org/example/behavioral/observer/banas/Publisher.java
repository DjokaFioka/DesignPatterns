package org.example.behavioral.observer.banas;

public interface Publisher {
    void register(Observer o);
    void unregister(Observer o);
    void notifyObserver();
}
