package org.example.behavioral.observer.banas;

public class StockObserver implements Observer {

    private double ibmPrice;
    private double aaplPrice;
    private double googPrice;

    // Static used as a counter
    private static int observerIDTracker = 0;

    // Used to track the observers
    private final int observerID;

    // We are moving observer subscribing to publisher to the client (main method)
    public StockObserver() {
        // Assign an observer ID and increment the static counter
        this.observerID = ++observerIDTracker;
        // Message notifies user of new observer
        System.out.println("New Observer " + this.observerID);
    }

    // Will hold reference to the StockGrabber object
    // private Subject stockPublisher;

//    public StockObserver(Publisher stockPublisher) {
//        // Store the reference to the stockGrabber object so
//        // I can make calls to its methods
//        this.stockPublisher = stockPublisher;
//
//        // Assign an observer ID and increment the static counter
//        this.observerID = ++observerIDTracker;
//        // Message notifies user of new observer
//        System.out.println("New Observer " + this.observerID);
//
//        // Add the observer to the Subjects ArrayList
//        stockPublisher.register(this);
//    }

    // Called to update all observers
    public void update(double ibmPrice, double aaplPrice, double googPrice) {
        this.ibmPrice = ibmPrice;
        this.aaplPrice = aaplPrice;
        this.googPrice = googPrice;

        printThePrices();
    }

    public void printThePrices() {
        System.out.println("Observer = " + observerID + "\nIBM: " + ibmPrice + "\nAAPL: " +
                aaplPrice + "\nGOOG: " + googPrice + "\n");
    }
}
