package org.example.behavioral.command.banas;

public class TVRemote {
    public static ElectronicDevice getDevice() {
        return new Television();
    }
}
