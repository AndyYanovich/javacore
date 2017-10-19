package com.kitcenter.app.homework.lesson14;

public abstract class Mashine implements Run {
    public static final int MAX_SPEED = 320;
    public static final int MIN_SPEED = -90;
    public static final int MIN_PASSENGERS = 0;
    public static final int MAX_PASSENGERS = 16;

    protected String name;
    protected int speed;

    public Mashine(String name, int speed) {
        this.name = name;
        this.speed = (speed >= MIN_SPEED && speed <= MAX_SPEED) ? speed : 0;
    }

    @Override
    public void printName() {
        System.out.println(name);
    }
}
