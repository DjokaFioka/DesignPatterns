package org.example.behavioral.visitor.guru.shapes;

import org.example.behavioral.visitor.guru.Visitor;

public interface Shape {
    void move(int x, int y);
    void draw();
    String accept(Visitor visitor);
}
