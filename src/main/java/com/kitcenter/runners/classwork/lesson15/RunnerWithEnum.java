package com.kitcenter.runners.classwork.lesson15;

import com.kitcenter.app.homework.lesson9.Palindrome;

import java.util.Scanner;

public class RunnerWithEnum {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        Palindrome palindrome = new Palindrome();

        System.out.println("Enter task number (T1-T6).");
        String menuItem = scanner.nextLine();

        try {

            UserChoice choice = UserChoice.valueOf(menuItem.toUpperCase());
            boolean res = true;

            switch (choice) {
                case T1:
                    printRes("1");
                    res = palindrome.isPalindromeReverse("aaaq");
                    break;
                case T2:
                    printRes("2");
                    res = palindrome.isPalindromeSemiWord("asa");
                    break;
                case T3:
                    printRes("3");
                    res = palindrome.isPalindromeToCenter("assa");
                    break;
                default:
                    System.out.println("Hz what I have to do");
            }
            System.out.println(res);
        } catch (IllegalArgumentException e) {
            System.out.println("Invalid season selection!");
            main(null);
        }
    }


    public static void printRes(String number) {
        System.out.println("I should run task#" + number);
    }


}
