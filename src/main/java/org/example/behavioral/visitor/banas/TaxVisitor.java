package org.example.behavioral.visitor.banas;

import java.text.DecimalFormat;

public class TaxVisitor implements Visitor {

    private DecimalFormat df = new DecimalFormat("#.##");

    public TaxVisitor() {
    }

    @Override
    public double visit(Liquor liquor) {
        System.out.println("Liquor Item: Price with Tax ");
        return Double.parseDouble(df.format((liquor.getPrice() * 0.18) + liquor.getPrice()));
    }

    @Override
    public double visit(Tobacco tobacco) {
        System.out.println("Tobacco Item: Price with Tax ");
        return Double.parseDouble(df.format((tobacco.getPrice() * 0.32) + tobacco.getPrice()));
    }

    @Override
    public double visit(Necessity necessity) {
        System.out.println("Necessity Item: Price with Tax ");
        return Double.parseDouble(df.format((necessity.getPrice() * 0) + necessity.getPrice()));
    }
}
