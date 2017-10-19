package com.kitcenter.app.classwork.lesson14;

public class ACMEBicycle implements Bicycle {
    int cadence = 0;
    int speed = 0;
    int gear = 1;

    public void changeCadence(int newValue) {
        this.cadence = newValue;
    }

    public void changeGear(int newValue) {
        this.gear = newValue;
    }

    public void changeSpeed(int newValue) {
        this.speed = newValue;
    }

    public void printStates() {
        System.out.println(cadence + " " + speed + " " + gear);
    }

}