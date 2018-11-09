package com.company.homework5_3.base;

import com.company.homework5_3.flowers.ChamamileFlower;
import com.company.homework5_3.flowers.RoseFlower;
import com.company.homework5_3.flowers.TulipFlower;

public class FlowersStore {
    private float profit = 0;

    public float getProfit() {
        return profit;
    }

    public SuperFlower[] sell(int nRose, int nChamamile, int nTulip) {
        int n = nRose + nChamamile + nTulip;
        SuperFlower[] bouquet = new SuperFlower[n];
        int i = 0;
        while (i < nRose) {
            bouquet[i] = new RoseFlower();
            profit += bouquet[i++].getPrice();
        }
        while (i < nRose + nChamamile) {
            bouquet[i] = new ChamamileFlower();
            profit += bouquet[i++].getPrice();
        }
        while (i < n) {
            bouquet[i] = new TulipFlower();
            profit += bouquet[i++].getPrice();
        }
        return bouquet;
    }

    public SuperFlower[] sellSequence(int nRose, int nChamamile, int nTulip) {
        int n = nRose + nChamamile + nTulip;
        SuperFlower[] bouquet = new SuperFlower[n];
        int i = 0;
        while(i<n){
            if(nRose>0){
                bouquet[i] = new RoseFlower();
                profit+= bouquet[i].getPrice();
                nRose--;i++;
            }
            if(nChamamile>0){
                bouquet[i] = new ChamamileFlower();
                profit+= bouquet[i].getPrice();
                nChamamile--;i++;
            }
            if(nTulip>0){
                bouquet[i] = new TulipFlower();
                profit+= bouquet[i].getPrice();
                nTulip--;i++;
            }
        }
        return bouquet;
    }
}
