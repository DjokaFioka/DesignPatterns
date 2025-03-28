package org.example.behavioral.chain_of_responsibility.guru.csharp;

public class ChainOfRespMain {
    public static void main(String[] args) {
        var monkey = new MonkeyHandler();
        var squirrel = new SquirrelHandler();
        var dog = new DogHandler();

        monkey.setNext(squirrel).setNext(dog);

        // The client should be able to send a request to any handler, not
        // just the first one in the chain.
        System.out.println("Chain: Monkey > Squirrel > Dog");
        var client = new Client();
        client.doStuff(monkey);

        System.out.println("-------------------");
        System.out.println("Chain: Squirrel > Dog");
        client.doStuff(squirrel);

    }
}
