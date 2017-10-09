package com.kitcenter.runners.homework.lesson4;

import com.kitcenter.app.homework.lesson4.PrimitiveConvertor;
import org.junit.Assert;
import org.junit.Test;

public class PrimitiveConvertorTest {

    PrimitiveConvertor convertor = new PrimitiveConvertor();

    @Test
    public void floatToCharTest() {
        float a = 55.0f;
        char expRes = 55;
        char actRes = convertor.floatToChar(a);
        Assert.assertEquals(expRes, actRes);
    }

    @Test
    public void intToCharTest() {
        int a = 55;
        char expRes = 55;
        char actRes = convertor.intToChar(a);
        Assert.assertEquals(expRes, actRes);
    }

    @Test
    public void charToIntTest() {
        char a = 55;
        int expRes = 55;
        int actRes = convertor.charToInt(a);
        Assert.assertEquals(expRes, actRes);
    }
}
