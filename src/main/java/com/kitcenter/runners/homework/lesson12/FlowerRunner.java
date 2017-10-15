package com.kitcenter.runners.homework.lesson12;

import com.kitcenter.app.homework.lesson12.Flower;
import com.kitcenter.runners.homework.general.Runner;

public class FlowerRunner {
    public static void main(String[] args) {
        String result = "";
        Runner runner = new Runner();
        runner.description = "You have 4 flowers' type:\n" +
                "1 - rose\n" +
                "2 - carnation\n" +
                "3 - tulip\n" +
                "4 - chamomile\n" +
                "Enter the number of flowers using a space as separator.\n" +
                "(For example: \"1 3 1\" - 2 roses + 1 tulip)";
        String flowers = runner.showMenuGetText();

        Flower rose = new Flower("Rose", 100);
        Flower carnation = new Flower("Carnation", 50);
        Flower tulip = new Flower("Tulip", 20);
        Flower chamomile = new Flower("Chamomile", 5);

        String[] bouquet = flowers.split(" ");

        int sum = 0;
        boolean unknownFlower = false;
        for (String flower : bouquet) {
            switch (flower) {
                case "1":
                    sum += rose.getPrice();
                    break;
                case "2":
                    sum += carnation.getPrice();
                    break;
                case "3":
                    sum += tulip.getPrice();
                    break;
                case "4":
                    sum += chamomile.getPrice();
                    break;
                default:
                    unknownFlower = true;
            }
        }
        System.out.print("The bouquet costs ฿" + sum + ".");
        if (unknownFlower) {
            System.out.print(" One or some flowers are unknown.");
        }
    }
}
