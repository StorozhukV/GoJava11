package com.company.homework5_2.Players;

import com.company.homework5_2.General.General;
import com.company.homework5_2.General.Playlist;

public class Player4 extends General implements Playlist {
    private final float price;
    public Player4(float price) {
        this.price = price;
    }

    public float getPrice() {
        return price;
    }

    @Override
    public void playSong() {
        int i = getPlaylist().length - 1;
        System.out.println("Playing: " + getPlayListIndexOfSong(i));
    }

    @Override
    public void playAllSongs() {
        System.out.println("\t\t\tPlaylist 4");
        for (int i = 0; i < getPlaylist().length; i++){
            System.out.println("\t Playing: " + getPlayListIndexOfSong(i));
        }
        System.out.println("~------------------------------------------------------~");
    }
}
