package com.kitcenter.app.classwork.lesson11;

public class Car {
    private int wheelSize, speed;
    private String color;
    private float price;

    public Car(int wheelSize, float price, int speed) {
        this();
        this.speed = speed;
        this.wheelSize = wheelSize;
        this.price = price;
    }

    public Car(float price, String color) {
        this();
        this.price = price;
        this.color = color;
    }

    public Car() {
        this.wheelSize = 18;
        this.color = "red";
        this.speed = 220;
        this.price = 126999.99f;
    }

    public String ride() {
        if (price > 80000.00f) {
            return "wrooooooooom!";
        } else if (price < 10000.00f) {
            return "dr-dr-dr";
        } else {
            return "wroom!";
        }
    }

    public int getWheelSize() {
        return wheelSize;
    }

    public void setWheelSize(int wheelSize) {
        this.wheelSize = wheelSize;
    }

    public int getSpeed() {
        return speed;
    }

    public void setSpeed(int speed) {
        this.speed = speed;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public float getPrice() {
        return price;
    }

    public void setPrice(float price) {
        this.price = price;
    }
}