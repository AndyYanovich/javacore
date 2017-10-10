package com.kitcenter.runners.homework.general;

import java.util.Scanner;

public class Runner {
    public Scanner scanner = new Scanner(System.in);
    public String description = "---You forgot update menu description!!!---";
    public String subDescription = "---You forgot update item description!!!---";
    public String incorrectChoice = "It was incorrect choice. Try again.";
    private String notNumber = " - incorrect value. Try again.";
    private String numberLessZero = "Value should be more than 0. Try again.";

    public String showMenuGetText() {
        showMessage("----------");
        showMessage(description);
        return getStringValue();
    }

    public void showSubmenu() {
        showMessage("----");
        showMessage(subDescription);
    }

    public String showSubmenuGetText() {
        showMessage("----");
        showMessage(subDescription);
        return getStringValue();
    }

    public void showMessage(String text) {
        System.out.println(text);
    }

    public String getStringValue() {
        return scanner.nextLine();
    }

    public int getIntValue() {
        String stringValue = getStringValue();

        int intValue;
        try {
            intValue = Integer.parseInt(stringValue);
        } catch (NumberFormatException e) {
            showMessage(e.getMessage() + notNumber);
            intValue = getIntValue();
        }
        return intValue;
    }

    public int getIntMoreZero() {
        int value = getIntValue();

        if (value <= 0) {
            showMessage(numberLessZero);
            value = getIntMoreZero();
        }
        return value;
    }

    public float getfloatValue() {
        String stringValue = getStringValue();

        float floatValue;
        try {
            floatValue = Float.parseFloat(stringValue);
        } catch (NumberFormatException e) {
            showMessage(e.getMessage() + notNumber);
            floatValue = getfloatValue();
        }
        return floatValue;
    }



}
