package org.example.structural.proxy.banas;

/**
 Proxy is a structural design pattern that lets you provide a class which will limit access to another class
 for security reasons, because an object is intensive to create, or is accessed from a remote location
*/
public class ProxyMain {
    public static void main(String[] args) {
        // using example from the state design pattern
        System.out.println("---------State--------");
        ATMMachine atmMachine = new ATMMachine();

        atmMachine.insertCard(); // --> state changes to hasCard
        atmMachine.ejectCard(); // --> state changes to noCard

        atmMachine.insertCard(); // --> state changes to hasCard
        atmMachine.insertPin(1234); // --> state changes to hasPin
        atmMachine.requestCash(2000); // --> state changes to noCard (card is being ejected after withdrawal) and then to noCash

        atmMachine.insertCard(); // --> state doesn't change because atm is out of money (the state is noCash)
        atmMachine.insertPin(1234); // --> state doesn't change because atm is out of money (the state is noCash)
        atmMachine.requestCash(1000); // --> state doesn't change because atm is out of money (the state is noCash)

        System.out.println("---------Proxy--------");
        GetATMData realATM = new ATMMachine();
        GetATMData atmProxy = new ATMProxy();

        System.out.println("\nCurrent ATM State " + atmProxy.getATMData());
        System.out.println("\nCurrent ATM Cash " + atmProxy.getCashInMachine());

        //atmProxy.setCashInMachine() //This method is unavailable
        //realATM.setCashInMachine() //This method is also unavailable because it implements the same interface
        //atmMachine.setCashInMachine(1000); // But this is because it extends the ATMMachine class from state design pattern and has access to all its methods


    }
}
