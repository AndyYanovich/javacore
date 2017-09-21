package com.kitcenter.app.homework.lesson6;

public class BiggerNumber {
    public static String description = "--\nEnter two numbers. Program will determine bigger of them.";

    InputData getnumber = new InputData();

    public void checkNumber() {
        int number1 = getnumber.stringToInt("Input number #1 ");
        int number2 = getnumber.stringToInt("Input number #2 ");

        String result = "The numbers are the same :(";
        if (number1 > number2) {
            result = "Number #1 is bigger!!!";
        } else if (number2 > number1) {
            result = "Number #2 is bigger!!!";
        }
        System.out.println(result);
    }

}
