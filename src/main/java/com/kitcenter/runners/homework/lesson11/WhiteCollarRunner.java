package com.kitcenter.runners.homework.lesson11;

import com.kitcenter.app.homework.lesson11.WhiteCollar;
import com.kitcenter.runners.homework.general.Runner;

public class WhiteCollarRunner {
    public static void main(String[] args) {
        Runner runner = new Runner();
        WhiteCollar hades = new WhiteCollar(1000000000, "Hades", "Underworld");

        runner.subDescription = "Class \"WhiteCollar\" extends class \"Human\"\n" +
                "Object \"hades\" created from  \"WhiteCollar\"\n" +
                "Name: " + hades.getName() + "\n" +
                "Age : " + hades.getAge() + "\n" +
                "Company : " + hades.getCompany() + "\n" +
                "Enter new value to change \"company\".\n" +
                "It should consists only of Latin characters, dashes, spaces and/or commas";
        String newCompany = runner.showSubmenuGetText();
        if (hades.setCompany(newCompany)) {
            runner.showMessage("Company name was change.");
        } else {
            runner.showMessage("Company name is invalid.");
        }
        runner.showMessage(hades.getName() + " works in \"" + hades.getCompany() + "\".");
        runner.waitEnterToBack();
    }
}