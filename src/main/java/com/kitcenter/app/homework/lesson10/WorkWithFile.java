package com.kitcenter.app.homework.lesson10;

import com.kitcenter.app.homework.lesson9.Palindrome;
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

    public void makePropertyFile(ArrayList<String> fileRows, String pathFile, String deleteWord) {
        ArrayList<String[]> newFileRows = new ArrayList();
        ArrayList<String> editFileRows = new ArrayList();

        if (fileRows.size() > 0) {
            newFileRows.add(fileRows.get(0).split("="));

            for (int i = 0; i < fileRows.size(); i++) {
                String[] keyValue = fileRows.get(i).split("=");

                for (int k = 0; k < newFileRows.size(); k++) {
                    if (newFileRows.get(k)[0].equals(keyValue[0])) {
                        if (keyValue[1].equals(deleteWord)) {
                            newFileRows.remove(k);
                            break;
                        } else {
                            newFileRows.set(k, keyValue);
                            break;
                        }
                    } else {
                        if (k == newFileRows.size() - 1) {
                            newFileRows.add(keyValue);
                        }
                    }
                }
            }
        }
        for (String[] el : newFileRows) {
            editFileRows.add(el[0] + "=" + el[1]);
        }
        fileHandler.writeFile(pathFile, editFileRows);
    }
}

