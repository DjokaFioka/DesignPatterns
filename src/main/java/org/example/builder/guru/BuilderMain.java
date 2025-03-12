package org.example.builder.guru;

import org.example.builder.guru.builder.CarBuilder;
import org.example.builder.guru.builder.CarManualBuilder;
import org.example.builder.guru.product.Car;
import org.example.builder.guru.product.Manual;

public class BuilderMain {
    public static void main(String[] args) {
        Engineer engineer = new Engineer();

        // Engineer (Director) gets the concrete builder object from the client
        // (application code). That's because application knows better which
        // builder to use to get a specific product.
        CarBuilder builder = new CarBuilder();
        engineer.constructSportsCar(builder);

        // The final product is often retrieved from a builder object, since
        // Engineer is not aware and not dependent on concrete builders and products.
        Car car = builder.getResult();
        System.out.println("Car built:\n" + car.getCarType());

        CarManualBuilder manualBuilder = new CarManualBuilder();

        // Director may know several building recipes.
        engineer.constructSportsCar(manualBuilder);
        Manual carManual = manualBuilder.getResult();
        System.out.println("\nCar manual built:\n" + carManual.print());
    }
}
