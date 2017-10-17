package com.kitcenter.app.homework.lesson12;

public abstract class Bicycle {
//    private int speed, gear;

    public abstract void setSpeed(int speed);

    public abstract void setGear(int gear);

    public void ride() {
        System.out.println("Wroom!");
    }
}