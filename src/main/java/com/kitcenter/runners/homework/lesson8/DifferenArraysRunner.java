package com.kitcenter.runners.homework.lesson8;

import java.util.Scanner;

public class DifferenArraysRunner {
    Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        DifferenArraysRunner runner = new DifferenArraysRunner();

        runner.showSubtaskLine("a");
        runner.makeArrayEven2To20();

        runner.showSubtaskLine("b");
        runner.makeArraySort();

        runner.showSubtaskLine("c");
        runner.makeArrayRandEven();

        runner.showSubtaskLine("d");
        runner.makeArrayRandMinMax();

        runner.showSubtaskLine("e");
        runner.makeMultidimensionalArray10Till99();

        runner.showSubtaskLine("f");
        runner.makeBeautifulArray();

        runner.showSubtaskLine("g");
        runner.countSum();
    }

    public void makeArrayEven2To20() {
        int[] array = new int[20 / 2];

        for (int i = 0; i < array.length; i++) {
            array[i] = i * 2 + 2;
        }
        for (int element : array) {
            System.out.print(element + " ");
        }
        System.out.println("");
        for (int element : array) {
            System.out.println(element);
        }
    }

    public void makeArraySort() {
        int[] array = new int[99 / 2 + 1];

        for (int i = 0; i < array.length; i++) {
            array[i] = i * 2 + 1;
        }
        for (int element : array) {
            System.out.print(element + " ");
        }

        System.out.println("");
        for (int i = array.length - 1; i >= 0; i--) {
            System.out.print(array[i] + " ");
        }
        System.out.println("");
    }

    public void makeArrayRandEven() {
        int[] array = new int[15];

        int couterEven = 0;
        for (int i = 0; i < array.length; i++) {
            array[i] = (int) (Math.random() * 10);
            System.out.print(array[i] + " ");
            if (array[i] % 2 == 0) {
                couterEven++;
            }
        }
        System.out.println("\nArray has " + couterEven + " even numbers.");
    }

    public void makeArrayRandMinMax() {
        int[] array = new int[15];

        int min = 1000, max = 0;
        for (int i = 0; i < array.length; i++) {
            array[i] = (int) (Math.random() * 1000);
            System.out.print(array[i] + " ");
            if (min > array[i]) {
                min = array[i];
            }
            if (max < array[i]) {
                max = array[i];
            }
        }
        System.out.println("\nMin value = " + min);
        System.out.println("Max value = " + max);
    }

    public void makeMultidimensionalArray10Till99() {
        int[][] array = new int[8][5];

        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[0].length; j++) {
                array[i][j] = (int) (Math.random() * 90 + 10);
                System.out.print(array[i][j] + " ");
            }
            System.out.println("");
        }
    }

    public void makeBeautifulArray() {
        int[][] array = new int[8][5];

        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[0].length; j++) {
                array[i][j] = (int) (Math.random() * 999 + 1);
                if (array[i][j] < 100 && array[i][j] > 9) {
                    System.out.print(" ");
                } else if (array[i][j] < 10) {
                    System.out.print("  ");
                }
                System.out.print(array[i][j] + "  ");
            }
            System.out.println("");
        }
    }

    public void countSum() {
        int number, sum = 0;
        boolean exitBool = false;

        while (exitBool == false) {
            System.out.println("Input any number or type \"exit\"");
            String enteredData = scanner.next();
            try {
                number = Integer.parseInt(enteredData);
                sum += number;
            } catch (NumberFormatException e) {
                exitBool = true;
            }
        }
        System.out.println("Sum is " + sum);
    }

    public void showSubtaskLine(String text) {
        System.out.println("----------\nSubtask " + text + ":");
    }
}