package com.kitcenter.app.homework.lesson6;

public class EvenOrOdd {
    public static String description = "--\nEnter any number. Program will determine even or odd number.";

    InputData getnumber = new InputData();

    public void checkNumber() {
        int number = getnumber.stringToInt("Input some number");
        String result = "It was odd number!!!";
        if (number % 2 == 0) {
            result = "It was even number!!!";
        }
        System.out.println(result);
    }

}
