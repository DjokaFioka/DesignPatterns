package org.example.behavioral.mediator.guru;

import org.example.behavioral.mediator.guru.components.*;

import javax.swing.*;

/**
 Mediator is a behavioral design pattern that lets you reduce chaotic dependencies between objects.
 The pattern restricts direct communications between the objects and forces them to collaborate only via a mediator object.
 Usage examples: The most popular usage of the Mediator pattern in Java code is facilitating communications between GUI components of an app.
 The synonym of the Mediator is the Controller part of MVC pattern.
 * */

public class MediatorMain {
    public static void main(String[] args) {
        Mediator mediator = new Editor();

        mediator.registerComponent(new Title());
        mediator.registerComponent(new TextBox());
        mediator.registerComponent(new AddButton());
        mediator.registerComponent(new DeleteButton());
        mediator.registerComponent(new SaveButton());
        mediator.registerComponent(new List(new DefaultListModel()));
        mediator.registerComponent(new Filter());

        mediator.createGUI();
    }
}
