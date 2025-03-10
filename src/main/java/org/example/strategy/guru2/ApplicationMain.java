package org.example.strategy.guru2;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class ApplicationMain {
    private static final BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

    public static void main(String[] args) {
        Context context = new Context();

        try {
            System.out.print("Set the first number:");
            String s1 = reader.readLine();

            System.out.print("Set the second number:");
            String s2 = reader.readLine();

            System.out.print("Set the action (A/S/M):");
            String action = reader.readLine();

            if (action.equalsIgnoreCase("A")) {
                context.setStrategy(new StrategyAdd());
            } else if (action.equalsIgnoreCase("S")) {
                context.setStrategy(new StrategySubtract());
            } else if (action.equalsIgnoreCase("M")) {
                context.setStrategy(new StrategyMultitply());
            } else {
                System.out.println("Unknown strategy selected");
                return;
            }

            int result = context.executeStrategy(Integer.parseInt(s1.stripLeading()), Integer.parseInt(s2.stripLeading()));

            System.out.println("The result is " + result);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }


    }
}
