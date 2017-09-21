package com.kitcenter.runners.homework.lesson5;

import com.kitcenter.app.homework.lesson5.Calculator;
import org.junit.Assert;
import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runners.MethodSorters;

@FixMethodOrder(MethodSorters.NAME_ASCENDING)
//@FixMethodOrder(MethodSorters.DEFAULT)

public class CalculatorTest {

    @Test // 1
    public void plusTest1() {
        int a = 3, b = 5, expRes = 8;
        int actRes = Calculator.plus(a, b);
        Assert.assertEquals(expRes, actRes);
    }

    @Test // 2
    public void plusTest2() {
        int a = -3, b = 5, expRes = 2;
        int actRes = Calculator.plus(a, b);
        Assert.assertEquals(expRes, actRes);
    }

    @Test // 3
    public void minusTest3() {
        byte a = 4, b = 2, expRes = 2;
        byte actRes = Calculator.minus(a, b);
        Assert.assertEquals(expRes, actRes);
    }

    @Test // 4
    public void minusTest4() {
        byte a = 4, b = 0, expRes = 4;
        byte actRes = Calculator.minus(a, b);
        Assert.assertEquals(expRes, actRes);
    }

    @Test // 5
    public void multiplyTest5() {
        int a = 3, b = 2, expRes = 6;
        int actRes = Calculator.multiply(a, b);
        Assert.assertEquals(expRes, actRes);
    }

    @Test // 6
    public void multiplyTest6() {
        int a = 3, b = 2, expRes = 6;
        int actRes = Calculator.multiply(a, b);
        Assert.assertEquals(expRes, actRes);
    }

    @Test // 7
    public void divideTest7() {
        float a = 9.02f, b = 2.2f, expRes = 4.1f;
        float actRes = Calculator.divide(a, b);
        Assert.assertEquals(expRes, actRes, 0);
    }

    @Test // 8
    public void divideTest8() {
        float a = 2f, b = 1f, expRes = 2f;
        float actRes = Calculator.divide(a, b);
        Assert.assertEquals(expRes, actRes, 0);
    }

    @Test // 9
    public void squareRootTest9() {
        double a = 9.0d, expRes = 3.0d;
        double actRes = Calculator.squareRoot(a);
        Assert.assertEquals(expRes, actRes, 0);
    }

    @Test // 10
    public void squareRootTest10() {
        double a = 49.0d, expRes = 7.0d;
        double actRes = Calculator.squareRoot(a);
        Assert.assertEquals(expRes, actRes, 0);
    }

    @Test // 11
    public void copySignTest11() {
        float a = 2f, b = -1f, expRes = -2f;
        float actRes = Calculator.copySign(a, b);
        Assert.assertEquals(expRes, actRes, 0);
    }

    @Test // 12
    public void copySignTest12() {
        float a = -2f, b = -1f, expRes = -2f;
        float actRes = Calculator.copySign(a, b);
        Assert.assertEquals(expRes, actRes, 0);
    }

    @Test // 13
    public void maxTest13() {
        short a = 2, b = 1, expRes = 2;
        short actRes = Calculator.max(a, b);
        Assert.assertEquals(expRes, actRes);
    }

    @Test // 14
    public void maxTest14() {
        short a = 0, b = 1, expRes = 1;
        short actRes = Calculator.max(a, b);
        Assert.assertEquals(expRes, actRes);
    }

    @Test // 15
    public void minTest15() {
        long a = 5, b = 1, expRes = 1;
        long actRes = Calculator.min(a, b);
        Assert.assertEquals(expRes, actRes);
    }

    @Test // 16
    public void minTest16() {
        long a = 100500, b = -100500, expRes = -100500;
        long actRes = Calculator.min(a, b);
        Assert.assertEquals(expRes, actRes);
    }

    @Test // 17
    public void hypotenuseTest17() {
        double a = 3.0d, b = 4.0d, expRes = 5.0d;
        double actRes = Calculator.hypotenuse(a, b);
        Assert.assertEquals(expRes, actRes, 0);
    }

    @Test // 18
    public void hypotenuseTest18() {
        double a = 2.5d, b = 6.0d, expRes = 6.5d;
        double actRes = Calculator.hypotenuse(a, b);
        Assert.assertEquals(expRes, actRes, 0);
    }

    @Test // 19
    public void incrementTest19() {
        int a = 2, expRes = 3;
        int actRes = Calculator.increment(a);
        Assert.assertEquals(expRes, actRes);
    }

    @Test // 20
    public void incrementTest20() {
        int a = -1, expRes = 0;
        int actRes = Calculator.increment(a);
        Assert.assertEquals(expRes, actRes);
    }

}
