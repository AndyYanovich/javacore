package com.kitcenter.runners.classwork.lesson11;

import com.kitcenter.app.classwork.lesson11.Student;
import com.kitcenter.app.classwork.lesson11.Teacher;

public class PeopleRunner {
    public static void main(String[] args) {

        Student vasya = new Student("Vasya", "Bursitet");
        System.out.println(vasya.getName() + " study in " + vasya.getUniversity());
        System.out.println(vasya.getName() + " ask:\"" + vasya.getResponse("Who am I?") + "\"\n\n");
        System.out.println(vasya.say());

        Teacher petya = new Teacher("Petya", "Math");
        System.out.println(petya.say());


    }
}
