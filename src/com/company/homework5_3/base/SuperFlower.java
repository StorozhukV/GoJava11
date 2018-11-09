package com.company.homework5_3.base;

public abstract class SuperFlower {
    private float price;

    public SuperFlower(float price) {
        this.price = price;
    }

    public float getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public abstract void show();
}
