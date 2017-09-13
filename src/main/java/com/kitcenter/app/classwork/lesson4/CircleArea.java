package com.kitcenter.app.classwork.lesson4;

import java.util.Scanner;

public class CircleArea {
    public static void calculate() {
        Scanner scanner = new Scanner(System.in);

        double radius = scanner.nextDouble();

        radius = Math.PI * radius * radius;

        System.out.println("Area is " + radius);
    }
}
