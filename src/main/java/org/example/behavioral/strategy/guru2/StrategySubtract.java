package org.example.behavioral.strategy.guru2;

public class StrategySubtract implements Strategy{
    @Override
    public int execute(int a, int b) {
        return a - b;
    }
}
