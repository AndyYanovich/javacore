package com.kitcenter.app.classwork.lesson11;

public class Teacher extends Person {
    private String skill;

    public Teacher(String name, String skill) {
        super(name);
        this.skill = skill;
    }

    @Override
    public String say() {
        return "Aloha";
    }

    @Override
    public void isDrink() {

    }

    @Override
    public String getResponse(String question) {
        return "Eh, What is a question";
    }

}
