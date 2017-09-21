package com.kitcenter.app.homework.lesson6;

public class RightAngledTriangle {
    public static String description = "--\nEnter size of triangle's sides. Program will determine right-angled triangle or no.";

    InputData side = new InputData();

    public void checkSides() {
        int side1, side2, side3;
        String result;

        side1 = side.valueMoreZero("Enter size of 1st side ");
        side2 = side.valueMoreZero("Enter size of 2nd side ");
        side3 = side.valueMoreZero("Enter size of 3rd side ");

        if (side1 > side2 && side1 > side3) {
            result = this.checkHypotenuse(side2, side3, side1);
        } else if (side2 > side1 && side2 > side3) {
            result = this.checkHypotenuse(side1, side3, side2);
        } else {
            result = this.checkHypotenuse(side1, side2, side3);
        }
        System.out.println(result);
    }

    public String checkHypotenuse(int a, int b, int c) {
        String res = "It's not a right-angle triangle!!!";
        if (c >= a + b) {
            res = "It's not a triangle!!!";
        } else if (c * c == a * a + b * b) {
            res = "It's a right-angle triangle!!!";
        }
        return res;
    }

}
