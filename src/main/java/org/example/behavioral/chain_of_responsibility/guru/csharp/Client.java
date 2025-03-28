package org.example.behavioral.chain_of_responsibility.guru.csharp;

public class Client {
    // The client code is usually suited to work with a single handler. In
    // most cases, it is not even aware that the handler is part of a chain.
    public void doStuff(AbstractHandler handler) {
        String[] food = {"Nut", "Banana", "Cup of coffee"};
        for(var f : food) {
            System.out.println("Who wants a " + f);
            var result = handler.handle(f);

            if (result != null)
                System.out.println(result);
            else
                System.out.println(f + " was left untouched.");
        }
    }
}
