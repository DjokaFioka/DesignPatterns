package org.example.behavioral.interpreter.net_core_central;

import java.util.Scanner;

public class InterpreterMain {
    public static void main(String[] args) {
        System.out.println("Provide a word");
        Scanner scanner = new Scanner(System.in);

        var word = scanner.nextLine();
        System.out.println("Provide an expression (-l for lowercase, -u for uppercase)");

        var expression = scanner.nextLine();

        var interpreter = new Interpreter();
        interpreter.interpret(new Context(expression,word));

    }
}
