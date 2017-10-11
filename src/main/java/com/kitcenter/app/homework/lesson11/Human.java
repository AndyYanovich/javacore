package com.kitcenter.app.homework.lesson11;

public class Human {
    private int age;
    private String name;

    public Human(int age, String name) {
        this.age = age;
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public String getName() {
        return name;
    }

    public boolean setAge(int age) {
        if (age >= 1 && age <= 120) {
            this.age = age;
            return true;
        } else {
            return false;
        }
    }
}
