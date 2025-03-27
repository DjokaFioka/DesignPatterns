package org.example.behavioral.state.banas;

import org.example.behavioral.state.banas.states.*;

// Context
public class ATMMachine {
    private ATMState hasCard;
    private ATMState noCard;
    private ATMState hasCorrectPin;
    private ATMState atmOutOfMoney;

    private ATMState atmState;

    private int cashInMachine = 2000;
    private boolean correctPinEntered = false;

    public ATMMachine() {
        hasCard = new HasCard(this);
        noCard = new NoCard(this);
        hasCorrectPin = new HasPin(this);
        atmOutOfMoney = new NoCash(this);

        atmState = noCard;

        if (cashInMachine < 0) {
            atmState = atmOutOfMoney;
        }
    }

    public void setAtmState(ATMState newState) {
        atmState = newState;
    }

    public void setCashInMachine(int cashInMachine){
        this.cashInMachine = cashInMachine;
    }

    public int getCashInMachine() {
        return cashInMachine;
    }

    public boolean isCorrectPinEntered() {
        return correctPinEntered;
    }

    public void setCorrectPinEntered(boolean correctPinEntered) {
        this.correctPinEntered = correctPinEntered;
    }

    public void insertCard() {
        atmState.insertCard();
    }

    public void ejectCard() {
        atmState.ejectCard();
    }

    public void requestCash(int cash) {
        atmState.requestCash(cash);
    }

    public void insertPin(int pin) {
        atmState.insertPin(pin);
    }

    public ATMState getYesCardState() {
        return hasCard;
    }

    public ATMState getNoCardState() {
        return noCard;
    }

    public ATMState getHasPin() {
        return hasCorrectPin;
    }

    public ATMState getNoCashState() {
        return atmOutOfMoney;
    }


}
