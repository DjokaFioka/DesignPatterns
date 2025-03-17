package org.example.behavioral.command.banas;

import java.util.List;

public class TurnAllOff implements Command{

    List<ElectronicDevice> devices;

    public TurnAllOff(List<ElectronicDevice> devices) {
        this.devices = devices;
    }

    @Override
    public void execute() {
        for (var device : devices) {
            device.off();
        }
    }

    @Override
    public void undo() {
        for (var device : devices) {
            device.on();
        }
    }
}
