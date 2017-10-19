package com.kitcenter.runners.classwork.lesson14;

import com.kitcenter.app.classwork.lesson14.ACMEBicycle;
import com.kitcenter.app.classwork.lesson14.Bicycle;

public class ExecuteMe {
    public static void main(String args[]) {

        Bicycle bicycle = new ACMEBicycle();
        bicycle.changeCadence(5);

        ACMEBicycle acmeBicycle = new ACMEBicycle();
        acmeBicycle.changeSpeed(300);
        acmeBicycle.changeGear(48);
        acmeBicycle.printStates();
    }
}
