package com.kitcenter.app.homework.lesson12;

public class Computer {
    private String name;
    private String cpu = "Intel 386";

    public Computer(String name) {
        this.name = name;
    }

    public String getCpu() {
        return cpu;
    }

    public void setCpu(String cpu) {
        this.cpu = cpu;
    }

    public String getName() {
        return name;
    }

    public String changeCpu() {
        setCpu("Intel core i3");
        return "The CPU changed on " + this.cpu;
    }
}
