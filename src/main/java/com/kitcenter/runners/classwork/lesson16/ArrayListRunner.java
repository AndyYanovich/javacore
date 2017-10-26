package com.kitcenter.runners.classwork.lesson16;

import java.util.ArrayList;

public class ArrayListRunner {
    public static void main(String[] args) {
        ArrayList<String> myList = new ArrayList<String>();

        String string1 = "abc";
        myList.add(string1);
        String string2 = "bcd";
        myList.add(string2);
        int theSize = myList.size();

        System.out.println(myList);
        System.out.println(theSize);
        System.out.println(myList.isEmpty());
        System.out.println(myList.get(0));
        System.out.println(myList.indexOf("bcd"));
        System.out.println(myList.add("eee"));
        System.out.println(myList.add("eee1"));
        System.out.println(myList);
        System.out.println(myList.remove("eee"));
        System.out.println(myList);
        System.out.println(myList.remove(2));
        System.out.println(myList);
        System.out.println(myList.contains(string1));
    }
}
