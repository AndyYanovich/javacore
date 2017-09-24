package com.kitcenter.runners.homework.lesson6;

import com.kitcenter.app.homework.lesson6.EvenOrOdd;
import org.junit.Assert;
import org.junit.Test;

public class EvenOrOddTest {
    EvenOrOdd evenOrOdd = new EvenOrOdd();

    @Test
    public void checkNumberTest1() {
        int a = 5;
        String expRes = "It was odd number";
        String actRes = evenOrOdd.checkNumber(a);
        Assert.assertEquals(expRes, actRes);
    }

    @Test
    public void checkNumberTest2() {
        int a = -5;
        String expRes = "It was odd number";
        String actRes = evenOrOdd.checkNumber(a);
        Assert.assertEquals(expRes, actRes);
    }

    @Test
    public void checkNumberTest3() {
        int a = 2;
        String expRes = "It was even number";
        String actRes = evenOrOdd.checkNumber(a);
        Assert.assertEquals(expRes, actRes);
    }

    @Test
    public void checkNumberTest4() {
        int a = -2;
        String expRes = "It was even number";
        String actRes = evenOrOdd.checkNumber(a);
        Assert.assertEquals(expRes, actRes);
    }

    @Test
    public void checkNumberTest5() {
        int a = 0;
        String expRes = "It was even number";
        String actRes = evenOrOdd.checkNumber(a);
        Assert.assertEquals(expRes, actRes);
    }


}
