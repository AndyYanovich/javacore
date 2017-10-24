package com.kitcenter.runners.homework.lesson14;

import com.kitcenter.app.homework.lesson14.Apartment;
import com.kitcenter.app.homework.lesson14.FootballClub;
import com.kitcenter.app.homework.lesson14.House;
import com.kitcenter.runners.homework.general.Runner;

import java.util.ArrayList;

public class ClubHouseRunner {
    public static void main(String[] args) {
        Runner runner = new Runner();
        runner.description = "Choose task:\n" +
                "1 - FootballClub\n" +
                "2 - Apartment\n" +
                "0 - exit";

        mainMenu(runner);
    }

    private static void mainMenu(Runner runner) {
        String menuItem = runner.showMenuGetText();
        switch (menuItem) {
            case "1":
                FootballClub polissya = new FootballClub(
                        "Polissya", "Zhytomyr", 3, 1, 8
                );

                FootballClub dynamo = new FootballClub(
                        "Dynamo (K)", "Kyiv", 7, 3, 1
                );

                showFootballClub(polissya, runner);
                runner.showMessage("--");
                showFootballClub(dynamo, runner);

                runner.waitEnterToBack();
                mainMenu(runner);
                break;

            case "2":
                House sweetHome = new House();

//                apartment 1
                Apartment apartment136 = new Apartment("#136", 100, 3);
                sweetHome.setApartment(apartment136);
                sweetHome.getApartment().addThing("armchair");
                sweetHome.getApartment().addThing("coffee table");
                sweetHome.getApartment().addThing("bottle of \"Jack Daniels\"");

                String apartmentDescription = makeApartmentDescription(
                        sweetHome.getApartment().getName(),
                        sweetHome.getApartment().getArea(),
                        sweetHome.getApartment().getRooms(),
                        sweetHome.getApartment().getThing()
                );
                runner.showMessage(apartmentDescription);

//                apartment 2
                Apartment apartment8 = new Apartment("#8", 16, 1);
                sweetHome.setApartment(apartment8);
                sweetHome.getApartment().addThing("stool");
                sweetHome.getApartment().addThing("stale bread");
                sweetHome.getApartment().addThing("bottle of vodka");
                sweetHome.getApartment().addThing("drunk body");

                apartmentDescription = makeApartmentDescription(
                        sweetHome.getApartment().getName(),
                        sweetHome.getApartment().getArea(),
                        sweetHome.getApartment().getRooms(),
                        sweetHome.getApartment().getThing()
                );
                runner.showMessage(apartmentDescription);

//                apartment 3
                Apartment apartmentPenthouse = new Apartment("\"penthouse\"", 738, 15);
                sweetHome.setApartment(apartmentPenthouse);
                sweetHome.getApartment().addThing("golden toilet bowl");
                sweetHome.getApartment().addThing("golden loaf");

                apartmentDescription = makeApartmentDescription(
                        sweetHome.getApartment().getName(),
                        sweetHome.getApartment().getArea(),
                        sweetHome.getApartment().getRooms(),
                        sweetHome.getApartment().getThing()
                );
                runner.showMessage(apartmentDescription);

                runner.waitEnterToBack();
                mainMenu(runner);
                break;

            case "0":
                break;

            default:
                runner.showMessage(runner.incorrectChoice);
                mainMenu(runner);
        }
    }

    private static void showFootballClub(FootballClub club, Runner runner) {
        runner.showMessageInLine("Club: ");
        club.showName();
        runner.showMessageInLine("Location: ");
        club.showLocation();
        club.showStatistic();
    }

    private static String makeApartmentDescription(String name, int area, int room, ArrayList<String> thing) {
        String res = "Apartment " + name + " has:\n" +
                "  area - " + area + "\n  room - " + room + "\n" +
                "  things: ";

        for (int i = 0; i < thing.size(); i++) {
            res += thing.get(i);

            if (i < thing.size() - 1) {
                if (i == thing.size() - 2) {
                    res += " and ";
                } else {
                    res += ", ";
                }
            } else {
                res += ".\n";
            }
        }
        return res;
    }
}
