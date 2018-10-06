package com.company.homework5_2.Players;

import com.company.homework5_2.General.General;
import com.company.homework5_2.General.Playlist;

public class Player5 extends General implements Playlist {
    private final float price;
    public Player5(float price) {
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
        System.out.println("\t\t\tPlaylist 5");
        for (int i = getPlaylist().length-1; i >= 0; i--) {
            System.out.println("\tPlaying: " + getPlayListIndexOfSong(i));
        }
        System.out.println("~------------------------------------------------------~");
    }
}
