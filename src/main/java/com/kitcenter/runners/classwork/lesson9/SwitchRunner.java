package com.kitcenter.runners.classwork.lesson9;

import com.kitcenter.app.classwork.lesson9.Switch;

public class SwitchRunner {

    public static void main(String[] args) {
        showRandNumber();
    }

    public static void showRandNumber() {
        Switch switchAndString = new Switch();
        int number = switchAndString.randNumber();
        System.out.print(number + " = ");
        switch (number) {
            case 1:
                System.out.println("One");
                break;
            case 2:
                System.out.println("Two");
                break;
            case 3:
                System.out.println("Three");
                break;
            default:
                System.out.println("\"Unknown value\"");
                break;
        }
    }
}
