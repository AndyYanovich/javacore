package com.kitcenter.app.homework.lesson14;

public class Wheeled extends Tractor {
    private int weight, passengers, wheels;

    public Wheeled(String name, int speed, int weight, int passengers, int wheels) {
        super(name, speed);
        this.weight = weight > 0 ? weight : 1000;
        this.passengers = (passengers >= MIN_PASSENGERS && passengers <= MAX_PASSENGERS)
                ? passengers
                : MIN_PASSENGERS;
        this.wheels = wheels > 1 ? wheels : 4;
    }

    @Override
    public void getSpeed() {
        System.out.println(super.speed);
    }

    @Override
    public void getWeight() {
        System.out.println(this.weight);
    }

    @Override
    public void getPassengers() {
        System.out.println(this.passengers);
    }

    @Override
    public void getWheels() {
        System.out.println(this.wheels);
    }
}