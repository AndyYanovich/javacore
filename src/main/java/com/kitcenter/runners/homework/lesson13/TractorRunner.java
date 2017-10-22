package com.kitcenter.runners.homework.lesson13;

import com.kitcenter.app.homework.lesson13.Crawler;
import com.kitcenter.app.homework.lesson13.Tractor;
import com.kitcenter.app.homework.lesson13.Wheeled;

public class TractorRunner {
    public static void main(String[] args) {
        Wheeled belarus82 = new Wheeled("Belarus-82.1", 240, 6000, 2, 4);
        Crawler dt75 = new Crawler("DT-75", 180, 7400, 15);

        showTractors(belarus82);
        showTractors(dt75);
    }

    public static void showTractors(Tractor tractor) {
        System.out.print("Tractor ");
        tractor.printName();
        System.out.print("speed - ");
        tractor.getSpeed();
        System.out.print("weight - ");
        tractor.getWeight();
        System.out.print("passengers - ");
        tractor.getPassengers();
        System.out.print("wheels - ");
        tractor.getWheels();
        System.out.println("-----");
    }
}
