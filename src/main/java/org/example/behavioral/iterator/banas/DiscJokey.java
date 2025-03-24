package org.example.behavioral.iterator.banas;

import java.util.ArrayList;
import java.util.Enumeration;
import java.util.Hashtable;
import java.util.Iterator;

public class DiscJokey {
//    SongsOfThe70s songs70s;
//    SongsOfThe80s songs80s;
//    SongsOfThe90s songs90s;

    SongIterator iter70sSongs;
    SongIterator iter80sSongs;
    SongIterator iter90sSongs;

//    public DiscJokey(SongsOfThe70s songs70s, SongsOfThe80s songs80s, SongsOfThe90s songs90s) {
//        this.songs70s = songs70s;
//        this.songs80s = songs80s;
//        this.songs90s = songs90s;
//    }

    public DiscJokey(SongIterator songs70s, SongIterator songs80s, SongIterator songs90s) {
        this.iter70sSongs = songs70s;
        this.iter80sSongs = songs80s;
        this.iter90sSongs = songs90s;
    }

    public void showTheSongs() {
//        ArrayList al70sSongs = songs70s.getBestSongs();
//
//        System.out.println("\nSongs of the 70s\n");
//        for (int i = 0; i < al70sSongs.size(); i++) {
//            SongInfo bestSongs = (SongInfo) al70sSongs.get(i);
//            System.out.println(bestSongs.getSongName() + " by " + bestSongs.getBandName() + " from " + bestSongs.getYearReleased());
//        }
//
//        SongInfo[] arr80sSongs = songs80s.getBestSongs();
//
//        System.out.println("\nSongs og the 80s\n");
//        for (int i = 0; i < arr80sSongs.length; i++) {
//            SongInfo bestSongs = arr80sSongs[i];
//            System.out.println(bestSongs.getSongName() + " by " + bestSongs.getBandName() + " from " + bestSongs.getYearReleased());
//        }
//
//        Hashtable<Integer, SongInfo> ht90sSongs = songs90s.getBestSongs();
//
//        System.out.println("\nSongs og the 90s\n");
//        for (Enumeration<Integer> e = ht90sSongs.keys(); e.hasMoreElements();) {
//            SongInfo bestSongs = ht90sSongs.get(e.nextElement());
//            System.out.println(bestSongs.getSongName() + " by " + bestSongs.getBandName() + " from " + bestSongs.getYearReleased());
//        }
//
//        for (int i = 0; i < ht90sSongs.size(); i++) {
//            SongInfo bestSongs = ht90sSongs.get(i);
//            System.out.println(bestSongs.getSongName() + " by " + bestSongs.getBandName() + " from " + bestSongs.getYearReleased());
//        }
    }

    public void showTheSongs2() {
        Iterator<SongInfo> songs70s = iter70sSongs.createIterator();
        Iterator<SongInfo> songs80s = iter80sSongs.createIterator();
        Iterator<SongInfo> songs90s = iter90sSongs.createIterator();

        System.out.println("\nSongs og the 70s\n");
        printTheSongs(songs70s);

        System.out.println("\nSongs og the 80s\n");
        printTheSongs(songs80s);

        System.out.println("\nSongs og the 90s\n");
        printTheSongs(songs90s);
    }

    private void printTheSongs(Iterator<SongInfo> iterator) {
        while (iterator.hasNext()) {
            var song = (SongInfo) iterator.next();
            System.out.println(song.getSongName() + " by " + song.getBandName() + " from " + song.getYearReleased());
        }
    }
}
