package com.kitcenter.runners.homework.lesson7_1;

import com.kitcenter.runners.homework.general.Runner;

import java.util.Scanner;

public class ArraysRunner7_1 {
    Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        Runner runner = new Runner();

        runner.description = "Choose and enter menu item:\n" +
                "a - subtask a\n" +
                "b - subtask b\n" +
                "c - subtask c\n" +
                "d - subtask d\n" +
                "e - subtask e\n" +
                "f - subtask f\n" +
                "g - subtask g\n" +
                "i - subtask i\n" +
                "0 or exit - \"exit\"";

        mainMenu(runner);
    }

    private static void mainMenu(Runner runner) {
        ArraysRunner7_1 arrayMethod = new ArraysRunner7_1();

        String menuItem = runner.showMenuGetText();
        switch (menuItem) {
            case "a":
                runner.subDescription = "Output in a row and in a column an array of all even numbers from 2 to 20.";
                runner.showSubmenu();
                arrayMethod.makeArrayEven2To20();
                mainMenu(runner);
                break;

            case "b":
                runner.subDescription = "Output in a row odd numbers from 1 to 99. Output reverse array in the next row.";
                runner.showSubmenu();
                arrayMethod.makeArraySort();
                mainMenu(runner);
                break;

            case "c":
                runner.subDescription = "Output array from 15 random numbers (0-9). Output in the next row how many even elements hss array.";
                runner.showSubmenu();
                arrayMethod.makeArrayRandEven();
                mainMenu(runner);
                break;

            case "d":
                runner.subDescription = "Output array of 15 random numbers (0-999). Output min and max values of array's elements.";
                runner.showSubmenu();
                arrayMethod.makeArrayRandMinMax();
                mainMenu(runner);
                break;

            case "e":
                runner.subDescription = "Output two-dimensional array (10-99). It should consist from 8 rows and 5 columns.";
                runner.showSubmenu();
                arrayMethod.makeMultidimensionalArray10Till99();
                mainMenu(runner);
                break;

            case "f":
                runner.subDescription = "Output two-dimensional array (1-999). It should consist from 8 rows, 5 columns and align to the right side.";
                runner.showSubmenu();
                arrayMethod.makeBeautifulArray();
                mainMenu(runner);
                break;

            case "g":
                runner.subDescription = "Output the sum of entered numbers by the user.";
                runner.showSubmenu();
                arrayMethod.countSum();
                mainMenu(runner);
                break;

            case "i":
                runner.subDescription = "Output the sum of entered numbers by the user. Output each entered number.";
                runner.showSubmenu();
                arrayMethod.countSumWithArray();
                mainMenu(runner);
                break;

            case "0":
                break;

            case "exit":
                break;

            default:
                mainMenu(runner);
                break;
        }
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
            System.out.println("Enter any number or type \"exit\"");
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
            System.out.println("Enter any number or type \"exit\"");
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
            System.out.print(element + " ");
        }

        System.out.println("\nSum is " + sum);
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