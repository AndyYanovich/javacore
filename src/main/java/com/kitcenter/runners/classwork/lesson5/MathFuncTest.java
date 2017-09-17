package com.kitcenter.runners.classwork.lesson5;

import com.kitcenter.app.classwork.lesson5.MathFunc;
import junit.framework.Assert;
import org.junit.jupiter.api.Test;

//import static org.junit.jupiter.api.Assertions.assertEquals;

public class MathFuncTest {
    @Test // JUnit framework annotation
    public void multiplyTest() {
        int a = 1, b = 2, expRes = 3;
        int actRes = MathFunc.multiply(a, b);
        Assert.assertEquals(expRes, actRes);
//        assertEquals(expRes, actRes);
    }
}
