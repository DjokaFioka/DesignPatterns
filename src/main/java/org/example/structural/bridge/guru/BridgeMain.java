package org.example.structural.bridge.guru;

import org.example.structural.bridge.guru.device.Device;
import org.example.structural.bridge.guru.device.Radio;
import org.example.structural.bridge.guru.device.TV;
import org.example.structural.bridge.guru.remote.AdvancedRemote;
import org.example.structural.bridge.guru.remote.BasicRemote;

/**
 Bridge is a structural design pattern that lets you split a large class or a set of closely related classes
 into two separate hierarchies—abstraction and implementation—which can be developed independently of each other.
 * */

public class BridgeMain {
    public static void main(String[] args) {
        testDevice(new TV());
        testDevice(new Radio());
    }

    public static void testDevice(Device device) {
        System.out.println("Tests with basic remote.");
        BasicRemote basicRemote = new BasicRemote(device);
        basicRemote.power();
        device.printStatus();

        System.out.println("Tests with advanced remote.");
        AdvancedRemote advancedRemote = new AdvancedRemote(device);
        advancedRemote.power();
        advancedRemote.mute();
        device.printStatus();
    }
}
