package com.kitcenter.app.homework.lesson12;

public class Flower {
    private String name;
    private int price;

    public Flower(String name, int price) {
        this.name = name;
        this.price = price;
    }

    public String getName() {
        return name;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }
}
