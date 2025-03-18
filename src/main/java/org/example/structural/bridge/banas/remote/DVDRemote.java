package org.example.structural.bridge.banas.remote;

import org.example.structural.bridge.banas.device.EntertainmentDevice;

public class DVDRemote extends RemoteButton{

    public DVDRemote(EntertainmentDevice device) {
        super(device);
    }

    @Override
    public void buttonNinePressed() {
        System.out.println("DVD was paused");
    }
}
