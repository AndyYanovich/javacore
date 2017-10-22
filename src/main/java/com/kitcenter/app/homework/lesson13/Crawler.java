package com.kitcenter.app.homework.lesson13;

public class Crawler extends Tractor {
    private int weight, passengers;
    private int wheels = 0;

    public Crawler(String name, int speed, int weight, int passengers) {
        super(name, speed);
        this.weight = weight > 0 ? weight : 1000;
        this.passengers = (passengers >= MIN_PASSENGERS && passengers <= MAX_PASSENGERS)
                ? passengers
                : MIN_PASSENGERS;
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
