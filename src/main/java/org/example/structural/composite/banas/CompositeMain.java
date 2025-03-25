package org.example.structural.composite.banas;

/**
 Composite is a structural design pattern that lets you compose objects into tree structures
 and then work with these structures as if they were individual objects.
 Allows you to treat individual objects and compositions of objects uniformly
 Allows you to structure data or represent the inner working of every part of a whole object individually

                     SongGroup
   /    /    /    /           \
 Song Song Song Song         SongGroup
                           /       \    \
                        SongGroup Song Song
                         /    \
                        Song Song
 * */

public class CompositeMain {
    public static void main(String[] args) {
        SongComponent industrialMusic = new SongGroup("Industrial", "is a style of experimental music that draws on transgressive and provocative themes");
        SongComponent heavyMetalMusic = new SongGroup("Heavy Metal", "is a genre of rock that developed in the late 1960s, largely in the UK and in the US");
        SongComponent dubstepMusic = new SongGroup("Dubstep", "is a genre of electronic dance music that originated in South London, England");

        //Root
        SongComponent allSongs = new SongGroup("Song List", "Every Song Available");

        //Adding child component
        allSongs.add(industrialMusic);

        //Adding individual songs into industrial music song group (adding child components to a child component (leaves))
        industrialMusic.add(new Song("Head Like a Hole", "NIN", 1990));
        industrialMusic.add(new Song("Headhunter", "Front 242", 1988));

        //Adding dubstep song group into industrial music song group
        industrialMusic.add(dubstepMusic);

        //Adding individual songs into dubstep music song group
        dubstepMusic.add(new Song("Centepide", "Knife Party", 2012));
        dubstepMusic.add(new Song("Tetris", "Doctor P", 2011));

        allSongs.add(heavyMetalMusic);

        //Adding individual songs into dubstep music song group
        heavyMetalMusic.add(new Song("War Pigs", "Black Sabath", 1970));
        heavyMetalMusic.add(new Song("Ace Of Spades", "Motorhead", 1980));

        DiscJokey djOle = new DiscJokey(allSongs);
        djOle.getSongList();

    }
}
