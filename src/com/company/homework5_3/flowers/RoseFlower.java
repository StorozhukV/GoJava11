package com.company.homework5_3.flowers;

import com.company.homework5_3.base.SuperFlower;

public class RoseFlower extends SuperFlower {
    public RoseFlower() {
        super(100f);
    }

    @Override
    public void show() {
        System.out.print("Роза ");
    }
}
