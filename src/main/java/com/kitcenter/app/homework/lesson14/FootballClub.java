package com.kitcenter.app.homework.lesson14;

public class FootballClub extends SportsClub {
    private int win, draws, defeats;

    public FootballClub(String name, String location, int win, int draws, int defeats) {
        super(name, location);
        this.win = win;
        this.draws = draws;
        this.defeats = defeats;
    }

    @Override
    int wins() {
        return win;
    }

    @Override
    int draws() {
        return draws;
    }

    @Override
    int defeats() {
        return defeats;
    }
}
