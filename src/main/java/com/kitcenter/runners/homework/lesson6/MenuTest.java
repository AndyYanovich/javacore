package com.kitcenter.runners.homework.lesson6;

import com.kitcenter.app.homework.lesson6.RightAngledTriangle;
import org.junit.Assert;
import org.junit.Test;

public class MenuTest {
    RightAngledTriangle rightAngledTriangle = new RightAngledTriangle();

    @Test // Number
    public void checkHypotenuse1() {
        int a = 1, b = 1, c = 5;
        String expRes = "It's not a triangle!!!";
        String actRes = rightAngledTriangle.checkHypotenuse(a, b, c);
        Assert.assertEquals(expRes, actRes);
    }

    @Test // Number
    public void checkHypotenuse2() {
        int a = 3, b = 3, c = 5;
        String expRes = "It's not a right-angle triangle!!!";
        String actRes = rightAngledTriangle.checkHypotenuse(a, b, c);
        Assert.assertEquals(expRes, actRes);
    }

    @Test // Number
    public void checkHypotenuse3() {
        int a = 3, b = 4, c = 5;
        String expRes = "It's a right-angle triangle!!!";
        String actRes = rightAngledTriangle.checkHypotenuse(a, b, c);
        Assert.assertEquals(expRes, actRes);
    }

//    @Test // Number
//    public void checkSides1() {
//        int a = 3, b = 4, c=5;
//        String expRes = "It's a right-angle triangle!!!";
//        String actRes = rightAngledTriangle.checkSides();
//        Assert.assertEquals(expRes, actRes);
//    }

}
