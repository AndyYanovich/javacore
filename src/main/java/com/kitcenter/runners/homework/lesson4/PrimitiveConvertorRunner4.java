package com.kitcenter.runners.homework.lesson4;

import com.kitcenter.app.homework.lesson4.PrimitiveConvertor;
import com.kitcenter.runners.homework.general.Runner;

import java.util.Scanner;

public class PrimitiveConvertorRunner4 {

    Scanner scanner = new Scanner(System.in);
    PrimitiveConvertor primitiveConvertor = new PrimitiveConvertor();

    public static void main(String[] args) {
        Runner runner = new Runner();

        runner.description = "The program convert different primitives to each other.\n";
        runner.description += "Input number:\n";
        runner.description += "1 - Convert \"float\" to \"char\".\n";
        runner.description += "2 - Convert \"int\" to \"char\".\n";
        runner.description += "3 - Convert \"char\" to \"int\".\n";
        runner.description += "0 - \"exit\".";

        mainMenu(runner);
    }

    public static void mainMenu(Runner runner) {
        PrimitiveConvertor convertor = new PrimitiveConvertor();
        String menuItem = runner.showMenuGetText();
        char resChar;
        int resInt;

        switch (menuItem) {
            case "1":
                runner.subDescription = "Input 'float' value";
                runner.showSubmenu();
                float inputFloatValue = runner.getfloatValue();
                resChar = convertor.floatToChar(inputFloatValue);
                runner.showMessage("Input float value is \"" + inputFloatValue + "\". Output char value is \"" + resChar + "\"\n");
                mainMenu(runner);
                break;
            case "2":
                runner.subDescription = "Input 'int' value";
                runner.showSubmenu();
                int inputIntValue = runner.getIntValue();
                resChar = convertor.intToChar(inputIntValue);
                runner.showMessage("Input int value is \"" + inputIntValue + "\". Output char value is \"" + resChar + "\"\n");
                mainMenu(runner);
                break;
            case "3":
                runner.subDescription = "Input 'char' value";
                runner.showSubmenu();
                String inputStringValue = runner.getStringValue();
                char[] charArray = inputStringValue.toCharArray();
                char inputCharValue = charArray[0];
                resInt = convertor.charToInt(inputCharValue);
                runner.showMessage("Input int value is \"" + inputCharValue + "\". Output char value is \"" + resInt + "\"\n");
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
