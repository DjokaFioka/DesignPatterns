package org.example.behavioral.chain_of_responsibility.guru;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 Chain of Responsibility is a behavioral design pattern that lets you pass requests along a chain of handlers.
 Upon receiving a request, each handler decides either to process the request or to pass it to the next handler in the chain.
 * */
public class ChainOfRespMain {
    private static BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
    private static Server server;

    public static void main(String[] args) throws IOException {
        init();

        boolean success;
        do {
            System.out.print("Enter email: ");
            String email = reader.readLine();
            System.out.print("Input password: ");
            String password = reader.readLine();
            success = server.logIn(email, password);
        } while (!success);
    }

    private static void init() {
        server = new Server();
        server.register("admin@example.com", "1234");
        server.register("user@example.com", "123");

        // All checks are linked. Client can build various chains using the same
        // components.
        Middleware middleware = Middleware.link(
                new ThrottlingMiddleware(2),
                new UserExistsMiddleware(server),
                new RoleCheckMiddleware()
        );

        // Server gets a chain from client code.
        server.setMiddleware(middleware);
    }
}
