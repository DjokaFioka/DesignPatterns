package org.example.singleton.banas.threads;

import org.example.singleton.banas.ThreadSafeSingleton;

import java.util.LinkedList;

public class GetTheTiles implements Runnable {
    @Override
    public void run() {
        // How you create a new instance of Singleton
        ThreadSafeSingleton newInstance = ThreadSafeSingleton.getInstance();
        // Get unique id for instance object
        System.out.println("Instance ID: " + System.identityHashCode(newInstance));
        // Get all of the letters stored in the List
        System.out.println(newInstance.getLetterList());
        LinkedList<String> playerOneTiles = newInstance.getTiles(7);
        System.out.println("Player 1: " + playerOneTiles);
        System.out.println("Got Tiles");
    }
}
