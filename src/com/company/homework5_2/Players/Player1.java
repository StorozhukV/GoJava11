package com.company.homework5_2.Players;

import com.company.homework5_2.General.General;

public class Player1 extends General {
    private final float price;
    public Player1(float price) {
        this.price = price;
    }

    public float getPrice() {
        return price;
    }

    @Override
    public void playSong() {
        System.out.println("Playing: "+getSong1());
        System.out.println("~------------------------------------------------------~");
    }
}
