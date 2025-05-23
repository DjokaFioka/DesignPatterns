package org.example.behavioral.observer.banas;

import java.text.DecimalFormat;

public class GetTheStock implements Runnable {

    // Could be used to set how many seconds to wait
    // in Thread.sleep() below
    // private int startTime;
    private String stock;
    private double price;

    // Will hold reference to the StockGrabber object
    private Publisher stockPublisher;

    public GetTheStock(Publisher stockPublisher, int newStartTime, String newStock, double newPrice){
        // Store the reference to the stockPublisher object so
        // I can make calls to its methods
        this.stockPublisher = stockPublisher;

        // startTime = newStartTime;  Not used to have variable sleep time
        stock = newStock;
        price = newPrice;
    }

    public void run(){
        for(int i = 1; i <= 10; i++){
            try{
                System.out.println("Update no. " + i + " for " + stock);
                // Sleep for 0.5 seconds
                Thread.sleep(500);
                // Use Thread.sleep(startTime * 1000); to
                // make sleep time variable
            }
            catch(InterruptedException e)
            {}

            // Generates a random number between -.03 and .03
            double randNum = (Math.random() * (.06)) - .03;

            // Formats decimals to 2 places
            DecimalFormat df = new DecimalFormat("#.##");

            // Change the price and then convert it back into a double
            price = Double.valueOf(df.format((price + randNum)));

            if(stock == "IBM") ((StockPublisher) stockPublisher).setIBMPrice(price);
            if(stock == "AAPL") ((StockPublisher) stockPublisher).setAAPLPrice(price);
            if(stock == "GOOG") ((StockPublisher) stockPublisher).setGOOGPrice(price);

            System.out.println(stock + ": " + df.format((price + randNum)) +
                    " " + df.format(randNum));

            System.out.println();
        }
    }
}
