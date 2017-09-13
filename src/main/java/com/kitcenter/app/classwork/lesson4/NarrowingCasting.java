package com.kitcenter.app.classwork.lesson4;

public class NarrowingCasting {
    int int1 = 127;
    float float1 = 0.0f;
    double double1 = 3.14159123456789d;

    public void narrowing() {
        int1 = (int) float1;
        System.out.println(int1);
    }

    public void narrowingDoubleTofloat() {
        float1 = (float) double1;
        System.out.println(float1);
    }
}
