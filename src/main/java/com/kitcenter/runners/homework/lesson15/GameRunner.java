package com.kitcenter.runners.homework.lesson15;

import com.kitcenter.app.homework.lesson15.FamousPerson;
import com.kitcenter.runners.homework.general.Runner;

import java.util.ArrayList;

public class GameRunner {

    public static void main(String[] args) {
        Runner runner = new Runner();
        int maxCorrectAnswer = 3;

        runner.description = "Play in enthralling game \"Ugadaika\".\n" +
                "You should give answers about famous ukrainians.\n" +
                "Select difficulty level:\n" +
                "1 - cheat (Shown all information)\n" +
                "2 - easy (Shown full name and age)\n" +
                "3 - normal (Shown just full name)\n" +
                "0 - exit";
        runner.showMessage(runner.description);

        int difficultyLevel = runner.getIntValue(1, 3);

        ArrayList<String> peopleList = new ArrayList<>();
        for (FamousPerson person : FamousPerson.values()) {
            peopleList.add(person.toString());
        }

        runner.showMessage("Enter number and y/n through a space. e.g. \"24 y\"");
        isGuessPerson(peopleList, maxCorrectAnswer, difficultyLevel, runner);
    }

    public static void isGuessPerson(ArrayList<String> list, int corAnswersLeft, int complexity, Runner r) {

        int curPersonId = (int) (Math.random()*list.size()-1);

        if (list.size() > 0) {
            String name = FamousPerson.valueOf(list.get(curPersonId)).getName();
            String age = String.valueOf(FamousPerson.valueOf(list.get(curPersonId)).getAge());
            String alive = FamousPerson.valueOf(list.get(curPersonId)).isAlive() ? "alive" : "dead";

            list.remove(curPersonId);

            r.subDescription = "How old is a person and is he(she) alive?";
            r.subDescription = "How old is a " + name;

            switch (complexity) {
                case 1 :
                    r.subDescription += " (" + age + " years, " + alive + ")";
                    break;
                case 2 :
                    r.subDescription += " (" + age + " years)";
                    break;
                default :
                    break;
            }
            r.subDescription += " and is he(she) alive?";
            r.showSubmenu();


            String [] playerAnswer = r.getStringValue().split(" ");
            playerAnswer[1] = playerAnswer[1].equals("y") ? "alive" : "dead";

            if(age.equals(playerAnswer[0]) && alive.equals(playerAnswer[1])) {
                corAnswersLeft--;
                r.showMessage("Good!");
            }

            if (corAnswersLeft == 0) {
                r.showMessage("You won!!!");
            } else {
                isGuessPerson( list, corAnswersLeft, complexity, r);
            }
        } else {
            r.showMessage("You lose!");
        }
    }
}

