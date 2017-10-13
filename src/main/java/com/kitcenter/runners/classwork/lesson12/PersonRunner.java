package com.kitcenter.runners.classwork.lesson12;

import com.kitcenter.app.classwork.lesson11.Person;
import com.kitcenter.app.classwork.lesson11.Student;
import com.kitcenter.app.classwork.lesson11.Teacher;

public class PersonRunner {
    public static void main(String[] args) {
        Person student = new Student("Vasya", "Bursitet");
//        System.out.println(student.getName());
        Person teacher = new Teacher("Petya", "Math");
//        System.out.println(teacher.getName());


        response(student);

        response(teacher);

    }

    public static void response(Person person) {
        System.out.println(person.say());
        System.out.println(person.getResponse(""));
    }

    ;


}
