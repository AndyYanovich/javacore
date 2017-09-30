package com.kitcenter.runners.classwork.lesson9;

import com.kitcenter.app.classwork.lesson9.StringClass;

public class StringClassRunner {

    public static void main(String[] args) {
        StringClass stringClass = new StringClass();

        char[] arr = {48, 49, 50, 51, 52, 53, 54, 55, 56, 57};
        String resultString = stringClass.concatValue(arr);
        System.out.println(resultString);

        primitiveWrapper();

        stringComparison();

        isPalindromeRunner();
    }

    public static void primitiveWrapper() {
        StringClass stringClass = new StringClass();
        int intRes = stringClass.intToStringToWrapper(5);
        System.out.println(intRes);

        double doubleRes = stringClass.doubleToStringToWrapper(1.1d);
        System.out.println(doubleRes);

        long longRes = stringClass.longToStringToWrapper(100);
        System.out.println(longRes);

        boolean booleanRes = stringClass.booleanToStringToWrapper(true);
        System.out.println(booleanRes);
    }

    public static void stringComparison() {
        String soldRoomName = "room";
        String newRoomName = "room";
        if (soldRoomName == newRoomName) {
            System.out.println("Names are equal");
        }

        if (soldRoomName.equals(newRoomName)) {
            System.out.println("Names are equal again");
        }
    }

    public static void isPalindromeRunner() {
        StringClass stringClass = new StringClass();
        String word = "woow";
        System.out.println(word + " - " + stringClass.isPalindrome(word));
        word = "word";
        System.out.println(word + " - " + stringClass.isPalindrome(word));
    }

}