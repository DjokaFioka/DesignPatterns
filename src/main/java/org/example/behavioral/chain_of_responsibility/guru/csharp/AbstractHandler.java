package org.example.behavioral.chain_of_responsibility.guru.csharp;

import java.lang.reflect.InvocationHandler;

public class AbstractHandler implements Handler{
    private Handler nextHandler;

    @Override
    public Handler setNext(Handler handler) {
        nextHandler = handler;
        // Returning a handler from here will let us link handlers in a
        // convenient way like this:
        // monkey.SetNext(squirrel).SetNext(dog);
        return handler;
    }

    @Override
    public String handle(String request) {
        if (nextHandler != null) {
            return nextHandler.handle(request);
        } else {
            return null;
        }
    }
}
