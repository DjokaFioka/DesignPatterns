package org.example.behavioral.chain_of_responsibility.guru.csharp;

public interface Handler {
    Handler setNext(Handler handler);
    String handle(String request);
}
