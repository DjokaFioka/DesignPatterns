package org.example.behavioral.template.guru;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 Template Method is a behavioral design pattern that defines the skeleton of an algorithm in the superclass
 but lets subclasses override specific steps of the algorithm without changing its structure.
 * */

public class TemplateMain {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        SocialNetwork network = null;
        System.out.print("Input user name: ");
        String userName = reader.readLine();
        System.out.print("Input password: ");
        String password = reader.readLine();

        // Enter the message.
        System.out.print("Input message: ");
        String message = reader.readLine();

        System.out.println("\nChoose social network for posting message.\n" +
                "1 - Facebook\n" +
                "2 - Twitter");
        int choice = Integer.parseInt(reader.readLine());

        // Create proper network object and send the message.
        if (choice == 1) {
            network = new Facebook(userName, password);
        } else if (choice == 2) {
            network = new Twitter(userName, password);
        }
        network.post(message);
    }

}
