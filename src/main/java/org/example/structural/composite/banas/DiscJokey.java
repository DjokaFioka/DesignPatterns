package org.example.structural.composite.banas;

public class DiscJokey {
    private SongComponent songList;

    public DiscJokey(SongComponent songList) {
        this.songList = songList;
    }

    public void getSongList() {
        songList.displaySongInfo();
    }
}
