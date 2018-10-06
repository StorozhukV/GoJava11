package com.company.homework5_2.Players;

import com.company.homework5_2.General.General;
import com.company.homework5_2.General.Playlist;

public class Player3 extends General implements Playlist {
    private final float price;
    public Player3(float price) {
        this.price = price;
    }

    public float getPrice() {
        return price;
    }

    @Override
    public void playSong() {
        System.out.println("Playing: "+getPlayListIndexOfSong(0));
    }

    @Override
    public void playAllSongs() {
        System.out.println("\t\t\tPlaylist 3");
        for (int i = 0; i < getPlaylist().length; i++ ){
            System.out.println("\tPlaying: " + getPlayListIndexOfSong(i));
        }
        System.out.println("~------------------------------------------------------~");
    }
}
