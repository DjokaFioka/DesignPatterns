package org.example.structural.bridge.banas.remote;

import org.example.structural.bridge.banas.device.EntertainmentDevice;

public class TVRemotePause extends RemoteButton{

    public TVRemotePause(EntertainmentDevice device) {
        super(device);
    }

    @Override
    public void buttonNinePressed() {
        System.out.println("TV was paused");
    }
}
