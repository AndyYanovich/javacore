package com.kitcenter.app.classwork.lesson14;

import com.kitcenter.app.classwork.lesson11.Teacher;

public class Mentor extends Teacher {
    public Mentor(String name, String skill) {
        super(name, skill);
    }


    @Override
    public void lessonFinished() {
        System.out.println("Stand here");
    }


}
