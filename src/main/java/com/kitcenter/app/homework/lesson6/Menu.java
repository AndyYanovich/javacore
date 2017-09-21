package com.kitcenter.app.homework.lesson6;

public class Menu {
    public static String incorrectNumber = "It was incorrect choice.";

    public String getmenu() {
        InputData menu = new InputData();

        String welcomeText = "You can run one of several programs. Make your choice";
        String descriptionText = "1 - Run \"Right-angled triangle\" program\n";
        descriptionText = descriptionText.concat("2 - Run \"Define even or odd number\" program\n");
        descriptionText = descriptionText.concat("3 - Run \"What number is bigger\" program\n");
        descriptionText = descriptionText.concat("0 - \"Exit\" from program");

        System.out.println("-----");
        System.out.println(welcomeText);
        System.out.println(descriptionText);

        String menuNumber = menu.getValue("");
        return menuNumber;
    }
}
