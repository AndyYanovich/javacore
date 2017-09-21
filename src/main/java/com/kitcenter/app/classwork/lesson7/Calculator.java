package com.kitcenter.app.classwork.lesson7;

public class Calculator {
    public static int plus(int a, int b) {
        return a + b;
    }

    public static byte minus(byte a, byte b) {
        return (byte) (a - b);
    }

    public static int multiply(int a, int b) {
        return a * b;
    }

    public static float divide(float a, float b) {
        return a / b;
    }

    public static double squareRoot(double a) {
        return Math.sqrt(a);
    }

    public static float copySign(float a, float b) {
        return Math.copySign(a, b);
    }

    public static short max(short a, short b) {
        return (short) Math.max(a, b);
    }

    public static long min(long a, long b) {
        return Math.min(a, b);
    }

    public static double hypotenuse(double a, double b) {
        return Math.hypot(a, b);
    }

    public static int increment(int a) {
        return Math.incrementExact(a);
    }
}
