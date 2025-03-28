package org.example.behavioral.chain_of_responsibility.guru.csharp;

public class DogHandler extends AbstractHandler{

    @Override
    public String handle(String request) {
        if (request.equalsIgnoreCase("meatball")) {
            return "Dog: I'll eat the " + request;
        } else {
            return super.handle(request);
        }
    }
}
