package org.example.structural.bridge.banas;

import org.example.structural.bridge.banas.device.DVDDevice;
import org.example.structural.bridge.banas.device.TVDevice;
import org.example.structural.bridge.banas.remote.DVDRemote;
import org.example.structural.bridge.banas.remote.RemoteButton;
import org.example.structural.bridge.banas.remote.TVRemoteMute;
import org.example.structural.bridge.banas.remote.TVRemotePause;

/**
 Decouple an abstraction from its implementation so that the two can vary independently
 * */
public class BridgeMain {
    public static void main(String[] args) {
        RemoteButton theTV = new TVRemoteMute(new TVDevice(1, 200));
        RemoteButton theTV2 = new TVRemotePause(new TVDevice(1, 200));
        RemoteButton theDVD = new DVDRemote(new DVDDevice(1, 15));

        System.out.println("Test TV with Mute Remote");
        theTV.buttonFivePressed();
        theTV.buttonSixPressed();
        theTV.buttonNinePressed();

        System.out.println("Test TV with Pause Remote");
        theTV2.buttonFivePressed();
        theTV2.buttonSixPressed();
        theTV2.buttonSixPressed();
        theTV2.buttonSixPressed();
        theTV2.buttonSixPressed();
        theTV2.buttonNinePressed();

        System.out.println("Test DVD with Pause Remote");
        theDVD.buttonFivePressed();
        theDVD.buttonSixPressed();
        theDVD.buttonSixPressed();
        theDVD.buttonSixPressed();
        theDVD.buttonFivePressed();
        theDVD.buttonNinePressed();

    }
}
