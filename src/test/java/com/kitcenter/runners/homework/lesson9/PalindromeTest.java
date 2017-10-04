package com.kitcenter.runners.homework.lesson9;

import com.kitcenter.app.homework.lesson9.Palindrome;
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

public class PalindromeTest {
    private static final String PATH = "src/test/resources/lesson9/";
    Palindrome palindrome = new Palindrome();

    @Test
    @FileParameters(value = PATH + "palindrome.csv", mapper = CsvWithHeaderMapper.class)
    public void isPalindromeToCenterTest(String text, boolean expRes) {
        boolean actRes = palindrome.isPalindromeToCenter(text);
        Assert.assertEquals(expRes, actRes);
    }

    @Test
    @FileParameters(value = PATH + "palindrome.csv", mapper = CsvWithHeaderMapper.class)
    public void isPalindromeReverseTest(String text, boolean expRes) {
        boolean actRes = palindrome.isPalindromeReverse(text);
        Assert.assertEquals(expRes, actRes);
    }

    @Test
    @FileParameters(value = PATH + "palindrome.csv", mapper = CsvWithHeaderMapper.class)
    public void isPalindromeSemiWordTest(String text, boolean expRes) {
        boolean actRes = palindrome.isPalindromeSemiWord(text);
        Assert.assertEquals(expRes, actRes);
    }


}
