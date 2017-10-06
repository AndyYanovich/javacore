package com.kitcenter.runners.homework.lesson9;

import com.kitcenter.app.homework.lesson9.Palindrome;
import com.kitcenter.runners.homework.general.Runner;

public class PalindromeRunner9 {

    public static void main(String[] args) {
        Runner runner = new Runner();
        runner.description = "Lesson 9.\n";
        runner.description += "The program determine palindromes.";
        runner.description += " You should choose one of 3 methods\n";
        runner.description += "Input 1, 2, 3 for run subprogram or 0 for exit";

        mainMenu(runner);
    }

    public static void mainMenu(Runner runner) {
        Palindrome palindrome = new Palindrome();
        String inputValue = "", result = "";
        String positiveRes = " - is palindrome!";
        String negativeRes = " - is NOT palindrome!";

        String menuItem = runner.showMenuGetText();
        switch (menuItem) {
            case "1":
                runner.subDescription = "Method check each element from the borders to center\n";
                runner.subDescription += "Input any word";
                inputValue = runner.showSubmenuGetText();
                result = palindrome.isPalindromeToCenter(inputValue) == true
                        ? inputValue + positiveRes
                        : inputValue + negativeRes;
                runner.showMessage(result);
                mainMenu(runner);
                break;
            case "2":
                runner.subDescription = "Method revert text and check with original text\n";
                runner.subDescription += "Input any word";
                inputValue = runner.showSubmenuGetText();
                result = palindrome.isPalindromeReverse(inputValue) == true
                        ? inputValue + positiveRes
                        : inputValue + negativeRes;
                runner.showMessage(result);
                mainMenu(runner);
                break;
            case "3":
                runner.subDescription = "Method revert second half of text and check with first part text\n";
                runner.subDescription += "Input any word";
                inputValue = runner.showSubmenuGetText();
                result = palindrome.isPalindromeSemiWord(inputValue) == true
                        ? inputValue + positiveRes
                        : inputValue + negativeRes;
                runner.showMessage(result);
                mainMenu(runner);
                break;
            case "0":
                break;
            default:
                runner.showMessage(runner.incorrectChoice);
                mainMenu(runner);
                break;
        }
    }
}