package com.kitcenter.runners.classwork.lesson8;

import com.kitcenter.app.classwork.lesson8.Array;

import java.util.Arrays;

public class ArrayRunner {
    public static void main(String[] args) {
        Array array = new Array();
        int c[] = array.c;
        int a[] = array.a;

        a[0] = 10;

        for (int i = 0; i < c.length; i++) {
            c[i] = i;
            System.out.println(c[i]);
        }

        for (int arrElement : c) {
            System.out.println("- " + arrElement);
        }

        System.out.println(a[0]);
        System.out.println(array.b[0]);
        System.out.println(array.bool[0]);
        System.out.println(Arrays.toString(c));
    }
}
