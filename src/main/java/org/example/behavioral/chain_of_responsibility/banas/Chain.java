package org.example.behavioral.chain_of_responsibility.banas;

public interface Chain {
    void setNextInChain(Chain nextInChain);
    void calculate(Numbers request);
}
