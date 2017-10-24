package com.kitcenter.app.homework.lesson14;

public abstract class SportsClub {
    protected String name, location;

    public SportsClub(String name, String location) {
        this.name = name;
        this.location = location;
    }

    abstract int wins();

    abstract int draws();

    abstract int defeats();

    public void showName() {
        System.out.println(name);
    }

    public void showLocation() {
        System.out.println(location);
    }

    public void showStatistic() {
        String text = "Statistics about games:\n" +
                "  Total - " + (wins() + draws() + defeats()) + ",\n" +
                "  wins - " + wins() + ",\n" +
                "  draws - " + draws() + ",\n" +
                "  defeats - " + defeats() + ",\n";
        System.out.print(text);
    }
}