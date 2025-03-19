package org.example.behavioral.template.banas;

/**
 Used to create a group of subclasses that have to execute a similar group of methods
 Create an abstract class that contains a method called the TemplateMethod
 The TemplateMethod contains a series of method calls that every subclass will call
 The subclass objects can override some of the method calls
 So, Template Method is a behavioral design pattern that defines the skeleton of an algorithm in the superclass
 but lets subclasses override specific steps of the algorithm without changing its structure.
 * */
public class TemplateMain {
    public static void main(String[] args) {
        Sandwich customer15 = new ItalianSandwich();
        customer15.makeSandwich();
        System.out.println("----------------");
        Sandwich customerBoring = new VeggieSandwich();
        customerBoring.makeSandwich();
    }
}
