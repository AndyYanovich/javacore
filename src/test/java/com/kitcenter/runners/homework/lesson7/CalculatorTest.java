package com.kitcenter.runners.homework.lesson7;

import com.kitcenter.app.homework.lesson5.Calculator;
import junitparams.FileParameters;
import junitparams.JUnitParamsRunner;
import junitparams.mappers.CsvWithHeaderMapper;
import org.junit.Assert;
import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.MethodSorters;

@RunWith(JUnitParamsRunner.class)
@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class CalculatorTest {
    private static final String PATH = "src/test/resources/calculator/";

    @Test // 1
    @FileParameters(value = PATH + "plus.csv", mapper = CsvWithHeaderMapper.class)
    public void plusTest(int argA, int argB, int expRes) {
        int actRes = Calculator.plus(argA, argB);
        Assert.assertEquals(expRes, actRes);
    }

    @Test // 2
    @FileParameters(value = PATH + "minus.csv", mapper = CsvWithHeaderMapper.class)
    public void minusTest(byte argA, byte argB, byte expRes) {
        byte actRes = Calculator.minus(argA, argB);
        Assert.assertEquals(expRes, actRes);
    }

    @Test // 3
    @FileParameters(value = PATH + "multiply.csv", mapper = CsvWithHeaderMapper.class)
    public void multiplyTest(int argA, int argB, int expRes) {
        int actRes = Calculator.multiply(argA, argB);
        Assert.assertEquals(expRes, actRes);
    }

    @Test // 4
    @FileParameters(value = PATH + "divide.csv", mapper = CsvWithHeaderMapper.class)
    public void divideTest(float argA, float argB, float expRes) {
        float actRes = Calculator.divide(argA, argB);
        Assert.assertEquals(expRes, actRes, 0);
    }

    @Test // 5
    @FileParameters(value = PATH + "squareroot.csv", mapper = CsvWithHeaderMapper.class)
    public void squareRootTest(double argA, double expRes) {
        double actRes = Calculator.squareRoot(argA);
        Assert.assertEquals(expRes, actRes, 0);
    }

    @Test // 6
    @FileParameters(value = PATH + "copysign.csv", mapper = CsvWithHeaderMapper.class)
    public void copySignTest(float argA, float argB, float expRes) {
        float actRes = Calculator.copySign(argA, argB);
        Assert.assertEquals(expRes, actRes, 0);
    }

    @Test // 7
    @FileParameters(value = PATH + "max.csv", mapper = CsvWithHeaderMapper.class)
    public void maxTest(short argA, short argB, short expRes) {
        short actRes = Calculator.max(argA, argB);
        Assert.assertEquals(expRes, actRes);
    }

    @Test // 8
    @FileParameters(value = PATH + "min.csv", mapper = CsvWithHeaderMapper.class)
    public void minTest(long argA, long argB, long expRes) {
        long actRes = Calculator.min(argA, argB);
        Assert.assertEquals(expRes, actRes);
    }

    @Test // 9
    @FileParameters(value = PATH + "hypotenuse.csv", mapper = CsvWithHeaderMapper.class)
    public void hypotenuseTest(double argA, double argB, double expRes) {
        double actRes = Calculator.hypotenuse(argA, argB);
        Assert.assertEquals(expRes, actRes, 0);
    }

    @Test // 10
    @FileParameters(value = PATH + "increment.csv", mapper = CsvWithHeaderMapper.class)
    public void incrementTest(int argA, int expRes) {
        int actRes = Calculator.increment(argA);
        Assert.assertEquals(expRes, actRes);
    }
}