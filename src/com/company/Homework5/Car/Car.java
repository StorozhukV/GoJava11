package com.company.Homework5.Car;

public class Car {
    private final String date;
    private int engineType;
    private float maxSpeed;
    private float time100km;
    private int maxPassengers;
    private int passengers;
    private float speed;
    private CarWheel[] wheels = new CarWheel[4];
    private CarDoor[] doors = new CarDoor[4];

    public Car(String date) {
        this.date = date;
    }

    public Car(String date, int engineType, float maxSpeed, float time100km, int maxPassengers,
               int passengers, float speed) {
        this.date = date;
        this.engineType = engineType;
        this.maxSpeed = maxSpeed;
        this.time100km = time100km;
        this.maxPassengers = maxPassengers;
        this.passengers = passengers;
        this.speed = speed;
        for (int i = 0; i < wheels.length; i++) {
            wheels[i] = new CarWheel();
        }
        for (int i = 0; i < doors.length; i++) {
            doors[i] = new CarDoor();
        }
    }


    public void setSpeed(float speed) {
        this.speed = speed;
    }

    public void addPassenger() {
        if (passengers < maxPassengers) {
            passengers++;
        } else System.out.println("Sorry, but your car is full");
    }

    public void landPassenders() {
        if (passengers >= 1) {
            passengers--;
        }
    }

    public void landAllPassengers() {
        passengers = 0;
    }

    public CarDoor getindexOfADoor(int i) {
        return doors[i];
    }

    public CarWheel getindexOfAWheel(int i) {
        return wheels[i];
    }

    public void removeWheel() {
        wheels = new CarWheel[0];
    }

    public void addNewWheel(int x) {
        int t;
        t = wheels.length;
        wheels = new CarWheel[t + x];
        for (int i = 0; i < wheels.length; i++) {
            wheels[i] = new CarWheel();
        }
    }

    public float calcMaxSpeed() {
        if ((wheels.length >= 4) && (passengers > 0)) {
            float min = wheels[0].getWheel();
            for (int i = 0; i < wheels.length; i++) {
                if (wheels[i].getWheel() < min) {
                    min = wheels[i].getWheel();
                }
            }
            return speed * min;
        } else return 0;
    }

    public void show() {
        System.out.println("Date: \t\t\t\t\t\t\t" + date);
        System.out.println("Engine type: \t\t\t\t\t" + engineType);
        System.out.println("Max speed: \t\t\t\t\t\t" + maxSpeed);
        System.out.println("Time to 100 km/h: \t\t\t\t" + time100km);
        System.out.println("Current speed: \t\t\t\t\t" + speed);
        System.out.println("Max number of passengers: \t\t" + maxPassengers);
        System.out.println("Current number of passengers: \t" + passengers);
        System.out.println("Calculated max speed: \t\t\t" + calcMaxSpeed());
        System.out.println();
        for (int i = 0; i < doors.length; i++) {

            System.out.println("\tDoor " + " and window " + (i+1) + ": ");
            getindexOfADoor(i).status();
            System.out.println("-------------------------------");
        }
    }

    public static void main(String[] args) {

    }
}
