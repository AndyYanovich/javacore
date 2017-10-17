package com.kitcenter.runners.homework.lesson12;

import com.kitcenter.app.homework.lesson12.BicycleWithRing;
import com.kitcenter.app.homework.lesson12.CustomBicycle;

public class BicycleRunner {
    public static void main(String[] args) {
        BicycleWithRing bicycleWithRing = new BicycleWithRing(20, 5);
        CustomBicycle customBicycle = new CustomBicycle(30, 20);

        System.out.println("Call bicycleWithRing.ring()");
        bicycleWithRing.ring();

        System.out.println("\nCall customBicycle.setGear()");
        customBicycle.setGear(15);
        System.out.println("\nCall customBicycle.ride()");
        customBicycle.ride();
    }

}
