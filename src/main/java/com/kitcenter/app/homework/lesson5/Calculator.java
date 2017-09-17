package com.kitcenter.app.homework.lesson5;

public class Calculator {
    //    1-2
    public static int plus(int a, int b) {
        return a + b;
    }

    //    3-4
    public static byte minus(byte a, byte b) {
        return (byte) (a - b);
    }

    //    5-6
    public static int multiply(int a, int b) {
        return a * b;
    }

    //    7-8
    public static float divide(float a, float b) {
        return a / b;
    }

    //    9-10 sqrt(double a) квадратный корень
    public static double squareRoot(double a) {
        return Math.sqrt(a);
    }

    //    11-12 copySign(double magnitude, double sign)
    public static float copySign(float a, float b) {
        return Math.copySign(a, b);
    }

    //    13-14 max(float a, float b)
    public static short max(short a, short b) {
        return (short) Math.max(a, b);
    }

    //    15-16 min(long a, long b)
    public static long min(long a, long b) {
        return Math.min(a, b);
    }

    //    17-18 hypot(double x, double y) гипотенуза
    public static double hypotenuse(double a, double b) {
        return Math.hypot(a, b);
    }

    //    19-20 incrementExact(int a)
    public static int increment(int a) {
        return Math.incrementExact(a);
    }
}
