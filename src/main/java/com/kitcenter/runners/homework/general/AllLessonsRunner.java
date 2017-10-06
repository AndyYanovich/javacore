package com.kitcenter.runners.homework.general;

import com.kitcenter.runners.homework.lesson4.PrimitiveConvertorRunner4;
import com.kitcenter.runners.homework.lesson6.MenuRunner6;
import com.kitcenter.runners.homework.lesson7_1.ArraysRunner7_1;
import com.kitcenter.runners.homework.lesson9.PalindromeRunner9;

public class AllLessonsRunner {
    public static void main(String[] args) {
        Runner runner = new Runner();

        runner.description = "Choose lesson that you want run:\n";
        runner.description += "   a - lesson #4\n";
        runner.description += "   b - lesson #6\n";
        runner.description += "   c - lesson #7.1\n";
        runner.description += "   d - lesson #9\n";
        runner.description += "exit - \"Exit\" from program";
        mainMenu(runner);
    }

    public static void mainMenu(Runner runner) {
        String menuItem = runner.showMenuGetText();
        switch (menuItem) {
            case "a":
                PrimitiveConvertorRunner4.main(null);
                mainMenu(runner);
                break;
            case "b":
                MenuRunner6.main(null);
                mainMenu(runner);
                break;
            case "c":
                ArraysRunner7_1.main(null);
                mainMenu(runner);
                break;
            case "d":
                PalindromeRunner9.main(null);
                mainMenu(runner);
                break;
            case "exit":
                break;
            default:
                runner.showMessage(runner.incorrectChoice);
                mainMenu(runner);
                break;

        }

    }
}
