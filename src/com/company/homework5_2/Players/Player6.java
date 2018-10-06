package com.company.homework5_2.Players;

import com.company.homework5_2.General.General;
import com.company.homework5_2.General.Playlist;

public class Player6 extends General implements Playlist {
    private final float price;

    public Player6(float price) {
        this.price = price;
    }

    public float getPrice() {
        return price;
    }

    @Override
    public void playSong() {
        System.out.println("Playing: " + getPlayListIndexOfSong(0));
    }

    @Override
    public void playAllSongs() {
        System.out.println("\t\t\tPlaylist 6");
        for (int i = 0; i < getPlaylist().length; i++) {
            System.out.println("\t Playing: " + getPlayListIndexOfSong(i));
        }
    }

    public void shuffle() {
        int i;
        System.out.println("\t\t\tShuffle");
        for (int j = 0; j < getPlaylist().length; j++) {
            i = (int) Math.round(Math.random() * (getPlaylist().length - 1));
            System.out.println("\tPlaying: " + getPlayListIndexOfSong(i));
        }
        System.out.println("~------------------------------------------------------~");
    }
}
