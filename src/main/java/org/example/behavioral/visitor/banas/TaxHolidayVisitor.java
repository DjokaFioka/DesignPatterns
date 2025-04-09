package org.example.behavioral.visitor.banas;

import java.text.DecimalFormat;

public class TaxHolidayVisitor implements Visitor{
    private DecimalFormat df = new DecimalFormat("#.##");

    public TaxHolidayVisitor() {
    }

    @Override
    public double visit(Liquor liquor) {
        System.out.println("Liquor Item: Price with Tax ");
        return Double.parseDouble(df.format((liquor.getPrice() * .10) + liquor.getPrice()));
    }

    @Override
    public double visit(Tobacco tobacco) {
        System.out.println("Tobacco Item: Price with Tax ");
        return Double.parseDouble(df.format((tobacco.getPrice() * .30) + tobacco.getPrice()));
    }

    @Override
    public double visit(Necessity necessity) {
        System.out.println("Necessity Item: Price with Tax ");
        return Double.parseDouble(df.format((necessity.getPrice() * 0) + necessity.getPrice()));
    }
}
