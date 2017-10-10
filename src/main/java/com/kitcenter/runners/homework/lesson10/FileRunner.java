package com.kitcenter.runners.homework.lesson10;

import com.kitcenter.app.homework.lesson10.FileHandler;
import com.kitcenter.app.homework.lesson10.WorkWithFile;
import com.kitcenter.runners.homework.general.Runner;

import java.util.ArrayList;
import java.util.Scanner;

public class FileRunner {

    Runner runner = new Runner();

    public static void main(String[] args) {
        Runner runner = new Runner();

        runner.description = "Program work with files. Choose subtask and enter number:\n" +
                "1 - Read file, sort arrays and write result into another file\n" +
                "2 - Read file that has words in column. Check palindromes and write them to another file\n" +
                "3 - Make file from user's data\n" +
                "4 - Make properties file. Duplicated data should be rewritten\n" +
                "0 - \"exit\"";

        mainMenu(runner);
    }

    public static void mainMenu(Runner runner) {
        WorkWithFile workWithFile = new WorkWithFile();
        FileHandler fileHandler = new FileHandler();
        String pathFileToRead, pathFileToWrite;
        ArrayList newFileRows = new ArrayList();
        StringBuffer newRowBuffer = new StringBuffer();
        String newRow = "";

        String menuItem = runner.showMenuGetText();

        switch (menuItem) {
            case "1":
                runner.subDescription = "Read file where each line has comma-separated array with numbers.\n" +
                        "Sort each array and write result to another file.";
                runner.showSubmenu();
                pathFileToRead = "src\\main\\resources\\lesson10\\10aInput.txt";
                pathFileToWrite = "src\\main\\resources\\lesson10\\10aOutput.txt";
                workWithFile.sortArray(pathFileToRead, pathFileToWrite);
                runner.showMessage("Input file is in: " + fileHandler.makeFilePath(pathFileToRead));
                runner.showMessage("Output file is in: " + fileHandler.makeFilePath(pathFileToWrite));

                mainMenu(runner);
                break;

            case "2":
                runner.subDescription = "Read file where each line has one word. Check words.\n" +
                        "If it is a palindrome mark them. Write result to another file.";
                runner.showSubmenu();
                pathFileToRead = "src\\main\\resources\\lesson10\\10bInput.txt";
                pathFileToWrite = "src\\main\\resources\\lesson10\\10bOutput.txt";
                workWithFile.isPalindrome(pathFileToRead, pathFileToWrite);
                runner.showMessage("Input file is in: " + fileHandler.makeFilePath(pathFileToRead));
                runner.showMessage("Output file is in: " + fileHandler.makeFilePath(pathFileToWrite));

                mainMenu(runner);
                break;

            case "3":
                runner.subDescription = "will be" +
                        " later";
                runner.showSubmenu();
                runner.showMessage("Enter file name");
                pathFileToWrite = "src\\main\\resources\\lesson10\\" + runner.getStringValue();

                runner.showMessage("Enter new line of file or \"exit\"");
                while (!newRow.equals("exit")) {
                    newRow = runner.getStringValue();
                    if (!newRow.equals("exit")) {
                        newFileRows.add(newRow);
                    }
                }
                workWithFile.makeUserFile(newFileRows, pathFileToWrite);
                runner.showMessage("Output file is in: " + fileHandler.makeFilePath(pathFileToWrite));

                mainMenu(runner);
                break;

            case "0":
                break;

            default:
                runner.showMessage(runner.incorrectChoice);
                mainMenu(runner);
        }

    }

    public String getProperty() {
        return runner.getStringValue();
    }

    public void showMsg(String text) {
        runner.showMessage(text);
    }

}
