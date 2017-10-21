package com.kitcenter.runners.classwork.lesson15;

import com.kitcenter.app.classwork.lesson15.BoxPrinter;

public class BoxPrinterRunner {
    public static void main(String[] args) {
        BoxPrinter<Integer> value1 =
                new BoxPrinter<Integer>(new Integer(10));
        System.out.println(value1);
        Integer intValue1 = value1.getValue();

        BoxPrinter<String> value2 =
                new BoxPrinter<String>("Hello world");
        System.out.println(value2);

        String intValue2 = value2.getValue();
    }
}
