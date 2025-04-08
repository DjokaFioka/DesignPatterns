package org.example.behavioral.memento.guru;

import org.example.behavioral.memento.guru.shapes.Circle;
import org.example.behavioral.memento.guru.shapes.CompoundShape;
import org.example.behavioral.memento.guru.shapes.Dot;
import org.example.behavioral.memento.guru.shapes.Rectangle;

import java.awt.*;

/**
 Memento is a behavioral design pattern that lets you save and restore the previous state of an object without revealing the details of its implementation.
 * */
public class MementoMain {
    public static void main(String[] args) {
        Editor editor = new Editor();
        editor.loadShapes(
                new Circle(10, 10, 10, Color.BLUE),

                new CompoundShape(
                        new Circle(110, 110, 50, Color.RED),
                        new Dot(160, 160, Color.RED)
                ),

                new CompoundShape(
                        new Rectangle(250, 250, 100, 100, Color.GREEN),
                        new Dot(240, 240, Color.GREEN),
                        new Dot(240, 360, Color.GREEN),
                        new Dot(360, 360, Color.GREEN),
                        new Dot(360, 240, Color.GREEN)
                )
        );
    }
}
