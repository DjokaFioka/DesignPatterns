package org.example.abstract_factory.banas.engine;

public class ESUFOEngine implements ESEngine {
    @Override
    public String getTopSpeed() {
        //System.out.println("Runs 1000 mph");
        return "1000 mph";
    }
}
