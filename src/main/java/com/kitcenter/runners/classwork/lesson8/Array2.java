package com.kitcenter.runners.classwork.lesson8;


public class Array2 {
    public static void main(String[] args) {

        int[][] intArray = new int[3][4];
        for (int j = 0; j < intArray.length; j++) {

            for (int k = 0; k < intArray[j].length; k++) {
                intArray[j][k] = (j + 1) * (1 + k);
                System.out.print(intArray[j][k]);
                isChecked(j);
            }
            System.out.println("");
        }

    }

    public static boolean isChecked(int i) {
        if (i < 1) {
            return true;
        } else {
            return false;
        }
    }
}
