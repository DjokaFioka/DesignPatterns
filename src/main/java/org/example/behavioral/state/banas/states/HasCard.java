package org.example.behavioral.state.banas.states;

import org.example.behavioral.state.banas.ATMMachine;

// How the ATM behaves when it has a card
public class HasCard implements ATMState {
    private ATMMachine atmMachine;

    public HasCard(ATMMachine atmMachine) {
        this.atmMachine = atmMachine;
    }

    @Override
    public void insertCard() {
        System.out.println("You can't insert more than 1 card");
    }

    @Override
    public void ejectCard() {
        System.out.println("Card ejected");
        atmMachine.setAtmState(atmMachine.getNoCardState());
    }

    @Override
    public void insertPin(int pin) {
        if (pin == 1234) {
            System.out.println("Correct PIN");
            atmMachine.setCorrectPinEntered(true);
            atmMachine.setAtmState(atmMachine.getHasPin());
        } else {
            System.out.println("Wrong PIN");
            atmMachine.setCorrectPinEntered(false);
            System.out.println("Card Ejected");
            atmMachine.setAtmState(atmMachine.getNoCardState());
        }
    }

    @Override
    public void requestCash(int cash) {
        System.out.println("Enter PIN first");
    }
}
