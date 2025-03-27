package org.example.structural.proxy.banas;

import org.example.behavioral.state.banas.states.ATMState;

public class ATMProxy implements GetATMData{

    @Override
    public ATMState getATMData() {
        ATMMachine realATM = new ATMMachine();
        return realATM.getATMData();
    }

    @Override
    public int getCashInMachine() {
        ATMMachine realATM = new ATMMachine();
        return realATM.getCashInMachine();
    }
}
