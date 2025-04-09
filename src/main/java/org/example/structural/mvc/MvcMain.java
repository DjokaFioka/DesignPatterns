package org.example.structural.mvc;

/**
 Completely separates the Calculations and Interface from each other
 Model: Data and Methods used to work with
 View: The Interface
 Controller: Coordinates interactions between the View and Model
 * */
public class MvcMain {
    public static void main(String[] args) {
        CalculatorView theView = new CalculatorView();
        CalculatorModel theModel = new CalculatorModel();
        CalculatorController theController = new CalculatorController(theView, theModel);

        theView.setVisible(true);
    }
}
