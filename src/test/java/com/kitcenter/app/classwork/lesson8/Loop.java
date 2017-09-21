package com.kitcenter.app.classwork.lesson8;

public class Loop {

    public void whileGame(int a, int b) {
        while (a > b) {
            System.out.println("a = " + a + ", b = " + b);
            a = a - b;
            if (a <= b) {
                System.out.println("a = " + a + ", b = " + b);
            }
        }
    }

    public void forGame() {
        for (int i = 0; i <= 10; i++) {
            System.out.print(i + " ");
        }
    }

    public void incrementGame() {
        int a = 1;
        System.out.println("Original a value " + a);
        System.out.println("Post-increment a " + a++);
        System.out.println("After post-increment" + a);
        System.out.println("Pre-increment a " + ++a);
        System.out.println("After pre-increment" + a);
    }

    public void countEven(int number) {
        int counter = 0;
        for (int i = 1; i <= number; i++) {
            if (i % 2 == 0) {
                counter++;
            }
        }
        System.out.println(counter + " even numbers from 0 to " + number);
    }
}
