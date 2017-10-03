package com.kitcenter.runners.homework.lesson4;

import com.kitcenter.app.homework.lesson4.PrimitiveConvertor;

import java.util.Scanner;

public class HomeTaskRunner4 {

    Scanner scanner = new Scanner(System.in);
    PrimitiveConvertor primitiveConvertor = new PrimitiveConvertor();

    public static void main(String[] args) {

        HomeTaskRunner4 run = new HomeTaskRunner4();
        run.floatToChar();
        run.intToChar();
        run.charToInt();
    }

    public void floatToChar() {
        System.out.print("Enter 'float' value ");
        float floatVar = scanner.nextFloat();
        char charVar = primitiveConvertor.floatToChar(floatVar);
        System.out.println("Input float value is " + floatVar + ". Output char value is " + charVar + "\n");
    }

    public void intToChar() {
        System.out.print("Enter 'int' value ");
        int intVar = scanner.nextInt();
        char charVar = primitiveConvertor.floatToChar(intVar);
        System.out.println("Input int value is " + intVar + ". Output char value is " + charVar + "\n");
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
        int intVar = primitiveConvertor.charToInt(charVar);
        System.out.println("Input char value is " + charVar + ". Output int value is " + intVar);
    }
}
