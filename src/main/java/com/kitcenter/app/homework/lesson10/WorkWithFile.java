package com.kitcenter.app.homework.lesson10;

import com.kitcenter.app.homework.lesson9.Palindrome;
import com.kitcenter.runners.homework.lesson10.FileRunner;

import java.util.ArrayList;

import static java.util.Arrays.sort;

public class WorkWithFile {

    FileHandler fileHandler = new FileHandler();

    public void sortArray(String pathFileRead, String pathFileWrite) {
        ArrayList newFileRows = new ArrayList();
        ArrayList oldFileRows = fileHandler.readFile(pathFileRead);

        for (Object el : oldFileRows) {
            String[] textArr = el.toString().split(",");
            int[] numArray = new int[textArr.length];
            for (int i = 0; i < textArr.length; i++) {
                numArray[i] = Integer.parseInt(textArr[i]);
            }
            sort(numArray);
            String newRow = "";
            for (int number : numArray) {
                newRow += number + " ";
            }
            newFileRows.add(newRow.trim().replace(" ", ","));
        }
        fileHandler.writeFile(pathFileWrite, newFileRows);
    }

    public void isPalindrome(String pathFileRead, String pathFileWrite) {
        Palindrome palindrome = new Palindrome();
        ArrayList newFileRows = new ArrayList();
        ArrayList oldFileRows = fileHandler.readFile(pathFileRead);
        String textEl;

        for (Object el : oldFileRows) {
            textEl = el.toString();
            if (palindrome.isPalindromeReverse(textEl)) {
                textEl += " is palindrome";
            }
            newFileRows.add(textEl);
        }
        fileHandler.writeFile(pathFileWrite, newFileRows);
    }

    public void makeUserFile(ArrayList newFileRows, String pathFileWrite) {

        fileHandler.writeFile(pathFileWrite, newFileRows);
    }


}

