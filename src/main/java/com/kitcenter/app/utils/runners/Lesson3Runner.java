package com.kitcenter.app.utils.runners;

import com.kitcenter.app.utils.convertors.PrimitiveConvertor;

public class Lesson3Runner {
    public static void main(String[] args) {
        PrimitiveConvertor primitiveConvertor = new PrimitiveConvertor();

        primitiveConvertor.floatToChar();
        primitiveConvertor.intToChar();
        primitiveConvertor.charToInt();
    }
}
