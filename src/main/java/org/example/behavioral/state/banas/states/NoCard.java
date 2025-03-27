package org.example.behavioral.state.banas.states;

import org.example.behavioral.state.banas.ATMMachine;

// How the ATM behaves when it doesn't have a card
public class NoCard implements ATMState {
    private ATMMachine atmMachine;

    public NoCard(ATMMachine atmMachine) {
        this.atmMachine = atmMachine;
    }

    @Override
    public void insertCard() {
        System.out.println("Please Enter a PIN");
        atmMachine.setAtmState(atmMachine.getYesCardState());
    }

    @Override
    public void ejectCard() {
        System.out.println("Insert a card first");
    }

    @Override
    public void insertPin(int pin) {
        System.out.println("Insert a card first");
    }

    @Override
    public void requestCash(int cash) {
        System.out.println("Insert a card first");
    }
}
