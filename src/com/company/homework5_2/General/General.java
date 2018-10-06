package com.company.homework5_2.General;

public abstract class General {
    protected String song1 = "Dua Lipa - New Rules";
    protected String[] playlist = new String[]{"Pink! - What About Us", "Katy Perry - Swish Swish",
            "Imagine Dragons - Thunder", "Hurts - Beautiful ones", "Lady Gaga - Million Reasons"};

    protected String getSong1() {
        return song1;
    }

    protected String[] getPlaylist() {
        return playlist;
    }

    protected String getPlayListIndexOfSong(int i) {
        return playlist[i];
    }

    public abstract void playSong();
}
