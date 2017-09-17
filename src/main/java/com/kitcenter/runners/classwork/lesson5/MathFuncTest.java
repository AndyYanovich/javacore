package com.kitcenter.runners.classwork.lesson5;

import com.kitcenter.app.classwork.lesson5.MathFunc;
import org.junit.Assert;
import org.junit.Test;

//import static org.junit.jupiter.api.Assertions.assertEquals;

public class MathFuncTest {
    @Test // JUnit framework annotation
    public void multiplyTest() {
        int a = 1, b = 2, expRes = 2;
        int actRes = MathFunc.multiply(a, b);
        Assert.assertEquals(expRes, actRes);
    }
}
