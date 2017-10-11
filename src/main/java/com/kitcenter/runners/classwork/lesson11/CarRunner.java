package com.kitcenter.runners.classwork.lesson11;

import com.kitcenter.app.classwork.lesson11.Car;

public class CarRunner {

    public static void main(String[] args) {

        Car zaporozhec = new Car(12, 500.00f, 65);
        System.out.println("zaporozhec do " + zaporozhec.ride());

        Car ferarri = new Car();
        System.out.println("ferarri do " + ferarri.ride());

        Car bmw = new Car(80000f, "black");
        System.out.println("bmw do " + bmw.ride());

    }

}
