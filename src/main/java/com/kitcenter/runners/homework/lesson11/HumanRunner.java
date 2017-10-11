package com.kitcenter.runners.homework.lesson11;

import com.kitcenter.app.homework.lesson11.Human;
import com.kitcenter.runners.homework.general.Runner;

public class HumanRunner {

    public static void main(String[] args) {
        Runner runner = new Runner();
        Human nasrulla = new Human(12, "Nasrulla");

        runner.subDescription = "Constructor \"Human\" has 2 arguments: \"age\" and \"name\"\n" +
                "Object \"evstafii\" created from constructor \"Human\"\n" +
                "Name: " + nasrulla.getName() + "\n" +
                "Age : " + nasrulla.getAge() + "\n" +
                "Enter new value to change \"age\"";
        runner.showSubmenu();

        int newAge = runner.getIntValue();

        if (nasrulla.setAge(newAge)) {
            runner.showMessage("New age setted");
        } else {
            runner.showMessage("Age invalid");
        }
        runner.showMessage(nasrulla.getName() + " age is " + nasrulla.getAge());
    }
}