package com.kitcenter.runners.classwork.lesson14;

import com.kitcenter.app.classwork.lesson12.Car;

public class Runner {
    public static void main(String[] args) {
        Object car = new Car();
        Car car1 = new Car();
        Object objCar1 = car1;
        car1 = (Car) objCar1;
    }
}
