package org.example.behavioral.iterator.guru;

public interface SocialNetwork {
    ProfileIterator createFriendsIterator(String profileEmail);
    ProfileIterator createCoworkersIterator(String profileEmail);
}
