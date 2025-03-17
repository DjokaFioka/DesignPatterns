package org.example.behavioral.command.banas;

public class TurnVolumeDown implements Command {
    ElectronicDevice device;

    public TurnVolumeDown(ElectronicDevice device) {
        this.device = device;
    }

    @Override
    public void execute() {
        device.volumeDown();
    }

    @Override
    public void undo() {
        device.volumeUp();
    }
}
