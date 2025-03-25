package org.example.structural.composite.banas;

import java.util.ArrayList;
import java.util.Iterator;

public class SongGroup extends SongComponent {
    ArrayList<SongComponent> songComponents = new ArrayList<>();

    private String groupName;
    private String groupDescription;

    public SongGroup(String groupName, String groupDescription) {
        this.groupName = groupName;
        this.groupDescription = groupDescription;
    }

    public String getGroupName() {
        return groupName;
    }

    public String getGroupDescription() {
        return groupDescription;
    }

    @Override
    public void add(SongComponent newSongComponent) {
        songComponents.add(newSongComponent);
    }

    @Override
    public void remove(SongComponent newSongComponent) {
        songComponents.remove(newSongComponent);
    }

    @Override
    public SongComponent getComponent(int componentIndex) {
        return (SongComponent) songComponents.get(componentIndex);
    }

    @Override
    public void displaySongInfo() {
        System.out.println("\n" + getGroupName() + " " +
                getGroupDescription() + "\n");

        Iterator<SongComponent> songIterator = songComponents.iterator();
        while (songIterator.hasNext()) {
            SongComponent songInfo = songIterator.next();
            songInfo.displaySongInfo();
         }
    }
}
