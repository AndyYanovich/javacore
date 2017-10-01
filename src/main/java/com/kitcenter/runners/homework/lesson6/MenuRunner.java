package com.kitcenter.runners.homework.lesson6;

import com.kitcenter.app.homework.lesson6.BiggerNumber;
import com.kitcenter.app.homework.lesson6.EvenOrOdd;
import com.kitcenter.app.homework.lesson6.RightAngledTriangle;

import java.util.Scanner;

public class MenuRunner {
    public String welcomeText = "You can run one of several programs. Make your choice\n1 - Run \"Right-angled triangle\" program\n2 - Run \"What number is bigger\" program\n3 - Run \"Define even or odd number\" program\n0 - \"Exit\" from program";
    Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        MenuRunner runner = new MenuRunner();
        runner.mainMenu();
    }

    public void mainMenu() {
        MenuRunner runner = new MenuRunner();
        RightAngledTriangle triangle = new RightAngledTriangle();
        BiggerNumber biggerNumber = new BiggerNumber();
        EvenOrOdd evenOrOdd = new EvenOrOdd();
        String result;

        System.out.println("-----\n" + welcomeText);

        String menuNumber = runner.getValue("");
        switch (menuNumber) {
            case "1":
                System.out.println("--\nInput size of triangle's sides. Program will determine right-angled triangle or no.");
                int side1 = runner.getIntMoreZero("Input size of 1st side:");
                int side2 = runner.getIntMoreZero("Input size of 2nd side:");
                int side3 = runner.getIntMoreZero("Input size of 3rd side:");
                result = triangle.checkTriangle(side1, side2, side3);

                System.out.println("It is " + result);
                runner.mainMenu();
                break;
            case "2":
                System.out.println("--\nInput two numbers. Program will determine bigger of them.");
                int number1 = runner.getIntValue("Input number #1:");
                int number2 = runner.getIntValue("Input number #2:");
                result = biggerNumber.findBiggerNumber(number1, number2);

                System.out.println(result);
                runner.mainMenu();
                break;
            case "3":
                System.out.println("--\nEnter any number. Program will determine even or odd number.");
                int number = runner.getIntValue("Input number");
                result = evenOrOdd.checkNumber(number);

                System.out.println(result);
                runner.mainMenu();
                break;
            case "0":
                break;
            default:
                System.out.println("It was incorrect choice. Try again.");
                runner.mainMenu();
                break;
        }
    }


    public String getValue(String text) {
        if (text != "") {
            System.out.println(text);
        }
        return scanner.next();
    }

    public int getIntValue(String text) {
        String stringValue = getValue(text);

        int intValue;
        try {
            intValue = Integer.parseInt(stringValue);
        } catch (NumberFormatException e) {
            System.out.println(e.getMessage() + " is not an int number.");
            intValue = this.getIntValue(text);
        }
        return intValue;
    }

    public int getIntMoreZero(String text) {
        int value = getIntValue(text);

        if (value <= 0) {
            System.out.println("Value should be more than 0. Try again.");
            value = this.getIntMoreZero(text);
        }
        return value;
    }
}
