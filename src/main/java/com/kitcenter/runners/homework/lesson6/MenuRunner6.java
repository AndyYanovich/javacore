package com.kitcenter.runners.homework.lesson6;

import com.kitcenter.app.homework.lesson6.BiggerNumber;
import com.kitcenter.app.homework.lesson6.EvenOrOdd;
import com.kitcenter.app.homework.lesson6.RightAngledTriangle;
import com.kitcenter.runners.homework.general.Runner;

public class MenuRunner6 {
    public static void main(String[] args) {
        Runner runner = new Runner();

        runner.description = "You can run one of several programs. Make your choice\n" +
                "1 - Run \"Right-angled triangle\" program\n" +
                "2 - Run \"What number is bigger\" program\n" +
                "3 - Run \"Define even or odd number\" program\n" +
                "0 - \"Exit\" from program";

        mainMenu(runner);
    }

    private static void mainMenu(Runner runner) {
        RightAngledTriangle triangle = new RightAngledTriangle();
        BiggerNumber biggerNumber = new BiggerNumber();
        EvenOrOdd evenOrOdd = new EvenOrOdd();
        String result;

        String menuItem = runner.showMenuGetText();
        switch (menuItem) {
            case "1":
                runner.subDescription = "Enter size of triangle's sides. Program will determine right-angled triangle or no.";
                runner.showSubmenu();
                runner.showMessage("Enter size of 1st side:");
                int side1 = runner.getIntMoreZero();
                runner.showMessage("Enter size of 2st side:");
                int side2 = runner.getIntMoreZero();
                runner.showMessage("Enter size of 3st side:");
                int side3 = runner.getIntMoreZero();

                result = "It is " + triangle.checkTriangle(side1, side2, side3);
                runner.showMessage(result);
                mainMenu(runner);
                break;

            case "2":
                runner.subDescription = "Enter two numbers. Program will determine bigger of them.";
                runner.showSubmenu();
                runner.showMessage("Entrt number #1:");
                int number1 = runner.getIntValue();
                runner.showMessage("Enter number #2:");
                int number2 = runner.getIntValue();

                result = biggerNumber.findBiggerNumber(number1, number2);
                runner.showMessage(result);
                mainMenu(runner);
                break;

            case "3":
                runner.subDescription = "Program will determine even or odd number.";
                runner.showSubmenu();
                runner.showMessage("Enter number:");
                int number = runner.getIntValue();

                result = evenOrOdd.checkNumber(number);
                runner.showMessage(result);
                mainMenu(runner);
                break;

            case "0":
                break;

            default:
                runner.showMessage(runner.incorrectChoice);
                mainMenu(runner);
                break;
        }
    }
}
