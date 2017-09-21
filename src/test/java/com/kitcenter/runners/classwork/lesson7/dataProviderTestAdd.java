package com.kitcenter.runners.classwork.lesson7;

import com.kitcenter.app.classwork.lesson7.Calculator;
import junitparams.FileParameters;
import junitparams.JUnitParamsRunner;
import junitparams.mappers.CsvWithHeaderMapper;
import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;

@RunWith(JUnitParamsRunner.class)
public class dataProviderTestAdd {
    @Test
    @FileParameters(value = "src/test/resources/testdata.csv", mapper = CsvWithHeaderMapper.class)
    public void dataProviderTestAdd(int argA, int argB, int expRes) {
        int actRes = Calculator.multiply(argA, argB);
        Assert.assertEquals(expRes, actRes);
    }
}
