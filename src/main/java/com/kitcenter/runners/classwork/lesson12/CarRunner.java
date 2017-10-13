package com.kitcenter.runners.classwork.lesson12;

import com.kitcenter.app.classwork.lesson12.Car;
import com.kitcenter.app.classwork.lesson12.Engine;

public class CarRunner {
    public static void main(String[] args) {
        Engine v8 = new Engine("V8");
        Car mitsubishi = new Car();
        mitsubishi.setEngine(v8);

        System.out.println(mitsubishi.getEngine().getName());
    }
}
