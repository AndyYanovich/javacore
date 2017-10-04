package com.kitcenter.app.homework.lesson9;

public class Palindrome {
    public boolean isPalindromeToCenter(String word) {
        boolean result = true;
        word = word.toLowerCase();
        for (int i = 0; i < word.length(); i++) {

            if (word.charAt(i) != word.charAt(word.length() - i - 1)) {
                result = false;
                break;
            }
        }
        return result;
    }

    public boolean isPalindromeReverse(String word) {
        word = word.toLowerCase();
        String newWord = "";
        for (int i = word.length() - 1; i >= 0; i--) {
            newWord += word.charAt(i);
        }
        boolean result = word.equals(newWord) ? true : false;

        return result;
    }

    public boolean isPalindromeSemiWord(String word) {
        word = word.toLowerCase();
        StringBuffer word1 = new StringBuffer(word);
        StringBuffer word2 = new StringBuffer(word);

        String semiWord1 = word1.delete(word.length() / 2, word.length()).toString();
        String semiWord2 = word2.reverse().delete(word.length() / 2, word.length()).toString();

        boolean result = semiWord1.equals(semiWord2) ? true : false;

        return result;
    }
}
