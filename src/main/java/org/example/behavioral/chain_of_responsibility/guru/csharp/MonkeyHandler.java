package org.example.behavioral.chain_of_responsibility.guru.csharp;

public class MonkeyHandler extends AbstractHandler{
    @Override
    public String handle(String request) {
        if (request.equalsIgnoreCase("banana")) {
            return "Monkey: I'll eat the " + request;
        } else {
            return super.handle(request);
        }
    }
}
