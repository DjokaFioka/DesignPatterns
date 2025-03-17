package org.example.behavioral.command.banas;

import java.util.ArrayList;
import java.util.List;
/**
 Interface Electronic device with different implementations: Television, Radio
 Interface Command with method execute (later we added undo) with different implementations: TurnTVOn, Off, TurnVolumeUp, Down, TurnAllOff.
 They all get an electronic device in constructor
 Finally the DeviceButton gets the Command implementation in constructor and has methods for executing and undoing
 We create a device - this is the Receiver
 We create a specific command and pass the device to it.
 We create the DeviceButton and pass the command. This is the Invoker.
 We choose a method from the DeviceButton

* */
public class CommandMain {

    public static void main(String[] args) {
        ElectronicDevice device = TVRemote.getDevice();// or just new Television();

        TurnTVOn onCommand = new TurnTVOn(device);
        DeviceButton remoteButton = new DeviceButton(onCommand);
        remoteButton.press();

        // ----------------------

        TurnTVOff offCommand = new TurnTVOff(device);
        remoteButton = new DeviceButton(offCommand);
        remoteButton.press();

        // ----------------------

        TurnVolumeUp volumeUpCommand = new TurnVolumeUp(device);
        remoteButton = new DeviceButton(volumeUpCommand);
        remoteButton.press();
        remoteButton.press();
        remoteButton.press();

        // ----------------------

        Television theTV = new Television();
        Radio theRadio = new Radio();

        List<ElectronicDevice> devices = new ArrayList<>();
        devices.add(theTV);
        devices.add(theRadio);

        TurnAllOff turnOffDevices = new TurnAllOff(devices);
        DeviceButton turnAllOff = new DeviceButton(turnOffDevices);
        turnAllOff.press();

        // ----------------------
        turnAllOff.pressUndo();
    }
}
