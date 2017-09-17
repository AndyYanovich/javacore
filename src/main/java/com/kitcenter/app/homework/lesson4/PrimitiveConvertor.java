package com.kitcenter.app.homework.lesson4;

import java.util.Scanner;

public class PrimitiveConvertor {

    Scanner scanner = new Scanner(System.in);

    public void floatToChar() {
        System.out.print("Enter 'float' value ");
        float floatVar = scanner.nextFloat();
        char charVar = (char) floatVar;
        System.out.println("Input float value is " + floatVar + ". Output char value is " + charVar);
        System.out.println("");
    }

    public void intToChar() {
        System.out.print("Enter 'int' value ");
        int intVar = scanner.nextInt();
        char charVar = (char) intVar;
        System.out.println("Input int value is " + intVar + ". Output char value is " + charVar);
        System.out.println("");
    }

    public void charToInt() {
        System.out.print("Enter 'char' value (single symbol) ");
        String stringVar = scanner.next();
        char[] charVars = stringVar.toCharArray();
        if (charVars.length > 1) {
            System.out.println("Looooooser!!! I said single symbol!");
            System.out.println("charVar will be use symbol - " + charVars[0]);
        }
        char charVar = charVars[0];
        int intVar = (int) charVar;
        System.out.println("Input char value is " + charVar + ". Output int value is " + intVar);
    }
}