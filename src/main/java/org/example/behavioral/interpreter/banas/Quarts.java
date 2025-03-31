package org.example.behavioral.interpreter.banas;

public class Quarts extends Expression{
    @Override
    public String gallons(double qty) {
        return Double.toString(qty / 4);
    }

    @Override
    public String quarts(double qty) {
        return Double.toString(qty);
    }

    @Override
    public String pints(double qty) {
        return Double.toString(qty * 2);
    }

    @Override
    public String cups(double qty) {
        return Double.toString(qty * 4);
    }

    @Override
    public String tableSpoons(double qty) {
        return Double.toString(qty * 64);
    }
}
