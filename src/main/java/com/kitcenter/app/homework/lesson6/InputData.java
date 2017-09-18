package com.kitcenter.app.homework.lesson6;

import java.util.Scanner;

public class InputData {
    Scanner scanner = new Scanner(System.in);

    public String getValue(String phraze) {
        System.out.print(phraze);
        String valueOfUser = scanner.next();
        return valueOfUser;
    }

    public int stringToInt(String phraze) {
        String data = getValue(phraze);

        int value;
        try {
            value = Integer.parseInt(data);
        } catch (NumberFormatException e) {
            System.out.println(e.getMessage() + " is not an int number. Try again.");
            value = this.stringToInt(phraze);
        }
        return value;
    }

    public int valueMoreZero(String phraze) {
        int value = stringToInt(phraze);

        if (value <= 0) {
            System.out.println("Value should be more than 0. Try again.");
            value = this.valueMoreZero(phraze);
        }
        return value;
    }
}
