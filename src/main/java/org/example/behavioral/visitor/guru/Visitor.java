package org.example.behavioral.visitor.guru;

import org.example.behavioral.visitor.guru.shapes.Circle;
import org.example.behavioral.visitor.guru.shapes.CompoundShape;
import org.example.behavioral.visitor.guru.shapes.Dot;
import org.example.behavioral.visitor.guru.shapes.Rectangle;

public interface Visitor {
    String visitDot(Dot dot);
    String visitCircle(Circle circle);
    String visitRectangle(Rectangle rectangle);
    String visitCompoundGraphic(CompoundShape cg);
}
