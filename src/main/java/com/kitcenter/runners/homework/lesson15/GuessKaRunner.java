package com.kitcenter.runners.homework.lesson15;

import com.kitcenter.app.homework.lesson15.FamousPerson;
import com.kitcenter.runners.homework.general.Runner;

import java.util.ArrayList;

public class GuessKaRunner extends Runner {
    public static void main(String[] args) {
        Runner runner = new Runner();
        boolean resultGame;
        String refuseGame = "You gave up!";

        ArrayList personList = new ArrayList();
        for (FamousPerson person : FamousPerson.values()) {
            personList.add(person);
        }

        runner.description = "Play in enthralling game \"Ugadaika\".\n" +
                "You should give answers about famous ukrainians.\n" +
                "Select difficulty level:\n" +
                "1 - cheat (Shown all information)\n" +
                "2 - easy (Shown full name and age)\n" +
                "3 - normal (Shown just full name)\n" +
                "0 - exit";

        String levelItem = runner.getStringValue();

        switch (levelItem) {
            case "1":
                resultGame = game.cheat(personList);
                break;
            case "2":
                resultGame = game.easy(personList);
                break;
            case "3":
                resultGame = game.hard(personList);
                break;
            case "0":
                runner.showMessage(refuseGame);
                break;
            default:

        }

    }
}
//создать массив объектов personArray
//спросить поль-ля про уровень сложности (вывести описание)
//выбрать рандомную запись, создать ее копию, запись удалить из массива
//вывести фио
//принять возраст или возраст/живость
//обработать значение(я)
//если угадал correctAnswer++
//если correctAnswer == 3 сказать пользователю что выиграл
//если массив == 0 сказать пользователю что проиграл
//
//cheat(all field), easy, h
//easy
//hard
//deathmatch
