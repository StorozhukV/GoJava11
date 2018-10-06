package com.company.homework5_2.Players;

import com.company.homework5_2.General.General;

public class Player2 extends General {
    private final float price;
    public Player2(float price) {
        this.price = price;
    }

    public float getPrice() {
        return price;
    }

    @Override
    public void playSong() {
        System.err.println("Error");
    }
}
