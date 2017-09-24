package com.kitcenter.app.homework.lesson6;

public class BiggerNumber {

    public String findBiggerNumber(int number1, int number2) {
        String result = "The numbers are the same";
        if (number1 > number2) {
            result = "Number #1 is bigger";
        } else if (number2 > number1) {
            result = "Number #2 is bigger";
        }
        return result;
    }
}
