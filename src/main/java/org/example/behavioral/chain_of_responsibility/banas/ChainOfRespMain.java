package org.example.behavioral.chain_of_responsibility.banas;

/**
 Chain of Responsibility is a behavioral design pattern that sends data to an object and if that object can't use it,
 it sends it to any number of other object that may be able to use it
 Example: 4 objects that can either add, subtract, multiply or divide
 * */
public class ChainOfRespMain {
    public static void main(String[] args) {
        Chain calc1 = new AddNumbers();
        Chain calc2 = new SubctractNumbers();
        Chain calc3 = new MultiplyNumbers();
        Chain calc4 = new DivideNumbers();

        calc1.setNextInChain(calc2);
        calc2.setNextInChain(calc3);
        calc3.setNextInChain(calc4);

        var request = new Numbers(4, 2, "add");

        calc1.calculate(request);

        String[] calcMethods = {"add", "sub", "mult", "div"};
        for (String calcMethod : calcMethods) {
            request.setCalcMethod(calcMethod);
            calc1.calculate(request);
        }

        request.setCalcMethod("bljak");
        calc1.calculate(request);

    }
}
