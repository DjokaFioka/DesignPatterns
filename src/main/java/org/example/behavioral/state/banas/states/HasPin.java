package org.example.behavioral.state.banas.states;

import org.example.behavioral.state.banas.ATMMachine;

// How the ATM behaves when correct pin was entered
public class HasPin implements ATMState {
    private ATMMachine atmMachine;

    public HasPin(ATMMachine atmMachine) {
        this.atmMachine = atmMachine;
    }

    @Override
    public void insertCard() {
        System.out.println("You can't enter more than 1 card");
    }

    @Override
    public void ejectCard() {
        System.out.println("Card ejected");
        atmMachine.setAtmState(atmMachine.getNoCardState());
    }

    @Override
    public void insertPin(int pin) {
        System.out.println("You can't enter more than 1 PIN");
    }

    @Override
    public void requestCash(int cash) {
        if (cash > atmMachine.getCashInMachine()) {
            System.out.println("Not enough cash in the ATM");
            System.out.println("Card ejected");
            atmMachine.setAtmState(atmMachine.getNoCardState());
        } else {
            System.out.println(cash + " was provided by the ATM");
            atmMachine.setCashInMachine(atmMachine.getCashInMachine() - cash);

            System.out.println("Card ejected");
            atmMachine.setAtmState(atmMachine.getNoCardState());

            if (atmMachine.getCashInMachine() <= 0)
                atmMachine.setAtmState(atmMachine.getNoCashState());
        }
    }
}
