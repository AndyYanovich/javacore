package com.kitcenter.runners.classwork.lesson11;

public class SystemPropertyRunner {
    public static void main(String[] args) {
        String dir = System.getProperty("dir");
        System.out.println(dir);
    }
}
