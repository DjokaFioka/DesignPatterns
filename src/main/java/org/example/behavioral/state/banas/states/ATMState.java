package org.example.behavioral.state.banas.states;

//Defining all the ways the user is going to interact with the ATM
public interface ATMState {

    void insertCard();
    void ejectCard();
    void insertPin(int pin);
    void requestCash(int cash);
}
