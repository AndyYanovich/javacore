package com.kitcenter.app.homework.lesson12;

public class CustomBicycle extends Bicycle {
    private int speed, gear;

    public CustomBicycle(int speed, int gear) {
        this.speed = speed;
        this.gear = gear;
    }

    @Override
    public void setSpeed(int speed) {
        this.speed = speed;
        System.out.println("Speed = " + speed);
    }

    @Override
    public void setGear(int gear) {
        this.gear = gear;
        System.out.println("Gear = " + gear);
    }

    @Override
    public void ride() {
        System.out.println("Wshhhh!");
    }
}
