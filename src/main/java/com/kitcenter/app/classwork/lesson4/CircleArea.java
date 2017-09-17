package com.kitcenter.app.classwork.lesson4;

import java.util.Scanner;

public class CircleArea {
    public static void calculate() {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter radius 1");
        double radius1 = scanner.nextDouble();
        System.out.print("Enter radius 2");
        double radius2 = scanner.nextDouble();

        double area1 = Math.PI * radius1 * radius1;
        double area2 = Math.PI * radius2 * radius2;

        if (area1 > area2) {
            System.out.println("Area1 is bigger");
        } else if (area1 == area2) {
            System.out.println("Area1 = Area2");
        } else {
            System.out.println("Area2 is bigger");
        }

        System.out.println("");
        if ((radius1 > radius2) || !(area2 > area1)) {
            System.out.println("Area1 is bigger");
            System.out.println("Area2 is smaller");
        } else {
            System.out.print("Area2 is bigger");
            System.out.print("Area1 is smaller");
        }

    }

    public static void evenOrOdd() {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter number");
        int number = scanner.nextInt();

        if (number % 2 == 0) {
            System.out.println(number + " is Even number");
        } else {
            System.out.println(number + " is Odd number");
        }

    }


}
