package org.example.behavioral.visitor.banas;

public interface Visitor {
    double visit(Liquor liquor);
    double visit(Tobacco tobacco);
    double visit(Necessity necessity);
}
