package org.example.behavioral.state.guru;

/**
 The main idea is that, at any given moment, there’s a finite number of states which a program can be in.
 Within any unique state, the program behaves differently,
 and the program can be switched from one state to another instantly.
 The State pattern suggests that you create new classes for all possible states of an object
 and extract all state-specific behaviors into these classes.
 * */
public class StateMain {
    public static void main(String[] args) {
        Player player = new Player();
        UI ui = new UI(player);
        ui.init();
    }
}
