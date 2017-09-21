package com.kitcenter.runners.classwork.lesson8;

import com.kitcenter.app.classwork.lesson8.Loop;

import java.util.Scanner;

public class LoopRunner {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Loop loop = new Loop();

//        int number1 = scanner.nextInt();
//        int number2 = scanner.nextInt();

//        loop.whileGame(scanner.nextInt(),scanner.nextInt());
//        loop.forGame();
//        loop.incrementGame();
        loop.countEven(scanner.nextInt());
    }


}
