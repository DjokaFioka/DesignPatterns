package org.example.strategy.guru2;

public class StrategyMultitply implements Strategy {
    @Override
    public int execute(int a, int b) {
        return a * b;
    }
}
