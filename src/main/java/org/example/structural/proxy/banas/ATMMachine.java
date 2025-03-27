package org.example.structural.proxy.banas;

import org.example.behavioral.state.banas.states.ATMState;

// using objects from the state design pattern
public class ATMMachine extends org.example.behavioral.state.banas.ATMMachine implements GetATMData {
    @Override
    public ATMState getATMData() {
        return getAtmState();
    }
}
