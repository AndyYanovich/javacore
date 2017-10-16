package com.kitcenter.app.homework.lesson12;

public class Lenovo extends Computer {
    public Lenovo(String name) {
        super(name);
    }

    @Override
    public String changeCpu() {
        super.setCpu("Intel core i5");
        return "The CPU changed on " + super.getCpu();
    }
}
