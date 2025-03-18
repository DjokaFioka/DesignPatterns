package org.example.structural.bridge.banas.device;

public class DVDDevice extends EntertainmentDevice{

    public DVDDevice(int newDeviceState, int newMaxSetting) {
        deviceState = newDeviceState;
        maxSetting = newMaxSetting;
    }

    @Override
    public void buttonFivePressed() {
        System.out.println("Previous chapter ");
        deviceState--;
    }

    @Override
    public void buttonSixPressed() {
        System.out.println("Next chapter ");
        deviceState--;
    }
}
