package org.example.behavioral.iterator.banas;

/**
 * The iterator pattern provides a uniform way to access different collections of Objects
 * If we can write polymorphic code because we can refer to each collection of objects because they'll implement the same interface
*/
public class IteratorMain {
    public static void main(String[] args) {
        var songs70s = new SongsOfThe70s();
        var songs80s = new SongsOfThe80s();
        var songs90s = new SongsOfThe90s();

        var djMike = new DiscJokey(songs70s, songs80s, songs90s);

//        djMike.showTheSongs(); This is what we initially wrote which is the wrong approach
        djMike.showTheSongs2();
    }
}
