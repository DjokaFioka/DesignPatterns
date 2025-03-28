package org.example.behavioral.chain_of_responsibility.guru.csharp;

public class SquirrelHandler extends AbstractHandler{
    @Override
    public String handle(String request) {
        if (request.equalsIgnoreCase("nut")) {
            return "Squirrel: I'll eat the " + request;
        } else {
            return super.handle(request);
        }
    }
}
