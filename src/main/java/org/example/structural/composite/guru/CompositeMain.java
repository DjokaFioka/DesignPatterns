package org.example.structural.composite.guru;

import java.awt.*;

/**
 Composite is a structural design pattern that lets you compose objects into tree structures
 and then work with these structures as if they were individual objects.
 Using the Composite pattern makes sense only when the core model of your app can be represented as a tree.
 For example, imagine that you have two types of objects: Products and Boxes.
 A Box can contain several Products as well as a number of smaller Boxes.
 These little Boxes can also hold some Products or even smaller Boxes, and so on.

                   SongGroup
 /    /    /    /           \
 Song Song Song Song         SongGroup
                           /       \    \
                        SongGroup Song Song
                         /    \
                        Song Song
 * */

public class CompositeMain {
    public static void main(String[] args) {
        ImageEditor editor = new ImageEditor();

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
