package com.kitcenter.app.homework.lesson14;

import java.util.ArrayList;

public class Apartment {
    ArrayList<String> thing = new ArrayList<>();
    private String name;
    private int area, rooms;

    public Apartment(String name, int area, int rooms) {
        this.name = name;
        this.area = area;
        this.rooms = rooms;
    }

    public String getName() {
        return name;
    }

    public int getArea() {
        return area;
    }

    public int getRooms() {
        return rooms;
    }

    public void addThing(String name) {
        this.thing.add(name);
    }

    public ArrayList<String> getThing() {
        return thing;
    }
}