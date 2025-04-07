package org.example.behavioral.mediator.guru.components;

import org.example.behavioral.mediator.guru.Mediator;

public interface Component {
    void setMediator(Mediator mediator);
    String getName();
}
