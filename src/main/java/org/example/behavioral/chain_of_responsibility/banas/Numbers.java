package org.example.behavioral.chain_of_responsibility.banas;

public class Numbers {
    private int number1;
    private int number2;
    private String calcMethod;

    public Numbers(int number1, int number2, String calcMethod) {
        this.number1 = number1;
        this.number2 = number2;
        this.calcMethod = calcMethod;
    }

    public int getNumber1() {
        return number1;
    }

    public void setNumber1(int number1) {
        this.number1 = number1;
    }

    public int getNumber2() {
        return number2;
    }

    public void setNumber2(int number2) {
        this.number2 = number2;
    }

    public String getCalcMethod() {
        return calcMethod;
    }

    public void setCalcMethod(String calcMethod) {
        this.calcMethod = calcMethod;
    }
}
