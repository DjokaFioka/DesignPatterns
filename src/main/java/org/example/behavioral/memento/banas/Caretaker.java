package org.example.behavioral.memento.banas;

import java.util.ArrayList;

public class Caretaker {
    private final ArrayList<Memento> savedArticles = new ArrayList<>();

    public void addMemento(Memento memento) {
        savedArticles.add(memento);
    }

    public Memento getMemento(int index) {
        return savedArticles.get(index);
    }
}
