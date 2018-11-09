package com.company.homework5_3.flowers;

import com.company.homework5_3.base.SuperFlower;

public class TulipFlower extends SuperFlower {
    public TulipFlower() {
        super(50f);
    }

    @Override
    public void show() {
        System.out.print("Тюльпан ");
    }
}
