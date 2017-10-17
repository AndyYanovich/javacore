package com.kitcenter.app.homework.lesson12;

public class BicycleWithRing extends CustomBicycle implements BicycleWithRingInterface {

    public BicycleWithRing(int speed, int gear) {
        super(speed, gear);
    }

    @Override
    public void ring() {
        System.out.println("Di-ling!");
    }
}
