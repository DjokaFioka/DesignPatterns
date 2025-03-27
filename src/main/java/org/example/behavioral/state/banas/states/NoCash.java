package org.example.behavioral.state.banas.states;

import org.example.behavioral.state.banas.ATMMachine;

// How the ATM behaves when it's out of cash
public class NoCash implements ATMState {

    private ATMMachine atmMachine;

    public NoCash(ATMMachine atmMachine) {
        this.atmMachine = atmMachine;
    }

    @Override
    public void insertCard() {
        System.out.println("ATM is out of cash");
    }

    @Override
    public void ejectCard() {
        System.out.println("ATM is out of cash. You didn't insert a card");
    }

    @Override
    public void insertPin(int pin) {
        System.out.println("ATM is out of cash");
    }

    @Override
    public void requestCash(int cash) {
        System.out.println("ATM is out of cash");
    }
}
