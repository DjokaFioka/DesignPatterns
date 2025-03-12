package org.example.behavioral.observer;

public class ObserverMain {
    public static void main(String[] args) {
        // Create the Subject object
        // It will handle updating all observers
        // as well as deleting and adding them
        StockPublisher stockPublisher = new StockPublisher();

        // Create an Observer that will be sent updates from Subject
        // StockObserver observer1 = new StockObserver(stockPublisher); //
        StockObserver observer1 = new StockObserver();
        stockPublisher.register(observer1);

        stockPublisher.setIBMPrice(197.10);
        stockPublisher.setAAPLPrice(677.10);
        stockPublisher.setGOOGPrice(976.10);

        // StockObserver observer2 = new StockObserver(stockPublisher);
        StockObserver observer2 = new StockObserver();
        stockPublisher.register(observer2);

        stockPublisher.setIBMPrice(197.20);
        stockPublisher.setAAPLPrice(677.20);
        stockPublisher.setGOOGPrice(976.20);

        // Delete one of the observers
        stockPublisher.unregister(observer2);

        stockPublisher.setIBMPrice(197.30);
        stockPublisher.setAAPLPrice(677.30);
        stockPublisher.setGOOGPrice(976.30);

        System.out.println("###################################");

        // Create 3 threads using the Runnable interface
        // GetTheStock implements Runnable, so it doesn't waste
        // its one extendable class option
        Runnable getIBM = new GetTheStock(stockPublisher, 2, "IBM", 197.30);
        Runnable getAAPL = new GetTheStock(stockPublisher, 2, "AAPL", 677.30);
        Runnable getGOOG = new GetTheStock(stockPublisher, 2, "GOOG", 976.30);

        // Call for the code in run to execute

        new Thread(getIBM).start();
        new Thread(getAAPL).start();
        new Thread(getGOOG).start();
    }
}
