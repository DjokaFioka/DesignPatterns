package org.example.structural.proxy.banas;

import org.example.behavioral.state.banas.states.ATMState;

public interface GetATMData {
    ATMState getATMData();
    int getCashInMachine();
}
