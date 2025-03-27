package org.example.behavioral.state.banas;

/**
 Allows an object to alter its behavior when its internal state changes. The object will appear to change its class.
 Context
 State
 Concrete State
 Example with ATM - states: hasCard, noCard, hasPin, noCash
 */
public class StateMain {

    public static void main(String[] args) {
        ATMMachine atmMachine = new ATMMachine();

        atmMachine.insertCard(); // --> state changes to hasCard
        atmMachine.ejectCard(); // --> state changes to noCard

        atmMachine.insertCard(); // --> state changes to hasCard
        atmMachine.insertPin(1234); // --> state changes to hasPin
        atmMachine.requestCash(2000); // --> state changes to noCard (card is being ejected after withdrawal) and then to noCash

        atmMachine.insertCard(); // --> state doesn't change because atm is out of money (the state is noCash)
        atmMachine.insertPin(1234); // --> state doesn't change because atm is out of money (the state is noCash)
        atmMachine.requestCash(1000); // --> state doesn't change because atm is out of money (the state is noCash)
    }

}
