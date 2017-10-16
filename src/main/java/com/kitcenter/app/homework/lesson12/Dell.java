package com.kitcenter.app.homework.lesson12;

public class Dell extends Computer {
    public Dell(String name) {
        super(name);
    }

    @Override
    public String changeCpu() {
        super.setCpu("Intel core i7");
        return "The CPU changed on " + super.getCpu();
    }

}
