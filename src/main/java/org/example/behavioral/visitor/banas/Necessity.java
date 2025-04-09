package org.example.behavioral.visitor.banas;

public class Necessity implements Visitable {
    private final double price;

    public Necessity(double price) {
        this.price = price;
    }

    public double getPrice() {
        return price;
    }

    @Override
    public double accept(Visitor visitor) {
        return visitor.visit(this);
    }
}
