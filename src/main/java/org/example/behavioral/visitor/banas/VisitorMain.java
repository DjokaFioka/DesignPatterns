package org.example.behavioral.visitor.banas;

/**
 Allows you to add methods to classes of different types without altering to those classes
 You make completely different methods depending on the class used
 Allows you to define external classes that can extend other classes without majorly editing them
 * */
public class VisitorMain {
    public static void main(String[] args) {
        TaxVisitor taxCalc = new TaxVisitor();
        TaxHolidayVisitor taxHolidayVisitor = new TaxHolidayVisitor();

        Necessity milk = new Necessity(3.47);
        Liquor vodka = new Liquor(11.99);
        Tobacco cigars = new Tobacco(19.99);

        System.out.println("Regular Prices\n");

        System.out.println(milk.accept(taxCalc));
        System.out.println(vodka.accept(taxCalc));
        System.out.println(cigars.accept(taxCalc));

        System.out.println("\n----------------------");
        System.out.println("Tax Holiday Prices\n");

        System.out.println(milk.accept(taxHolidayVisitor));
        System.out.println(vodka.accept(taxHolidayVisitor));
        System.out.println(cigars.accept(taxHolidayVisitor));
    }
}
