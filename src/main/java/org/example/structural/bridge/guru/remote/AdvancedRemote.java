package org.example.structural.bridge.guru.remote;

import org.example.structural.bridge.guru.device.Device;

public class AdvancedRemote extends BasicRemote{
    public AdvancedRemote(Device device) {
        super.device = device;
    }

    public void mute() {
        System.out.println("Remote: mute");
        device.setVolume(0);
    }
}
