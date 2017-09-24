package com.kitcenter.runners.homework.lesson6;

import com.kitcenter.app.homework.lesson6.RightAngledTriangle;
import org.junit.Assert;
import org.junit.Test;

public class RightAngledTriangleTest {
    RightAngledTriangle rightAngledTriangle = new RightAngledTriangle();

    @Test
    public void checkTriangleCorrect() {
        int a = 3, b = 4, c = 5;
        String expRes = "right-angle triangle";
        String actRes = rightAngledTriangle.checkTriangle(a, b, c);
        Assert.assertEquals(expRes, actRes);
    }

    @Test
    public void checkTriangleNotRightAngled1() {
        int a = 4, b = 4, c = 4;
        String expRes = "not right-angle triangle";
        String actRes = rightAngledTriangle.checkTriangle(a, b, c);
        Assert.assertEquals(expRes, actRes);
    }

    @Test
    public void checkTriangleNotRightAngled2() {
        int a = 8, b = 8, c = 10;
        String expRes = "not right-angle triangle";
        String actRes = rightAngledTriangle.checkTriangle(a, b, c);
        Assert.assertEquals(expRes, actRes);
    }

    @Test
    public void checkTriangleNotTriangle1() {
        int a = 3, b = 4, c = 7;
        String expRes = "not a triangle";
        String actRes = rightAngledTriangle.checkTriangle(a, b, c);
        Assert.assertEquals(expRes, actRes);
    }

    @Test
    public void checkTriangleNotTriangle2() {
        int a = 3, b = 40, c = 5;
        String expRes = "not a triangle";
        String actRes = rightAngledTriangle.checkTriangle(a, b, c);
        Assert.assertEquals(expRes, actRes);
    }

    @Test
    public void checkTriangleNotTriangle3() {
        int a = 0, b = 4, c = 5;
        String expRes = "not a triangle";
        String actRes = rightAngledTriangle.checkTriangle(a, b, c);
        Assert.assertEquals(expRes, actRes);
    }

    @Test
    public void checkTriangleNotTriangle4() {
        int a = 3, b = 4, c = -5;
        String expRes = "not a triangle";
        String actRes = rightAngledTriangle.checkTriangle(a, b, c);
        Assert.assertEquals(expRes, actRes);
    }

    @Test
    public void checkTriangleNotTriangle5() {
        int a = -3, b = -4, c = -5;
        String expRes = "not a triangle";
        String actRes = rightAngledTriangle.checkTriangle(a, b, c);
        Assert.assertEquals(expRes, actRes);
    }

    @Test
    public void checkTriangleNotTriangle6() {
        int a = 3, b = -4, c = 0;
        String expRes = "not a triangle";
        String actRes = rightAngledTriangle.checkTriangle(a, b, c);
        Assert.assertEquals(expRes, actRes);
    }
}
