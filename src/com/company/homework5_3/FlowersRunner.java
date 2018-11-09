package com.company.homework5_3;

import com.company.homework5_3.base.FlowersLoader;
import com.company.homework5_3.base.FlowersSaver;
import com.company.homework5_3.base.FlowersStore;
import com.company.homework5_3.base.SuperFlower;

public class FlowersRunner {
    public static void main(String[] args) {
    final String PATH = "./store.txt";
    FlowersStore store = new FlowersStore();
    SuperFlower[] bouquet1 = store.sell(1, 2,2);
        for (SuperFlower flower : bouquet1) {
        flower.show();
    }
        System.out.println();
        System.out.println("~--------------------------------------------~");
        System.out.println("Прибыль: " + store.getProfit() );
        System.out.println("~--------------------------------------------~");

    bouquet1 = store.sellSequence(2,3,2);
        for (SuperFlower flower : bouquet1) {
        flower.show();
    }

        System.out.println();
        System.out.println("~--------------------------------------------~");
        System.out.println("Прибыль: " + store.getProfit() );
        System.out.println("~--------------------------------------------~");

        FlowersSaver.save(bouquet1, PATH);
    bouquet1 = FlowersLoader.load(PATH);
}
}
