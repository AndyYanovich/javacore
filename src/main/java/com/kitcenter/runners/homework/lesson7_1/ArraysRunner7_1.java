package com.kitcenter.runners.homework.lesson7_1;

import java.util.Scanner;

public class ArraysRunner7_1 {
    Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        ArraysRunner7_1 runner = new ArraysRunner7_1();

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

        runner.showSubtaskLine("g - II version");
        runner.countSumWithArray();
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
        String enteredData = "";

        while (!enteredData.equals("exit")) {
            System.out.println("Input any number or type \"exit\"");
            enteredData = scanner.next();

            try {
                number = Integer.parseInt(enteredData);
                sum += number;
            } catch (NumberFormatException e) {
                if (!enteredData.equals("exit")) {
                    System.out.println("It was incorrect value.");
                }
            }
        }
        System.out.println("Sum is " + sum);
    }

    public void countSumWithArray() {
        int number, sum = 0;
        String enteredData = "";
        int[] array = new int[0];

        while (!enteredData.equals("exit")) {
            System.out.println("Input any number or type \"exit\"");
            enteredData = scanner.next();

            try {
                number = Integer.parseInt(enteredData);
                array = makeBiggerArray(array);
                array[array.length - 1] = number;
            } catch (NumberFormatException e) {
                if (!enteredData.equals("exit")) {
                    System.out.println("It was incorrect value.");
                }
            }
        }

        for (int element : array) {
            sum += element;
        }

        System.out.println("Sum is " + sum);
    }

    private int[] makeBiggerArray(int[] array) {
        int[] newArray = new int[array.length + 1];
        for (int i = 0; i < array.length; i++) {
            newArray[i] = array[i];
        }
        return newArray;
    }

    public void showSubtaskLine(String text) {
        System.out.println("----------\nSubtask " + text + ":");
    }
}