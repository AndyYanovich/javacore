package com.kitcenter.app.classwork.lesson11;

public class Student extends Person {
    private String university;
    private String response = "Ehhh, what was the question?";

    public Student(String name, String university) {
        super(name);
        this.university = university;
    }

    @Override
    public String say() {
        return "Hi";
    }

    @Override
    public void lessonFinished() {

    }

    public String getResponse(String question) {
        return response;
    }

    public String getUniversity() {
        return university;
    }

    public void setUniversity(String university) {
        this.university = university;
    }

    public void setResponse(String response) {
        this.response = response;
    }

    @Override
    public String toString() {
        return "Student{" + "name='" + name + '\'' + '}';
    }
}
