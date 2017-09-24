package com.kitcenter.app.homework.lesson6;

public class RightAngledTriangle {

    public String checkTriangle(int side1, int side2, int side3) {
        String result;

        if (side1 > side2 && side1 > side3) {
            result = this.checkHypotenuse(side2, side3, side1);
        } else if (side2 > side1 && side2 > side3) {
            result = this.checkHypotenuse(side1, side3, side2);
        } else {
            result = this.checkHypotenuse(side1, side2, side3);
        }
        return result;
    }

    public String checkHypotenuse(int a, int b, int c) {
        String res = "not right-angle triangle";
        if (c >= a + b || a <= 0 || b <= 0 || c <= 0) {
            res = "not a triangle";
        } else if (c * c == a * a + b * b) {
            res = "right-angle triangle";
        }
        return res;
    }
}
