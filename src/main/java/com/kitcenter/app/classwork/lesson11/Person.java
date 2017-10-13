package com.kitcenter.app.classwork.lesson11;

public abstract class Person {
    protected String name;

    public Person(String name) {
        this.name = name;
    }

    public String say() {
        return "Hello";
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getResponse(String question) {
        return "My answer is " + question;
    }

    public abstract void isDrink();
}
