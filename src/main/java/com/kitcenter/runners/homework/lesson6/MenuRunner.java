package com.kitcenter.runners.homework.lesson6;

import com.kitcenter.app.homework.lesson6.BiggerNumber;
import com.kitcenter.app.homework.lesson6.EvenOrOdd;
import com.kitcenter.app.homework.lesson6.Menu;
import com.kitcenter.app.homework.lesson6.RightAngledTriangle;

public class MenuRunner {
    public static void main(String[] args) {
        startMenu();
    }

    public static void startMenu() {
        String menuNumber = checkMenu();

        switch (menuNumber) {
            case "1":
                System.out.println(RightAngledTriangle.description);
                checkTriangle();
                startMenu();
                break;
            case "2":
                System.out.println(EvenOrOdd.description);
                checkEvenOrOdd();
                startMenu();
                break;
            case "3":
                System.out.println(BiggerNumber.description);
                checkBiggerNumber();
                startMenu();
                break;
            case "0":
                break;
            default:
                System.out.println(Menu.incorrectNumber);
                startMenu();
                break;
        }
    }

    public static void checkTriangle() {
        RightAngledTriangle triangle = new RightAngledTriangle();
        triangle.checkSides();
    }

    public static void checkEvenOrOdd() {
        EvenOrOdd number = new EvenOrOdd();
        number.checkNumber();
    }

    public static void checkBiggerNumber() {
        BiggerNumber number = new BiggerNumber();
        number.checkNumber();
    }

    private static String checkMenu() {
        Menu menu = new Menu();
        String menuNumber = menu.getmenu();
        return menuNumber;
    }

}
