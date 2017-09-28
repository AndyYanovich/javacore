package com.kitcenter.runners.classwork.lesson5;

import com.kitcenter.app.classwork.lesson5.MathFunc;
import org.junit.Assert;
import org.junit.Ignore;
import org.junit.Test;

public class MathFuncTest {
    @Test(timeout = 1000) // JUnit framework annotation
    public void multiplyTest() {
        int a = 1, b = 2, expRes = 2;
        int actRes = MathFunc.multiply(a, b);
        Assert.assertEquals(expRes, actRes);
    }

    @Ignore
    @Test(timeout = 1000)
    public void incorrectTest() {
        while (true) ;
    }

    @Test(timeout = 1000)
    public void incorrectTest2() {
    }

    @Test(timeout = 1000) // JUnit framework annotation
    public void multiplyTest2() {
        int a = 2, b = 2, expRes = 4;
        int actRes = MathFunc.multiply(a, b);
        Assert.assertEquals(expRes, actRes);
    }


}
