package org.example.behavioral.memento.guru;

import org.example.behavioral.memento.guru.shapes.Shape;

import java.awt.*;

/**
 Changes color of selected shape
 * */
public class ColorCommand implements Command {
    private Editor editor;
    private Color color;

    public ColorCommand(Editor editor, Color color) {
        this.editor = editor;
        this.color = color;
    }

    @Override
    public String getName() {
        return "Colorize: " + color.toString();
    }

    @Override
    public void execute() {
        for (Shape child : editor.getShapes().getSelected()) {
            child.setColor(color);
        }
    }
}
