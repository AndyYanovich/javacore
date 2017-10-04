package com.kitcenter.runners.classwork.lesson10;

public class StringMethods {
    public static void main(String[] args) {
        String name = "Andy";
        System.out.println("Andy".equals(name));

        name = "Andy,Vasya,Petya";
        String[] nn = name.split(",");
        System.out.println(nn[0] + nn[1]);

        name = "Andy,Vasya,Petya";
        name = name.replace(",", " ");
        System.out.println(name);

        int newName = name.codePointAt(0);
        System.out.println(newName);
    }
}
