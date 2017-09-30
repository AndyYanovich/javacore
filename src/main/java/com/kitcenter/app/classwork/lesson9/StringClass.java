package com.kitcenter.app.classwork.lesson9;

public class StringClass {

    public String concatValue(char[] chars) {
        String result = "";
        for (char el : chars) {
            result = result + el;
        }
        return result;
    }

    public int intToStringToWrapper(int number) {
        String text = String.valueOf(number);
        int intValue = Integer.valueOf(text) + 1;
        return intValue;
    }

    public double doubleToStringToWrapper(double number) {
        String text = String.valueOf(number);
        double doubleValue = Double.valueOf(text) + 0.5d;
        return doubleValue;
    }

    public long longToStringToWrapper(long number) {
        String text = String.valueOf(number);
        long longValue = Long.valueOf(text) + 1;
        return longValue;
    }

    public boolean booleanToStringToWrapper(boolean value) {
        String text = String.valueOf(value);
        boolean booleanValue = Boolean.valueOf(text);
        return booleanValue;
    }

    public String isPalindrome(String word) {
        String result = "It's palindrome.";
        for (int i = 0; i < (word.length() / 2); i++) {
            if (word.charAt(i) != word.charAt(word.length() - i - 1)) {
                result = "It's NOT palindrome.";
                break;
            }
        }
        return result;
    }

}
