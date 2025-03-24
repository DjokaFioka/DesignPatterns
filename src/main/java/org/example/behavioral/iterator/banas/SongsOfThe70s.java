package org.example.behavioral.iterator.banas;

import java.util.ArrayList;
import java.util.Iterator;

public class SongsOfThe70s implements SongIterator{

    ArrayList<SongInfo> bestSongs;

    public SongsOfThe70s() {
       bestSongs = new ArrayList<>();

        addSong("Imagine", "John Lennon", 1971);
        addSong("American Pie", "Don McLean", 1971);
        addSong("I Will Survive", "Gloria Gaynor", 1979);
    }

    private void addSong(String songName, String bandName, int yearReleased) {
        var song = new SongInfo(songName, bandName, yearReleased);
        bestSongs.add(song);
    }

//    public ArrayList<SongInfo> getBestSongs() {
//        return bestSongs;
//    }


    @Override
    public Iterator<SongInfo> createIterator() {
        return bestSongs.iterator();
    }
}
