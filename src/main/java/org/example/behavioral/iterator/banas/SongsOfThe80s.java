package org.example.behavioral.iterator.banas;

import java.util.Arrays;
import java.util.Iterator;

public class SongsOfThe80s implements SongIterator{
    SongInfo[] bestSongs;
    int arrayValue = 0;

    public SongsOfThe80s() {
        bestSongs = new SongInfo[3];

        addSong("Roam", "B52s", 1989);
        addSong("Cruel Summer", "Bananarama", 1984);
        addSong("Head Over Heels", "Tears For Fears", 1985);
    }

    private void addSong(String songName, String bandName, int yearReleased) {
        var song = new SongInfo(songName, bandName, yearReleased);
        bestSongs[arrayValue] = song;
        arrayValue++;
    }

//    public SongInfo[] getBestSongs() {
//        return bestSongs;
//    }

    @Override
    public Iterator<SongInfo> createIterator() {
        return Arrays.asList(bestSongs).iterator();
    }
}
