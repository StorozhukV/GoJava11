package com.company.Homework5.Car;

public class CarDoor {
    private boolean door;
    private boolean window;

    public CarDoor() {
        this.door = false;
        this.window = false;
    }

    public CarDoor(boolean door, boolean window) {
        this.door = door;
        this.window = window;
    }

    public boolean openDoor() {
        return this.door = true;
    }

    public boolean closeDoor() {
        return this.door = false;
    }

    public boolean openOrCloseDoor() {
        if (this.door == true) {
            this.door = false;
        } else
            this.door = true;
        return this.door;
    }

    public boolean openWindow() {
        return this.window = true;
    }

    public boolean closeWindow() {
        return this.window = false;
    }

    public boolean openOrCloseWindow() {
        if (this.window == true) {
            this.window = false;
        } else
            this.window = true;
        return this.window;
    }


    public void status() {
        if (this.door) {
            System.out.println("This door is open");
        } else System.out.println("This door is close");
        if (this.window) {
            System.out.println("This window is open");
        } else System.out.println("This window is close");
    }
}
