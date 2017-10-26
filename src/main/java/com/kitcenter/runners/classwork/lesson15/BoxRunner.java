package com.kitcenter.runners.classwork.lesson15;

import com.kitcenter.app.classwork.lesson15.Box;

public class BoxRunner {
    public static void main(String[] args) {

        Box<Integer> integerBox = new Box<>();
        integerBox.set(new Integer(10));
        integerBox.inspect(21.0f);

    }
}
