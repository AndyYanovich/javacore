package com.kitcenter.app.homework.lesson6;

public class EvenOrOdd {

    public String checkNumber(int number) {
        String result = "It was odd number";
        if (number % 2 == 0) {
            result = "It was even number";
        }
        return result;
    }
}
