package com.kitcenter.runners.classwork.lesson16;

import com.kitcenter.runners.homework.general.Runner;

import java.util.LinkedList;

public class LinkedListRunner {

    public static void main(String[] args) {
        Runner runner = new Runner();
        LinkedList<String> list = new LinkedList<>();

        runner.description = "Enter some value or \"exit\" for exit";
        runner.showMessage(runner.description);
        String newWord = "";
        while (!newWord.equals("exit")) {
            newWord = runner.getStringValue();

            if (!newWord.equals("exit"))
                list.add(newWord);
        }

        for (String el : list) {
            runner.showMessageInLine(el + " ");
        }

    }


}
