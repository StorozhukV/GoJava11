package com.company.Homework5.Car;

public class CarWheel {
    private float wheel = 1;

    public CarWheel() {
    }

    public CarWheel(float wheel) {
        this.wheel = wheel;
    }

    public float getWheel() {
        return wheel;
    }

    public void setWheel(float wheel) {
        this.wheel = wheel;
    }

    public float newWheel() {
        return wheel = 1;
    }

    public boolean eraseWheel (float percent) {
        if ((percent > 0) && (percent <= 100)) {
            if (percent / 100 > wheel) {
                wheel = 0;
            } else wheel -= percent / 100;
            return true;
        }
        return false;
    }
    public float statusOfWheel(){
        return this.wheel;
    }

    public void show (){
        System.out.println("Condition of the wheels of the car = " + (100 - wheel * 100)+ "%");
    }
}
