package com.kitcenter.runners.homework.lesson6;

import com.kitcenter.app.homework.lesson6.BiggerNumber;
import org.junit.Assert;
import org.junit.Test;

public class BiggerNumberTest {
    BiggerNumber biggerNumber = new BiggerNumber();

    @Test
    public void findBiggerNumberTest1() {
        int a = 5, b = 2;
        String expRes = "Number #1 is bigger";
        String actRes = biggerNumber.findBiggerNumber(a, b);
        Assert.assertEquals(expRes, actRes);
    }

    @Test
    public void findBiggerNumberTest2() {
        int a = 2, b = -5;
        String expRes = "Number #1 is bigger";
        String actRes = biggerNumber.findBiggerNumber(a, b);
        Assert.assertEquals(expRes, actRes);
    }

    @Test
    public void findBiggerNumberTest3() {
        int a = 0, b = -2;
        String expRes = "Number #1 is bigger";
        String actRes = biggerNumber.findBiggerNumber(a, b);
        Assert.assertEquals(expRes, actRes);
    }

    @Test
    public void findBiggerNumberTest4() {
        int a = 2, b = 5;
        String expRes = "Number #2 is bigger";
        String actRes = biggerNumber.findBiggerNumber(a, b);
        Assert.assertEquals(expRes, actRes);
    }

    @Test
    public void findBiggerNumberTest5() {
        int a = -5, b = 2;
        String expRes = "Number #2 is bigger";
        String actRes = biggerNumber.findBiggerNumber(a, b);
        Assert.assertEquals(expRes, actRes);
    }

    @Test
    public void findBiggerNumberTest6() {
        int a = -2, b = 0;
        String expRes = "Number #2 is bigger";
        String actRes = biggerNumber.findBiggerNumber(a, b);
        Assert.assertEquals(expRes, actRes);
    }

    @Test
    public void findBiggerNumberTest7() {
        int a = 2, b = 2;
        String expRes = "The numbers are the same";
        String actRes = biggerNumber.findBiggerNumber(a, b);
        Assert.assertEquals(expRes, actRes);
    }

    @Test
    public void findBiggerNumberTest8() {
        int a = -5, b = -5;
        String expRes = "The numbers are the same";
        String actRes = biggerNumber.findBiggerNumber(a, b);
        Assert.assertEquals(expRes, actRes);
    }

    @Test
    public void findBiggerNumberTest9() {
        int a = 0, b = 0;
        String expRes = "The numbers are the same";
        String actRes = biggerNumber.findBiggerNumber(a, b);
        Assert.assertEquals(expRes, actRes);
    }


}
