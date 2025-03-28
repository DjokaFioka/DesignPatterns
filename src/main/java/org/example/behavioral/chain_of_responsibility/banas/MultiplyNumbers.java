package org.example.behavioral.chain_of_responsibility.banas;

public class MultiplyNumbers implements Chain{
    private Chain nextInChain;

    @Override
    public void setNextInChain(Chain nextChain) {
        this.nextInChain = nextChain;
    }

    @Override
    public void calculate(Numbers request) {
        if (request.getCalcMethod().equalsIgnoreCase("mult")) {
            var total = request.getNumber1() * request.getNumber2();
            System.out.println(request.getNumber1() + " * " + request.getNumber2() + " = " + total);
        } else {
            nextInChain.calculate(request);
        }
    }
}
