package org.example.structural.bridge.banas.remote;

import org.example.structural.bridge.banas.device.EntertainmentDevice;

public class TVRemoteMute extends RemoteButton{

    public TVRemoteMute(EntertainmentDevice device) {
        super(device);
    }

    @Override
    public void buttonNinePressed() {
        System.out.println("TV was muted");
    }
}
