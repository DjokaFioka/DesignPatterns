package org.example.behavioral.chain_of_responsibility.banas;

public class DivideNumbers implements Chain{
    private Chain nextInChain;

    @Override
    public void setNextInChain(Chain nextChain) {
        this.nextInChain = nextChain;
    }

    @Override
    public void calculate(Numbers request) {
        if (request.getCalcMethod().equalsIgnoreCase("div")) {
            if (request.getNumber2() == 0) {
                System.out.println("You cannot divide by 0");
                return;
            }
            var total = request.getNumber1() / request.getNumber2();
            System.out.println(request.getNumber1() + " / " + request.getNumber2() + " = " + total);
        } else {
            System.out.println("Unsupported calculation method. Please use add, sub, mult, div");
        }
    }
}
