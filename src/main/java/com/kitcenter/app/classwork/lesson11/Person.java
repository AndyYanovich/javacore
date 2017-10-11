package com.kitcenter.app.classwork.lesson11;

public class Person {
    protected String name;

    public Person(String name) {
        this.name = name;
    }

    public String say() {
        return "Hi";
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
