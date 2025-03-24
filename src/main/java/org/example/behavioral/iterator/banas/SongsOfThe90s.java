package org.example.behavioral.iterator.banas;

import java.util.Hashtable;
import java.util.Iterator;

public class SongsOfThe90s implements SongIterator{
    Hashtable<Integer, SongInfo> bestSongs = new Hashtable<>();
    int hashKey = 0;

    public SongsOfThe90s() {

        addSong("Losing My Religion", "REM", 1991);
        addSong("Creep", "Radiohead", 1993);
        addSong("Walk on the Ocean", "Toad the Wet Sprocket", 1991);
    }

    private void addSong(String songName, String bandName, int yearReleased) {
        var song = new SongInfo(songName, bandName, yearReleased);
        bestSongs.put(hashKey, song);
        hashKey++;
    }

//    public Hashtable<Integer, SongInfo> getBestSongs() {
//        return bestSongs;
//    }

    @Override
    public Iterator<SongInfo> createIterator() {
        return bestSongs.values().iterator();
    }
}
